import com.telran.addressbook.model.ContactData;
import org.testng.annotations.Test;


public class CreateContact extends TestBase {

    @Test
    public void contactCreationTest() {
        app.goToAddNewPage();
        app.fillContactForm(new ContactData("Olga", "Selevie", "Ramat Gan"));
        app.submitContactCreation();
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
