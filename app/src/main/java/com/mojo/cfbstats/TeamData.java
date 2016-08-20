package com.mojo.cfbstats;

/**
 * Created by Mojsiejenko on 8/15/16.
 */
public class TeamData {

    int id, drawable, background;
    String name;

    TeamData(int id, String name, int drawable, int background) {
        this.id = id;
        this.name = name;
        this.drawable = drawable;
        this.background = background;
    }
}
