package com.mojo.cfbstats;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mojsiejenko on 6/21/16.
 */
public class TeamBuilder {

    public int[] teamCodes = {458, 5, 8, 9, 28, 29, 30, 31, 37, 47, 51, 66, 67, 71, 77, 86, 96, 107,
            110, 128, 129, 140, 147, 156, 157, 164, 193, 196, 204, 229, 231, 234, 235, 254, 255,
            257, 277, 288, 295, 301, 306, 311, 312, 327, 328, 331, 334, 365, 366, 367, 388, 392,
            400, 404, 414, 415, 416, 418, 419, 428, 430, 433, 434, 457, 463, 465, 466, 472, 473,
            490, 497, 498, 503, 509, 513, 518, 519, 521, 522, 528, 529, 539, 545, 559, 574, 587,
            626, 630, 646, 648, 651, 657, 663, 664, 670, 671, 674, 688, 690, 694, 697, 698, 700,
            703, 704, 706, 709, 716, 718, 719, 721, 725, 726, 731, 732, 736, 742, 746, 749, 754,
            756, 768, 772, 774, 796, 811};

    private int[] teamDrawables = {R.drawable.logo_458, R.drawable.logo_5, R.drawable.logo_8, R.drawable.logo_9,
            R.drawable.logo_28, R.drawable.logo_29, R.drawable.logo_30, R.drawable.logo_31, R.drawable.logo_37,
            R.drawable.logo_47, R.drawable.logo_51, R.drawable.logo_66, R.drawable.logo_67, R.drawable.logo_71,
            R.drawable.logo_77, R.drawable.logo_86, R.drawable.logo_96, R.drawable.logo_107, R.drawable.logo_110,
            R.drawable.logo_128, R.drawable.logo_129, R.drawable.logo_140, R.drawable.logo_147, R.drawable.logo_156,
            R.drawable.logo_157, R.drawable.logo_164, R.drawable.logo_193, R.drawable.logo_196, R.drawable.logo_204,
            R.drawable.logo_229, R.drawable.logo_231, R.drawable.logo_234, R.drawable.logo_235, R.drawable.logo_254,
            R.drawable.logo_255, R.drawable.logo_257, R.drawable.logo_277, R.drawable.logo_288, R.drawable.logo_295,
            R.drawable.logo_301, R.drawable.logo_306, R.drawable.logo_311, R.drawable.logo_312, R.drawable.logo_327,
            R.drawable.logo_328, R.drawable.logo_331, R.drawable.logo_334, R.drawable.logo_365, R.drawable.logo_366,
            R.drawable.logo_367, R.drawable.logo_388, R.drawable.logo_392, R.drawable.logo_400, R.drawable.logo_404,
            R.drawable.logo_414, R.drawable.logo_415, R.drawable.logo_416, R.drawable.logo_418, R.drawable.logo_419,
            R.drawable.logo_428, R.drawable.logo_430, R.drawable.logo_433, R.drawable.logo_434, R.drawable.logo_457,
            R.drawable.logo_463, R.drawable.logo_465, R.drawable.logo_466, R.drawable.logo_472, R.drawable.logo_473,
            R.drawable.logo_490, R.drawable.logo_497, R.drawable.logo_498, R.drawable.logo_503, R.drawable.logo_509,
            R.drawable.logo_513, R.drawable.logo_518, R.drawable.logo_519, R.drawable.logo_521, R.drawable.logo_522,
            R.drawable.logo_528, R.drawable.logo_529, R.drawable.logo_539, R.drawable.logo_545, R.drawable.logo_559,
            R.drawable.logo_574, R.drawable.logo_587, R.drawable.logo_626, R.drawable.logo_630, R.drawable.logo_646,
            R.drawable.logo_648, R.drawable.logo_651, R.drawable.logo_657, R.drawable.logo_663, R.drawable.logo_664,
            R.drawable.logo_670, R.drawable.logo_671, R.drawable.logo_674, R.drawable.logo_688, R.drawable.logo_690,
            R.drawable.logo_694, R.drawable.logo_697, R.drawable.logo_698, R.drawable.logo_700, R.drawable.logo_703,
            R.drawable.logo_704, R.drawable.logo_706, R.drawable.logo_709, R.drawable.logo_716, R.drawable.logo_718,
            R.drawable.logo_719, R.drawable.logo_721, R.drawable.logo_725, R.drawable.logo_726, R.drawable.logo_731,
            R.drawable.logo_732, R.drawable.logo_736, R.drawable.logo_742, R.drawable.logo_746, R.drawable.logo_749,
            R.drawable.logo_754, R.drawable.logo_756, R.drawable.logo_768, R.drawable.logo_772, R.drawable.logo_774,
            R.drawable.logo_796, R.drawable.logo_811};

    private int[] teamBackground = {R.drawable.background_458, R.drawable.background_5, R.drawable.background_8, R.drawable.background_9,
            R.drawable.background_28, R.drawable.background_29, R.drawable.background_30, R.drawable.background_31, R.drawable.background_37,
            R.drawable.background_47, R.drawable.background_51, R.drawable.background_66, R.drawable.background_67, R.drawable.background_71,
            R.drawable.background_77, R.drawable.background_86, R.drawable.background_96, R.drawable.background_107, R.drawable.background_110,
            R.drawable.background_128, R.drawable.background_129, R.drawable.background_140, R.drawable.background_147, R.drawable.background_156,
            R.drawable.background_157, R.drawable.background_164, R.drawable.background_193, R.drawable.background_196, R.drawable.background_204,
            R.drawable.background_229, R.drawable.background_231, R.drawable.background_234, R.drawable.background_235, R.drawable.background_254,
            R.drawable.background_255, R.drawable.background_257, R.drawable.background_277, R.drawable.background_288, R.drawable.background_295,
            R.drawable.background_301, R.drawable.background_306, R.drawable.background_311, R.drawable.background_312, R.drawable.background_327,
            R.drawable.background_328, R.drawable.background_331, R.drawable.background_334, R.drawable.background_365, R.drawable.background_366,
            R.drawable.background_367, R.drawable.background_388, R.drawable.background_392, R.drawable.background_400, R.drawable.background_404,
            R.drawable.background_414, R.drawable.background_415, R.drawable.background_416, R.drawable.background_418, R.drawable.background_419,
            R.drawable.background_428, R.drawable.background_430, R.drawable.background_433, R.drawable.background_434, R.drawable.background_457,
            R.drawable.background_463, R.drawable.background_465, R.drawable.background_466, R.drawable.background_472, R.drawable.background_473,
            R.drawable.background_490, R.drawable.background_497, R.drawable.background_498, R.drawable.background_503, R.drawable.background_509,
            R.drawable.background_513, R.drawable.background_518, R.drawable.background_519, R.drawable.background_521, R.drawable.background_522,
            R.drawable.background_528, R.drawable.background_529, R.drawable.background_539, R.drawable.background_545, R.drawable.background_559,
            R.drawable.background_574, R.drawable.background_587, R.drawable.background_626, R.drawable.background_630, R.drawable.background_646,
            R.drawable.background_648, R.drawable.background_651, R.drawable.background_657, R.drawable.background_663, R.drawable.background_664,
            R.drawable.background_670, R.drawable.background_671, R.drawable.background_674, R.drawable.background_688, R.drawable.background_690,
            R.drawable.background_694, R.drawable.background_697, R.drawable.background_698, R.drawable.background_700, R.drawable.background_703,
            R.drawable.background_704, R.drawable.background_706, R.drawable.background_709, R.drawable.background_716, R.drawable.background_718,
            R.drawable.background_719, R.drawable.background_721, R.drawable.background_725, R.drawable.background_726, R.drawable.background_731,
            R.drawable.background_732, R.drawable.background_736, R.drawable.background_742, R.drawable.background_746, R.drawable.background_749,
            R.drawable.background_754, R.drawable.background_756, R.drawable.background_768, R.drawable.background_772, R.drawable.background_774,
            R.drawable.background_796, R.drawable.background_811};

    private String[] teamNames = {"Charlotte", "Akron", "Alabama", "UAB", "Arizona State", "Arizona", "Arkansas State",
            "Arkansas", "Auburn", "Ball State", "Baylor", "Boise State", "Boston College", "Bowling Green",
            "BYU", "Buffalo", "Fresno State", "California", "UCLA", "UCF", "Central Michigan", "Cincinnati",
            "Clemson", "Colorado State", "Colorado", "Connecticut", "Duke", "East Carolina", "Eastern Michigan",
            "Florida Atlantic", "Florida International", "Florida State", "Florida", "Georgia State", "Georgia Tech",
            "Georgia", "Hawai'i", "Houston", "Idaho", "Illinois", "Indiana", "Iowa State", "Iowa", "Kansas State",
            "Kansas", "Kent State", "Kentucky", "LSU", "Louisiana Tech", "Louisville", "Marshall", "Maryland",
            "Massachusetts", "Memphis", "Miami (Ohio)", "Miami (Florida)", "Michigan State", "Michigan",
            "Middle Tennessee", "Minnesota", "Mississippi State", "Mississippi", "Missouri", "North Carolina",
            "Nebraska", "UNLV", "Nevada", "New Mexico State", "New Mexico", "North Carolina State", "North Texas",
            "Louisiana-Monroe", "Northern Illinois", "Northwestern", "Notre Dame", "Ohio State", "Ohio",
            "Oklahoma State", "Oklahoma", "Oregon State", "Oregon", "Penn State", "Pittsburgh", "Purdue",
            "Rice", "Rutgers", "San Diego State", "San Jose State", "South Alabama", "South Carolina",
            "South Florida", "USC", "SMU", "Southern Mississippi", "Texas State", "Louisiana-Lafayette",
            "Stanford", "Syracuse", "Temple", "Tennessee", "Texas A&M", "TCU", "Texas Tech", "Texas",
            "UTEP", "UTSA", "Toledo", "Troy", "Tulane", "Tulsa", "Air Force", "Army", "Navy", "Utah State",
            "Utah", "Vanderbilt", "Virginia Tech", "Virginia", "Wake Forest", "Washington State", "Washington",
            "West Virginia", "Western Kentucky", "Western Michigan", "Wisconsin", "Wyoming"};

    int size = teamCodes.length;

    List<TeamData> teams = new ArrayList<>();

    TeamBuilder() {
        if (size == teamNames.length) {
            for (int i = 0; i < size; i++) {
                teams.add(new TeamData(teamCodes[i], teamNames[i], teamDrawables[i], teamBackground[i]));
            }
        } else {
            //error, arrays are different sizes!
        }
    }

    public List getTeams() {
        return teams;
    }

    public int findTeam(int id) {

        int team = 0;

        for (int i = 0; i < teamCodes.length; i++) {
            if (teamCodes[i] == id) {
                team = i;
                break;
            }
        }

        return team;
    }

}
