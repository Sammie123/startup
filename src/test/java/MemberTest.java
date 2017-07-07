import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void member_instantiatesCorrectly_true() {
    Member testMember = new Member("Lincoln");
    assertEquals(true, testMember instanceof Member);
  }

  @Test
  public void getName_memberWithName_Name() {
    Member testMember = new Member("Lincoln");
    assertEquals("Lincoln", testMember.getName());
  }

  @Test
  public void all_returnMember_true() {
    Member firstMember = new Member("Lincoln");
    Member secondMember = new Member("Sam");
    assertEquals(true, Member.all().contains(firstMember));
    assertEquals(true, Member.all().contains(secondMember));
  }

  @Test
  public void clear_clearMembers_0() {
    Member testMember = new Member("Lincoln");
    Member.clear();
    assertEquals(Member.all().size(), 0);
  }

  @Test
  public void getId_memberId_1() {
    Member testMember = new Member("Lincoln");
    assertEquals(1, testMember.getId());
  }

  @Test
  public void addTeam_addsTeamToMembers_true(){
    Member testMember = new Member("Lincoln");
    Team testTeam = new Team("Barbell");
    testMember.addTeam(testTeam);
    assertTrue(testMember.getTeams().contains(testTeam));
  }
}
