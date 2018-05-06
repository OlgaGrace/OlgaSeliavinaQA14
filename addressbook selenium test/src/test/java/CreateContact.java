import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class CreateContact extends TestBase {

    @Test
    public void contactCreationTest(String firstname1, Object lastname1, Object address1){
goToAddNewPage();
fillContactForm(firstname1:"Olga", lastname1:"Selyavina", address1:"Ramat Gan" );
submitContactCreation();
}

}
