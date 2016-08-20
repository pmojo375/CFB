package com.mojo.cfbstats;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mojsiejenko on 8/17/16.
 */
public class GameListAdapter extends ArrayAdapter<Games> {

    int layoutResource;
    List<Games> games;
    TeamBuilder teamBuilder = new TeamBuilder();
    List<TeamData> teamData = teamBuilder.getTeams();
    int id;

    public GameListAdapter(Context context, int layoutResource, List<Games> games, int id) {
        super(context, layoutResource, games);

        this.layoutResource = layoutResource;
        activityContext = context;
        this.games = games;
        this.id = id;
    }

    Context activityContext;
    BitmapHandler bitmapHandler = new BitmapHandler();

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        LayoutInflater viewInflater;
        viewInflater = LayoutInflater.from(activityContext);
        view = viewInflater.inflate(layoutResource, parent, false);

        TextView teamName, gamesScore;
        ImageView teamLogo;

        Games game = getItem(position);
        StatEngine engine = new StatEngine();

        if (game != null) {
            teamName = (TextView) view.findViewById(R.id.teamName);
            gamesScore = (TextView) view.findViewById(R.id.gameScore);

            teamLogo = (ImageView) view.findViewById(R.id.teamLogo);

            if (teamName != null) {

                if (game.homeTeam == id) {
                    teamName.setText(teamData.get(teamBuilder.findTeam(game.awayTeam)).name);
                } else {
                    String teamNameString = "at " + teamData.get(teamBuilder.findTeam(game.homeTeam)).name;

                    teamName.setText(teamNameString);
                }
            }

            if (gamesScore != null) {

                int yourScore = 0, oppScore = 0;

                if (game.homeTeam == id) {
                    yourScore = game.homeScore;
                    oppScore = game.awayScore;
                } else {
                    yourScore = game.awayScore;
                    oppScore = game.homeScore;
                }

                if (oppScore > yourScore) {

                    String scoreString = "Lost " + oppScore + " - " + yourScore;

                    gamesScore.setText(scoreString);
                } else {
                    String scoreString = "Won " + yourScore + " - " + oppScore;

                    gamesScore.setText(scoreString);
                }
            }

            if (teamLogo != null) {

                if (game.homeTeam == id) {
                    teamLogo.setImageBitmap(
                            BitmapHandler.decodeSampledBitmapFromResource(
                                    activityContext.getResources(),
                                    teamData.get(teamBuilder.findTeam(game.awayTeam)).drawable, 100, 100));
                } else {
                    teamLogo.setImageBitmap(
                            BitmapHandler.decodeSampledBitmapFromResource(
                                    activityContext.getResources(),
                                    teamData.get(teamBuilder.findTeam(game.homeTeam)).drawable, 100, 100));
                }

            }
        }

        return view;
    }
}
