import com.telran.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateContact extends TestBase {

    @Test
    public void contactCreationTest() {
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().goToAddNewPage();
        app.getContactHelper().fillContactForm(new ContactData("Olga", "Selevie", "Ramat Gan"));
        app.getContactHelper().submitContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after,before+1);

    }
    @Test
        public void contactCreationTest2(){
        app.getNavigationHelper().goToAddNewPage();
        app.getContactHelper().fillContactForm(new ContactData("Olga2", "Selevie2", "Ramat Gan2"));
        app.getContactHelper().submitContactCreation();
}
    @Test
    public void contactCreationTest3() {
        app.getNavigationHelper().goToAddNewPage();
        app.getContactHelper().fillContactForm(new ContactData("Olga3", "Selevie3", "Ramat Gan3"));
        app.getContactHelper().submitContactCreation();
    }

}
