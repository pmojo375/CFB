package com.mojo.cfbstats;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.List;

public class TeamPage extends AppCompatActivity {

    private ListView gameList;
    private ImageView backgroundImage;
    TeamBuilder teamBuilder = new TeamBuilder();
    List<TeamData> teams;
    int team;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_page);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            team = extras.getInt("team");
        }

        int teamCode = teamBuilder.teamCodes[team];

        gameList = (ListView) findViewById(R.id.gameView);
        backgroundImage = (ImageView) findViewById(R.id.backgroundImage);

        teams = teamBuilder.getTeams();

        //backgroundImage.setImageBitmap(BitmapHandler.decodeSampledBitmapFromResource(
        //this.getResources(),
        //teams.get(team).background, 200, 200));

        StatEngine engine = new StatEngine();

        gameList.setAdapter(new GameListAdapter(this, R.layout.game_list_item, engine.getGames(teamCode), teamCode));

    }


}
