public class BasketballTournament {

  public static void main(String[] args) {
    // Create players
    Player Frank_Costanza = new Player(
      "Frank Costanza",
      6.2,
      10,
      8,
      false,
      3.5,
      null
    );
    Player Jerry_Seinfeld = new Player(
      "Jerry Seinfeld",
      6.0,
      9,
      7,
      true,
      3.8,
      null
    );
    Player Alex_Singleton = new Player(
      "Alex Singleton",
      5.9,
      10,
      6,
      true,
      3.6,
      null
    );
    Player Joe_roe = new Player("Joe Roe", 6.3, 8, 8, false, 2.5, null);
    Player Big_Mac = new Player("Big Mac", 7.2, 3, 11, true, 3.0, null);

    // eastern teams
    Team eastTeam1 = new Team("Northern Lake Tigers");
    Team eastTeam2 = new Team("Memphis Lake Marauders");

    // western teams
    Team westTeam1 = new Team("West Lake Warriors");
    Team westTeam2 = new Team("Swamp Skulkers");

    // northern lake members
    eastTeam1.addPlayer(Frank_Costanza);
    eastTeam1.addPlayer(Joe_roe);
    System.out.println(eastTeam1);

    // Memphis lake members
    eastTeam2.addPlayer(Jerry_Seinfeld);

    //  west Lake members
    westTeam1.addPlayer(Alex_Singleton);

    // swamp members
    westTeam2.addPlayer(Big_Mac);
    // ... add more players to teams

    // Create east conference
    Conference EasternConference = new Conference();
    EasternConference.addTeam(eastTeam1);
    EasternConference.addTeam(eastTeam2);
    // ... add more teams to the conference
    System.out.println("Eastern Conference: " + EasternConference);

    // create west conference
    Conference WesternConference = new Conference();
    WesternConference.addTeam(westTeam1);
    WesternConference.addTeam(westTeam2);
    System.out.println("Western Conference: " + WesternConference);

    // Simulate a game
    Game EastGame = new Game(eastTeam1, eastTeam2);
    EastGame.simulateGame();
    System.out.println(EastGame);
    System.out.println("Winner: " + EastGame.getWinner());

    Game WestGame = new Game(westTeam1, westTeam2);
    WestGame.simulateGame();
    System.out.println(WestGame);
    System.out.println("Winner: " + WestGame.getWinner());
  }
}
