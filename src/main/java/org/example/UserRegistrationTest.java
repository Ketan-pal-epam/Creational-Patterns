package org.example;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class UserRegistrationTest {
    @Test
    public void testRegisteration() {
        WebDriver driver = BrowserFactory.getInstance().getDriver();
        driver.get("https://formy-project.herokuapp.com/form");

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
        driver.findElement(By.id("datepicker")).sendKeys(user.getDate());
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        // Close the browser
        //driver.quit();
    }
}