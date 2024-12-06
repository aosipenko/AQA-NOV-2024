package org.prog.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SeleniumIphone {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();


        try {
            driver.get("https://allo.ua/");
            WebElement searchInput = driver.findElement(By.id("search-form__input"));
            searchInput.sendKeys("iphone");
            searchInput.sendKeys(Keys.ENTER);

            List<WebElement> searchResults =
                    new WebDriverWait(driver, Duration.ofSeconds(60))
                            .until(ExpectedConditions.numberOfElementsToBeMoreThan(By.className("products-layout__item"), 10));

            WebElement firstIphone = driver.findElement(By.cssSelector(".product-card__title"));
            String iphoneModel = firstIphone.getText();


            System.out.println("The first model of iPhone is find: " + iphoneModel);

        } finally {
            driver.quit();
        }
    }
}
