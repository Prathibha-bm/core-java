class IPL{
    String teamName;
    String captain;
    String city;
    int foundedYear;
    int teamId;
    int matchesPlayed;
    int matchesWon;
    int matchesLost;
    double winPercentage;
    String coach;

    public IPL(String teamName, String captain, String city, int foundedYear, int teamId, int matchesPlayed, int matchesWon, int matchesLost, double winPercentage, String coach) {
        this.teamName = teamName;
        this.captain = captain;
        this.city = city;
        this.foundedYear = foundedYear;
        this.teamId = teamId;
        this.matchesPlayed = matchesPlayed;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.winPercentage = winPercentage;
        this.coach = coach;
    }
}