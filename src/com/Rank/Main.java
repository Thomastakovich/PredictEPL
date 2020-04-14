package com.Rank;

import com.League.Match;
import com.League.MatchResult;
import com.League.Round;
import com.League.Team;

import java.util.HashMap;

import static com.Rank.Training.initTeams;
import static com.Rank.Training.relationStat;

public class Main {

    public static MatchResult HW = new MatchResult(3);
    public static MatchResult D = new MatchResult(1);
    public static MatchResult AW = new MatchResult(0);
    public static HashMap<Integer, int[]> relationship = new HashMap<>();

    public static void main(String[] args) {
        HashMap<String, Team> teams2000 = initTeams("datasets/2000-2001.csv");
        HashMap<String, Team> teams2001 = initTeams("datasets/2001-2002.csv");
        HashMap<String, Team> teams2002 = initTeams("datasets/2002-2003.csv");
        HashMap<String, Team> teams2003 = initTeams("datasets/2003-2004.csv");
        HashMap<String, Team> teams2004 = initTeams("datasets/2004-2005.csv");
        HashMap<String, Team> teams2005 = initTeams("datasets/2005-2006.csv");
        HashMap<String, Team> teams2006 = initTeams("datasets/2006-2007.csv");
        HashMap<String, Team> teams2007 = initTeams("datasets/2007-2008.csv");
        HashMap<String, Team> teams2008 = initTeams("datasets/2008-2009.csv");
        HashMap<String, Team> teams2009 = initTeams("datasets/2009-2010.csv");
        HashMap<String, Team> teams2010 = initTeams("datasets/2010-2011.csv");
//        HashMap<String, Team> teams2011 = initTeams("datasets/2011-2012.csv");
        HashMap<String, Team> teams2012 = initTeams("datasets/2012-2013.csv");
        HashMap<String, Team> teams2013 = initTeams("datasets/2013-2014.csv");
        HashMap<String, Team> teams2014 = initTeams("datasets/2014-2015.csv");
        HashMap<String, Team> teams2015 = initTeams("datasets/2015-2016.csv");
        HashMap<String, Team> teams2016 = initTeams("datasets/2016-2017.csv");
        HashMap<String, Team> teams2017 = initTeams("datasets/2017-2018.csv");
        HashMap<String, Team> teams2018 = initTeams("datasets/2018-2019.csv");

        relationStat(teams2000, relationship, "datasets/2000-2001.csv");
        relationStat(teams2001, relationship, "datasets/2001-2002.csv");
        relationStat(teams2002, relationship, "datasets/2002-2003.csv");
        relationStat(teams2003, relationship, "datasets/2003-2004.csv");
        relationStat(teams2004, relationship, "datasets/2004-2005.csv");
        relationStat(teams2005, relationship, "datasets/2005-2006.csv");
        relationStat(teams2006, relationship, "datasets/2006-2007.csv");
        relationStat(teams2007, relationship, "datasets/2007-2008.csv");
        relationStat(teams2008, relationship, "datasets/2008-2009.csv");
        relationStat(teams2009, relationship, "datasets/2009-2010.csv");
        relationStat(teams2010, relationship, "datasets/2010-2011.csv");
//        relationStat(teams2011, relationship, "datasets/2011-2012.csv");
        relationStat(teams2012, relationship, "datasets/2012-2013.csv");
        relationStat(teams2013, relationship, "datasets/2013-2014.csv");
        relationStat(teams2014, relationship, "datasets/2014-2015.csv");
        relationStat(teams2015, relationship, "datasets/2015-2016.csv");
        relationStat(teams2016, relationship, "datasets/2016-2017.csv");
        relationStat(teams2017, relationship, "datasets/2017-2018.csv");
        relationStat(teams2018, relationship, "datasets/2018-2019.csv");

        HashMapSort.sortandPrintHashMap(relationship);

        Team t1 = new Team(1, "Liverpool", 27, 1, 1,82, 29);
        Team t2 = new Team(2, "Everton", 10, 7, 12, 37, 29);
        Team t3 = new Team(3, "Leicester City", 16, 5, 8, 53, 29);
        int i = t1.getPointPer100Match() - t3.getPointPer100Match();
        int total = relationship.get(i)[0] + relationship.get(i)[1] + relationship.get(i)[2];
        double Pt1Win = (double)relationship.get(i)[0] / (double)total;
        double PDraw = (double)relationship.get(i)[1] / (double)total;
        double Pt1Lose = (double)relationship.get(i)[2] / (double)total;
        System.out.println(i);
        System.out.println("P(Liverpool win Leicester City: )" + Pt1Win);
        System.out.println("P(Liverpool draw Leicester City: )" + PDraw);
        System.out.println("P(Liverpool lose Leicester City: )" + Pt1Lose);

        int i1 = t1.getPointPer100Match() - t2.getPointPer100Match();
        int total1 = relationship.get(i1)[0] + relationship.get(i1)[1] + relationship.get(i1)[2];
        double Pt1Win1 = (double)relationship.get(i1)[0] / (double)total1;
        double PDraw1 = (double)relationship.get(i1)[1] / (double)total1;
        double Pt1Lose1 = (double)relationship.get(i1)[2] / (double)total1;
        System.out.println(i1);
        System.out.println("P(Liverpool win Everton: )" + Pt1Win1);
        System.out.println("P(Liverpool draw Everton: )" + PDraw1);
        System.out.println("P(Liverpool lose Everton: )" + Pt1Lose1);
    }

}