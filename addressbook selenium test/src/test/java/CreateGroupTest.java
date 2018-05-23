import com.telran.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

public class CreateGroupTest extends TestBase {


  @Test
  public void testUntitledTestCase() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createNewGroup();
    app.getGroupHelper().fillGropuForm(new GroupData("header", "name", "footer"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    System.out.println("passed 1");
    Assert.assertEquals(after, before+1);
  }

  @Test
  public void groupLongName() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createNewGroup();
    app.getGroupHelper().fillGropuForm(new GroupData("namelong", "headerlong", "footerlong"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before+1);
    System.out.println("passed 3");
  }

  @Test
  public void groupShortName() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().createNewGroup();
    app.getGroupHelper().fillGropuForm(new GroupData("ns", "hs", "footerlong"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    System.out.println("passed 2");
  }

  @Test
  public void testUntitledTestCase2() throws Exception {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().createNewGroup();
    app.getGroupHelper().fillGropuForm(new GroupData("name", "header", "footer"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    System.out.println("passed 1");
  }
}
