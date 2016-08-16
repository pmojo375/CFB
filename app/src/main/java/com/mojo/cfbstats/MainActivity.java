package com.mojo.cfbstats;

import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.widget.ListView;

import com.orm.SugarContext;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;

public class MainActivity extends AppCompatActivity {

    XmlParser parser = new XmlParser();
    TeamBuilder teamBuilder = new TeamBuilder();
    ListView teamList;


    SparseArray<String> fbsTeams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        teamList = (ListView) findViewById(R.id.listView);

        SugarContext.init(this);

        // TODO: add first run code

        // delete all entries in the database until a proper startup sequence is developed
        //Games.deleteAll(Games.class);
/*
        try {
            initialGameParsing();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
*/
        teamList.setAdapter(new TeamListAdapter(this, R.layout.team_list_item, teamBuilder));

    }

    public void initialGameParsing() throws IllegalAccessException {

        // get the fields in the raw folder
        Field[] fields = R.raw.class.getFields();

        processXML task = new processXML();
        task.execute(fields);

    }

    // background task to parse game xml files
    private class processXML extends AsyncTask<Field, Void, Void> {
        protected Void doInBackground(Field... fields) {

            // loop for every field in the raw folder
            for(Field field : fields) {
                // not sure what this avoids but it is needed
                if (field.isSynthetic()) {
                    continue;
                }

                // get the id of the file for processing
                int rid = 0;

                try {
                    rid = field.getInt(field);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

                try {
                    // get the resources and access the ID of the current iterations file
                    Resources res = getResources();
                    InputStream in = res.openRawResource(rid);

                    // parse the xml file
                    parser.parse(in);

                    in.close();
                } catch (XmlPullParserException | IOException e) {
                    e.printStackTrace();
                }
            }

            return null;
        }
    }
}
