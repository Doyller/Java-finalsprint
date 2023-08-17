import java.util.Random;

public class Game {

  private Team team1;
  private Team team2;
  private int team1Score;
  private int team2Score;

  public Game(Team team1, Team team2) {
    this.team1 = team1;
    this.team2 = team2;
  }

  public void simulateGame() {
    Double random1 = new Random().nextDouble(10);
    Double random2 = new Random().nextDouble(10);
    this.team1Score =
      (int) Math.floor(random1 * this.team1.calculateTeamStrength());
    this.team2Score =
      (int) Math.floor(random2 * this.team2.calculateTeamStrength());
  }

  public String getWinner() {
    // Return the winning team's name
    if (team1Score > team2Score) {
      return team1.getTeamId();
    } else {
      // team 2 wins
      return team2.getTeamId();
    }
  }

  public String toString() {
    return (
      String.format(
        "Team %s : %d | %d : Team %s",
        team1.getTeamId(),
        team1Score,
        team2Score,
        team2.getTeamId()
      )
    );
  }
}
