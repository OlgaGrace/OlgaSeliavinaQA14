import org.testng.annotations.Test;


public class CreateContact extends TestBase {

    @Test
    public void contactCreationTest(String firstname1, Object lastname1, Object address1){
goToAddNewPage();
fillContactForm("Olga", "Selevie", "Ramat Gan");
submitContactCreation();
}

}
