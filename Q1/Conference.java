import java.util.ArrayList;
import java.util.List;

public class Conference {

  private List<Team> teams;

  public Conference() {
    this.teams = new ArrayList<>();
  }

  public void addTeam(Team team) {
    this.teams.add(team);
  }

  public void removeTeam(Team team) {
    teams.remove(team);
  }

  public String toString() {
    String temp = "";
    for (Team team : teams) {
      temp += team.getTeamId();
      temp += " ";
    }
    return temp;
  }
}
