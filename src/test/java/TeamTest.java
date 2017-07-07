import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {
  @Test
  public void Team_instantiatesCorrectly_true() {
    Team myTeam = new Team("Barbell");
    assertEquals(true, myTeam instanceof Team);
  }
}
