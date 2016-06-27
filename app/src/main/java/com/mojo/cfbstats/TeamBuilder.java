package com.mojo.cfbstats;

import android.util.SparseArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created by Mojsiejenko on 6/21/16.
 */
public class TeamBuilder {

    private int[] teamCodes = {458, 5, 8, 9, 28, 29, 30, 31, 37, 47, 51, 66, 67, 71, 77, 86, 96, 107,
            110, 128, 129, 140, 147, 156, 157, 164, 193, 196, 204, 229, 231, 234, 235, 254, 255,
            257, 277, 288, 295, 301, 306, 311, 312, 327, 328, 331, 334, 365, 366, 367, 388, 392,
            400, 404, 414, 415, 416, 418, 419, 428, 430, 433, 434, 457, 463, 465, 466, 472, 473,
            490, 497, 498, 503, 509, 513, 518, 519, 521, 522, 528, 529, 539, 545, 559, 574, 587,
            626, 630, 646, 648, 651, 657, 663, 664, 670, 671, 674, 688, 690, 694, 697, 698, 700,
            703, 704, 706, 709, 716, 718, 719, 721, 725, 726, 731, 732, 736, 742, 746, 749, 754,
            756, 768, 772, 774, 796, 811};

    TeamBuilder() {
        
    }

    public int[] getTeamCodes() {
        return teamCodes;
    }

    // gets all 128 FBS teams in an key/set collection
    public SparseArray<String> getFBSTeams() {
        
        SparseArray<String> teamsFBS = new SparseArray<String>();

        teamsFBS.put(458, "Charlotte");
        teamsFBS.put(5, "Akron");
        teamsFBS.put(8, "Alabama");
        teamsFBS.put(9, "UAB");
        teamsFBS.put(28, "Arizona State");
        teamsFBS.put(29, "Arizona");
        teamsFBS.put(30, "Arkansas State");
        teamsFBS.put(31, "Arkansas");
        teamsFBS.put(37, "Auburn");
        teamsFBS.put(47, "Ball State");
        teamsFBS.put(51, "Baylor");
        teamsFBS.put(66, "Boise State");
        teamsFBS.put(67, "Boston College");
        teamsFBS.put(71, "Bowling Green");
        teamsFBS.put(77, "BYU");
        teamsFBS.put(86, "Buffalo");
        teamsFBS.put(96, "Fresno State");
        teamsFBS.put(107, "California");
        teamsFBS.put(110, "UCLA");
        teamsFBS.put(128, "UCF");
        teamsFBS.put(129, "Central Michigan");
        teamsFBS.put(140, "Cincinnati");
        teamsFBS.put(147, "Clemson");
        teamsFBS.put(156, "Colorado State");
        teamsFBS.put(157, "Colorado");
        teamsFBS.put(164, "Connecticut");
        teamsFBS.put(193, "Duke");
        teamsFBS.put(196, "East Carolina");
        teamsFBS.put(204, "Eastern Michigan");
        teamsFBS.put(229, "Florida Atlantic");
        teamsFBS.put(231, "Florida International");
        teamsFBS.put(234, "Florida State");
        teamsFBS.put(235, "Florida");
        teamsFBS.put(254, "Georgia State");
        teamsFBS.put(255, "Georgia Tech");
        teamsFBS.put(257, "Georgia");
        teamsFBS.put(277, "Hawai'i");
        teamsFBS.put(288, "Houston");
        teamsFBS.put(295, "Idaho");
        teamsFBS.put(301, "Illinois");
        teamsFBS.put(306, "Indiana");
        teamsFBS.put(311, "Iowa State");
        teamsFBS.put(312, "Iowa");
        teamsFBS.put(327, "Kansas State");
        teamsFBS.put(328, "Kansas");
        teamsFBS.put(331, "Kent State");
        teamsFBS.put(334, "Kentucky");
        teamsFBS.put(365, "LSU");
        teamsFBS.put(366, "Louisiana Tech");
        teamsFBS.put(367, "Louisville");
        teamsFBS.put(388, "Marshall");
        teamsFBS.put(392, "Maryland");
        teamsFBS.put(400, "Massachusetts");
        teamsFBS.put(404, "Memphis");
        teamsFBS.put(414, "Miami (Ohio)");
        teamsFBS.put(415, "Miami (Florida)");
        teamsFBS.put(416, "Michigan State");
        teamsFBS.put(418, "Michigan");
        teamsFBS.put(419, "Middle Tennessee");
        teamsFBS.put(428, "Minnesota");
        teamsFBS.put(430, "Mississippi State");
        teamsFBS.put(433, "Mississippi");
        teamsFBS.put(434, "Missouri");
        teamsFBS.put(457, "North Carolina");
        teamsFBS.put(463, "Nebraska");
        teamsFBS.put(465, "UNLV");
        teamsFBS.put(466, "Nevada");
        teamsFBS.put(472, "New Mexico State");
        teamsFBS.put(473, "New Mexico");
        teamsFBS.put(490, "North Carolina State");
        teamsFBS.put(497, "North Texas");
        teamsFBS.put(498, "Louisiana-Monroe");
        teamsFBS.put(503, "Northern Illinois");
        teamsFBS.put(509, "Northwestern");
        teamsFBS.put(513, "Notre Dame");
        teamsFBS.put(518, "Ohio State");
        teamsFBS.put(519, "Ohio");
        teamsFBS.put(521, "Oklahoma State");
        teamsFBS.put(522, "Oklahoma");
        teamsFBS.put(528, "Oregon State");
        teamsFBS.put(529, "Oregon");
        teamsFBS.put(539, "Penn State");
        teamsFBS.put(545, "Pittsburgh");
        teamsFBS.put(559, "Purdue");
        teamsFBS.put(574, "Rice");
        teamsFBS.put(587, "Rutgers");
        teamsFBS.put(626, "San Diego State");
        teamsFBS.put(630, "San Jose State");
        teamsFBS.put(646, "South Alabama");
        teamsFBS.put(648, "South Carolina");
        teamsFBS.put(651, "South Florida");
        teamsFBS.put(657, "USC");
        teamsFBS.put(663, "SMU");
        teamsFBS.put(664, "Southern Mississippi");
        teamsFBS.put(670, "Texas State");
        teamsFBS.put(671, "Louisiana-Lafayette");
        teamsFBS.put(674, "Stanford");
        teamsFBS.put(688, "Syracuse");
        teamsFBS.put(690, "Temple");
        teamsFBS.put(694, "Tennessee");
        teamsFBS.put(697, "Texas A&M");
        teamsFBS.put(698, "TCU");
        teamsFBS.put(700, "Texas Tech");
        teamsFBS.put(703, "Texas");
        teamsFBS.put(704, "UTEP");
        teamsFBS.put(706, "UTSA");
        teamsFBS.put(709, "Toledo");
        teamsFBS.put(716, "Troy");
        teamsFBS.put(718, "Tulane");
        teamsFBS.put(719, "Tulsa");
        teamsFBS.put(721, "Air Force");
        teamsFBS.put(725, "Army");
        teamsFBS.put(726, "Navy");
        teamsFBS.put(731, "Utah State");
        teamsFBS.put(732, "Utah");
        teamsFBS.put(736, "Vanderbilt");
        teamsFBS.put(742, "Virginia Tech");
        teamsFBS.put(746, "Virginia");
        teamsFBS.put(749, "Wake Forest");
        teamsFBS.put(754, "Washington State");
        teamsFBS.put(756, "Washington");
        teamsFBS.put(768, "West Virginia");
        teamsFBS.put(772, "Western Kentucky");
        teamsFBS.put(774, "Western Michigan");
        teamsFBS.put(796, "Wisconsin");
        teamsFBS.put(811, "Wyoming");
        
        return teamsFBS;
    }
}
