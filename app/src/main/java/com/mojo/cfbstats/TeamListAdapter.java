package com.mojo.cfbstats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mojsiejenko on 6/23/16.
 */
public class TeamListAdapter extends BaseAdapter{

    Context activityContext;
    TeamBuilder teamBuilder;

    public TeamListAdapter(Context context, TeamBuilder teamBuilder) {
        activityContext = context;
        this.teamBuilder = teamBuilder;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        LayoutInflater viewInflater;
        viewInflater = LayoutInflater.from(activityContext);
        view = viewInflater.inflate(R.layout.team_list_item, parent, false);

        TextView teamName, teamRecord;
        ImageView teamLogo;

        teamName = (TextView) view.findViewById(R.id.teamName);
        teamRecord = (TextView) view.findViewById(R.id.teamRecord);

        teamLogo = (ImageView) view.findViewById(R.id.teamLogo);

        teamBuilder.getFBSTeams().keyAt(position);

        return view;
    }

}
