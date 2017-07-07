import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {
  @Test
  public void Team_instantiatesCorrectly_true() {
    Team myTeam = new Team("Barbell");
    assertEquals(true, myTeam instanceof Team);
  }

  @Test
  public void Team_teamName_String() {
    Team myTeam = new Team("Barbell");
    assertEquals("Barbell", myTeam.getName());
  }

  @Test
  public void all_returnsAllTeam_true() {
    Team firstTeam = new Team("Barbell");
    Team secondTeam = new Team("Brigade");
    assertEquals(true, Team.all().contains(firstTeam));
    assertEquals(true, Team.all().contains(secondTeam));
  }

  @Test
  public void getId_teamsWithId_1() {
    Team.clear();
    Team myTeam = new Team("Barbell");
    assertEquals(1, myTeam.getId());
  }
}
