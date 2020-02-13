package com.goldbuild;



public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("joe");
        BaseballPlayer pat = new BaseballPlayer("pat");
        SoccerPlayer beckham = new SoccerPlayer("beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
       // adelaideCrows.addPlayer(pat);
       // adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicargo Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this wont work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");

        Team<FootballPlayer> hawthorn = new Team<>("hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Freemantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3,8);

        adelaideCrows.matchResult(fremantle, 2,1);

        adelaideCrows.matchResult(baseballTeam, 1,1);

        System.out.println(adelaideCrows.numPlayers());

    }
}
