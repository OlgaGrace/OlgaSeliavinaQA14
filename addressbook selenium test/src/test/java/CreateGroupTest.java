import com.telran.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.*;

public class CreateGroupTest extends TestBase {


  @Test(priority = 1)
  public void testUntitledTestCase() throws Exception {
    app.goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createNewGroup();
    app.getGroupHelper().fillGropuForm(new GroupData("header", "name", "footer"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    System.out.println("passed 1");
    Assert.assertEquals(after, before+1);
  }

  @Test(priority = 3)
  public void groupLongName() throws Exception {
    app.goToGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createNewGroup();
    app.getGroupHelper().fillGropuForm(new GroupData("namelong", "headerlong", "footerlong"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before+1);
    System.out.println("passed 3");
  }

  @Test(priority = 2)
  public void groupShortName() throws Exception {
    app.goToGroupPage();
    app.getGroupHelper().createNewGroup();
    app.getGroupHelper().fillGropuForm(new GroupData("ns", "hs", "footerlong"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    System.out.println("passed 2");
  }

  @Test(priority = 4)
  public void testUntitledTestCase2() throws Exception {
    app.goToGroupPage();
    app.getGroupHelper().createNewGroup();
    app.getGroupHelper().fillGropuForm(new GroupData("name", "header", "footer"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
    System.out.println("passed 1");
  }
}
