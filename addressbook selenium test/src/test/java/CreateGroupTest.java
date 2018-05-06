import org.testng.annotations.*;

public class CreateGroupTest extends TestBase {


  @Test(priority = 1)
  public void testUntitledTestCase() throws Exception {
    goToGroupPage();
    createNewGroup();
    fillGropuForm("header", "name", "footer");
    submitGroupCreation();
    returnToGroupPage();
    System.out.println("passed 1");
  }

  @Test(priority = 3)
  public void groupLongName() throws Exception {
    goToGroupPage();
    createNewGroup();
    fillGropuForm("namelong", "headerlong", "footerlong");
    submitGroupCreation();
    returnToGroupPage();
    System.out.println("passed 3");
  }

  @Test(priority = 2)
  public void groupShortName() throws Exception {
    goToGroupPage();
    createNewGroup();
    fillGropuForm("ns", "hs", "footerlong");
    submitGroupCreation();
    returnToGroupPage();
    System.out.println("passed 2");
  }

  @Test(priority = 4)
  public void testUntitledTestCase2() throws Exception {
    goToGroupPage();
    createNewGroup();
    fillGropuForm("name", "header", "footer");
    submitGroupCreation();
    returnToGroupPage();
    System.out.println("passed 1");
  }
}
