import com.telran.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModifyGroup extends TestBase{

    @Test
    public void groupModificationTests(){
        app.goToGroupPage();
        int before = app.getGroupCount();
        app.selectGroup();
        app.initGroupModification();
        app.fillGropuForm(new GroupData("Hope", "Soap", "Life"));
        app.submitGroupModification();
        app.returnToGroupPage();
        int after = app.getGroupCount();
        Assert.assertEquals(after, before);
    }



}
