package com.mojo.cfbstats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mojsiejenko on 6/23/16.
 */
public class TeamListAdapter extends ArrayAdapter<TeamData> {

    int layoutResource;

    public TeamListAdapter(Context context, int layoutResource, TeamBuilder teamBuilder) {
        super(context, layoutResource, teamBuilder.getTeams());

        this.layoutResource = layoutResource;
        activityContext = context;
        this.teamBuilder = teamBuilder;
    }

    Context activityContext;
    TeamBuilder teamBuilder;
    BitmapHandler bitmapHandler = new BitmapHandler();

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        LayoutInflater viewInflater;
        viewInflater = LayoutInflater.from(activityContext);
        view = viewInflater.inflate(layoutResource, parent, false);

        TextView teamName, teamRecord;
        ImageView teamLogo;

        TeamData teamData = getItem(position);
        StatEngine engine = new StatEngine();

        if (teamData != null) {
            teamName = (TextView) view.findViewById(R.id.teamName);
            teamRecord = (TextView) view.findViewById(R.id.teamRecord);

            teamLogo = (ImageView) view.findViewById(R.id.teamLogo);

            if (teamName != null) {
                teamName.setText(teamData.name);
            }

            if (teamRecord != null) {
                teamRecord.setText(engine.getRecord(teamData.id));
            }

            if (teamLogo != null) {

                teamLogo.setImageBitmap(
                        BitmapHandler.decodeSampledBitmapFromResource(
                                activityContext.getResources(),
                                teamData.drawable, 100, 100));

            }
        }

        return view;
    }
}
