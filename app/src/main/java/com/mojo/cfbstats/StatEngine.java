package com.mojo.cfbstats;

import java.util.List;

/**
 * Created by Mojsiejenko on 8/16/16.
 */
public class StatEngine {

    public StatEngine() {

    }

    public List<Games> getGames(int id) {
        List<Games> games = Games.find(Games.class, "home_team = ? or away_team = ?", Integer.toString(id), Integer.toString(id));

        return games;
    }

    private int getWins(int id) {

        List<Games> games = getGames(id);
        int wins = 0;

        for (int i = 0; i < games.size(); i++) {

            Games game = games.get(i);

            if (game.homeTeam == id) {
                if (game.homeScore > game.awayScore) {
                    wins++;
                }
            } else {
                if (game.awayScore > game.homeScore) {
                    wins++;
                }
            }
        }

        return wins;
    }

    private int getLosses(int id) {

        List<Games> games = getGames(id);
        int losses = 0;

        for (int i = 0; i < games.size(); i++) {

            Games game = games.get(i);

            if (game.homeTeam == id) {
                if (game.homeScore < game.awayScore) {
                    losses++;
                }
            } else {
                if (game.awayScore < game.homeScore) {
                    losses++;
                }
            }
        }

        return losses;
    }

    public String getRecord(int id) {
        int wins, losses;

        wins = getWins(id);
        losses = getLosses(id);

        return Integer.toString(wins) + " - " + Integer.toString(losses);

    }

    public void getTeamGames(int id) {

        List<Games> games = getGames(id);

    }
}
