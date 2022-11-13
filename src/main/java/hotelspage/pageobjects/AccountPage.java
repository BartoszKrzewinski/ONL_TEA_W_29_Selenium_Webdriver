package hotelspage.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

    private final WebDriver driver;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAlertText(){
        WebElement alert = driver.findElement(By.className("alert"));
        return alert.getText();
    }

    public HomePage clickHomeLogo(){
        WebElement homeLogo = driver.findElement(By.id("header_logo"));
        homeLogo.click();
        return new HomePage(driver);
    }
}