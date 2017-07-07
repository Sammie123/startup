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
}
