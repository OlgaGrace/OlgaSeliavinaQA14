import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class DeleteContact extends TestBase {

    @Test
    public void contactDelition(){
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactDelition();
        app.getContactHelper().acceptAlert();
    }

    @Test
    public void contactDelition2(){
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactDelition();
        app.getContactHelper().acceptAlert();
    }

}
