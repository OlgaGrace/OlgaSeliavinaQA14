import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class DeleteContact extends TestBase {

    @Test
    public void contactDelition(){
        app.selectContact();
        app.initContactDelition();
        app.acceptAlert();
    }

    @Test
    public void contactDelition2(){
        app.selectContact();
        app.initContactDelition();
        app.acceptAlert();
    }

}
