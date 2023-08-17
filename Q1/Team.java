import java.util.ArrayList;
import java.util.List;

public class Team {

  private List<Player> players;
  private String teamId;

  public Team(String teamId) {
    this.teamId = teamId;
    this.players = new ArrayList<>();
  }

  public void addPlayer(Player player) {
    this.players.add(player);
    player.transferToTeam(this.teamId);
  }

  public void removePlayer(Player player) {
    players.remove(player);
  }

  public double calculateTeamStrength() {
    double totalStrength = 0.0;

    for (Player player : players) {
      totalStrength += player.calculatePlayerStrength();
    }

    return totalStrength;
  }

  public String getTeamId() {
    return this.teamId;
  }

  public void setTeamId(String name) {
    this.teamId = name;
  }

  public String toString() {
    return teamId + " players: " + players;
  }
}
