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

  @Test
  public void clear_clearTeams_0() {
    Team myTeam = new Team("Barbell");
    Team.clear();
    assertEquals(Team.all().size(), 0);
  }

  @Test
  public void find_returnsId_secondTeam() {
    Team firstTeam = new Team("Barbell");
    Team secondTeam = new Team("Brigade");
    assertEquals(Team.find(secondTeam.getId()), secondTeam);
  }

  @Test
  public void getMember_addMemberToList_true() {
    Team testTeam = new Team("Epicodus");
    Member newMember = new Member("lincoln");
    testTeam.addMember(newMember);
    assertTrue(testTeam.getMembers().contains(newMember));
  }
}
