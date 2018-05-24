import com.telran.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateContact extends TestBase {

    @Test
    public void contactCreationTest() {
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().goToAddNewPage();
        app.getContactHelper().fillContactForm(new ContactData()
                .withFirstName("Olga")
                .withLastname("Selevie")
                .withAddress("Ramat Gan"));
        app.getContactHelper().submitContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before+1);

    }


}
