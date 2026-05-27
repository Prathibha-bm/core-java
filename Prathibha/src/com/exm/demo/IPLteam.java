package com.exm.demo;

import java.util.Objects;

public class IPLteam {
    private String teamName;
    private int noOfPlayers;
    private String teamLeader;
    private String place;
    private int noOfCups;

    public IPLteam() {
    }


    public IPLteam(String teamName, int noOfPlayers, String teamLeader, String place, int noOfCups) {
        this.teamName = teamName;
        this.noOfPlayers = noOfPlayers;
        this.teamLeader = teamLeader;
        this.place = place;
        this.noOfCups = noOfCups;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getnoOfPlayers() {
        return noOfPlayers;
    }

    public void setnoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public String getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(String teamLeader) {
        this.teamLeader = teamLeader;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getNoOfCups() {
        return noOfCups;
    }

    public void setNoOfCups(int noOfCups) {
        this.noOfCups = noOfCups;
    }


    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            IPLteam team1 = this;

            if (obj instanceof IPLteam) {
                IPLteam team2 = (IPLteam) obj;

                if (team1.teamName.equals(team2.teamName) && team1.noOfPlayers == (team2.noOfPlayers)){
                    return true;
                }
            }
        }
        return false;
    }


}
