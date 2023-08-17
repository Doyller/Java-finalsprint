public class Player {

  private String name;
  private double height;
  private double speed;
  private double accuracy;
  private boolean isScholarship;
  private double gpa;
  private String team;

  public Player(
    String name,
    double height,
    double speed,
    double accuracy,
    boolean isScholarship,
    double gpa,
    String team
  ) {
    this.name = name;
    this.height = height;
    this.speed = speed;
    this.accuracy = accuracy;
    this.isScholarship = isScholarship;
    this.gpa = gpa;
    this.team = team;
  }

  public void transferToTeam(String newTeam) {
    this.team = newTeam;
  }

  public String belongsTo() {
    return this.team;
  }

  public double calculatePlayerStrength() {
    // Calculate player's strength based on attributes
    return (this.height * this.accuracy) / this.speed;
  }

  public void setGPA(double newGPA) {
    this.gpa = newGPA;
  }

  public double getGPA() {
    return this.gpa;
  }

  public void setScholarship(boolean value) {
    this.isScholarship = value;
  }

  public boolean hasScholarship() {
    return this.isScholarship;
  }

  public String toString() {
    return (
      "{name= " +
      name +
      ", height " +
      height +
      ", speed " +
      speed +
      ", accuracy " +
      accuracy +
      ", isScholarship " +
      isScholarship +
      ", gpa " +
      gpa +
      ", team " +
      team +
      "}"
    );
  }
}
