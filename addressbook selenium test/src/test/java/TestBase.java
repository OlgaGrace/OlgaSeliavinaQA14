import com.telran.addressbook.appManager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass ( alwaysRun = true)
    public void setUp() throws Exception {
        app.start();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

}
