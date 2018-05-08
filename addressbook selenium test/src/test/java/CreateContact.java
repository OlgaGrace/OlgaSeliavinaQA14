import org.testng.annotations.Test;


public class CreateContact extends TestBase {

    @Test
    public void contactCreationTest(){
goToAddNewPage();
fillContactForm("Olga", "Selevie", "Ramat Gan");
submitContactCreation();
}

}
