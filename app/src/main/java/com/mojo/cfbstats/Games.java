package com.mojo.cfbstats;

import com.orm.SugarRecord;

/**
 * Created by Mojsiejenko on 6/20/16.
 */
public class Games extends SugarRecord {

    String gameDate;
    int homeScore, awayScore, homeTeam, awayTeam;

    public Games() {
    }

    public Games(int homeTeam, int homeScore, int awayTeam, int awayScore) {
        //gameDate = date;
        this.homeTeam = homeTeam;
        this.homeScore = homeScore;
        this.awayTeam = awayTeam;
        this.awayScore = awayScore;
    }

}
