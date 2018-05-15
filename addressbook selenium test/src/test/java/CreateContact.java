import com.telran.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateContact extends TestBase {

    @Test
    public void contactCreationTest() {
        int before = app.getContactCount();
        app.goToAddNewPage();
        app.fillContactForm(new ContactData("Olga", "Selevie", "Ramat Gan"));
        app.submitContactCreation();
        int after = app.getContactCount();
        Assert.assertEquals(after,before+1);

    }
    @Test
        public void contactCreationTest2(){
        app.goToAddNewPage();
        app.fillContactForm(new ContactData("Olga2", "Selevie2", "Ramat Gan2"));
        app.submitContactCreation();
}
    @Test
    public void contactCreationTest3() {
        app.goToAddNewPage();
        app.fillContactForm(new ContactData("Olga3", "Selevie3", "Ramat Gan3"));
        app.submitContactCreation();
    }

}
