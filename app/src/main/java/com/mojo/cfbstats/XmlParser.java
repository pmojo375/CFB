package com.mojo.cfbstats;

import android.util.Log;
import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Mojsiejenko on 6/19/16.
 */
public class XmlParser {

    public String gameDate;
    public int homeCode, awayCode, homeScore, awayScore;

    public void parse(InputStream in) throws XmlPullParserException, IOException {
        try {
            XmlPullParser parser = Xml.newPullParser();

            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(in, null);

            // gets the parser to the first START_TAG
            parser.nextTag();

            readGame(parser);

        } finally {
            in.close();
        }
    }

    private void readGame(XmlPullParser parser) throws XmlPullParserException, IOException {

        gameDate = null;
        homeCode = 0;
        awayCode = 0;
        homeScore = 0;
        awayScore = 0;

        int eventType = parser.getEventType();
        do {
            if (eventType == XmlPullParser.START_DOCUMENT) {
                System.out.println("Start document");
            } else if (eventType == XmlPullParser.END_DOCUMENT) {
                System.out.println("End document");
            } else if (eventType == XmlPullParser.START_TAG) {
                processStartTag(parser);
            } else if (eventType == XmlPullParser.END_TAG) {
                processEndTag(parser);
            } else if (eventType == XmlPullParser.TEXT) {
                processText(parser);
            }
            eventType = parser.next();
        } while (eventType != XmlPullParser.END_DOCUMENT);

        Games games = new Games(homeCode, homeScore, awayCode, awayScore);
        games.save();

    }

    private void processStartTag(XmlPullParser parser) {
        String tagName = parser.getName();

        switch (tagName) {
            case "venue":
                try {
                    processVenue(parser);
                } catch (IOException | XmlPullParserException e) {
                    Log.e("processVenue", e.getLocalizedMessage());
                }
                break;
            case "team":
                try {
                    processTeam(parser);
                } catch(IOException | XmlPullParserException e) {
                    Log.e("processVenue", e.getLocalizedMessage());
                }
                break;
            default:
                break;
        }
    }

    private void processEndTag(XmlPullParser parser) {

    }

    private void processText(XmlPullParser parser) {

    }

    private void processVenue(XmlPullParser parser) throws IOException, XmlPullParserException {
        String dateString;

        dateString = parser.getAttributeValue(null, "date");

        parseDate(dateString);
    }

    private Date parseDate(String dateInput) {

        SimpleDateFormat formatter = new SimpleDateFormat("M/d/y");
        Date parsed = new Date();

        try {
            parsed = formatter.parse(dateInput);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return parsed;
    }

    private void processTeam(XmlPullParser parser) throws IOException, XmlPullParserException {
        String vhTag;
        int teamCode;
        int teamScore;

        // get the team code
        if (parser.getAttributeValue(null, "code").isEmpty()) {
            teamCode = 0;
        } else {
            teamCode = Integer.parseInt(parser.getAttributeValue(null, "code"));
        }

        // get the team name and vistor/home status
        vhTag = parser.getAttributeValue(null, "vh");

        parser.nextTag();

        teamScore = readLineScore(parser);

        if(vhTag.equals("H")) {
            homeCode = teamCode;
            homeScore = teamScore;
        } else {
            awayCode = teamCode;
            awayScore = teamScore;
        }
    }

    // returns parser at linescore END_TAG
    private int readLineScore(XmlPullParser parser)  throws IOException, XmlPullParserException {
        int score = 0;

        score = Integer.parseInt(parser.getAttributeValue(null, "score"));

        return score;
    }

}
