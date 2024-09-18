package testing;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class UserRegistrationTest {
    private WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setUp(String browser){
//        BrowserFactory bf = new BrowserFactory();
        driver = BrowserFactory.getDriver(browser);
        driver.get("https://formy-project.herokuapp.com/form");
    }

    @AfterMethod
    public void tearDown(){
        BrowserFactory.closeDriver();
    }

    @Test
    public void RegistrationTest() {

        User user = new UserBuilder()
                .setFirstName("John")
                .setLastName("Doe")
                .setJobTitle("QA Engineer")
                .setHighestLevelOfEducation("Bachelor")
                .setSex("Male")
                .setYearsOfExperience(5)
                .setAutomationTester(true)
                .setDate("01/01/2022")
                .build();

        // Fill the form using the user data
        driver.findElement(By.id("first-name")).sendKeys(user.getFirstName());
        driver.findElement(By.id("last-name")).sendKeys(user.getLastName());
        driver.findElement(By.id("job-title")).sendKeys(user.getJobTitle());
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-2")).click();
        driver.findElement(By.xpath("//select[@id='select-menu']//option[@value=3]")).click();
        driver.findElement(By.id("datepicker")).sendKeys(user.getDate());
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        // Close the browser
        //driver.quit();
    }

}