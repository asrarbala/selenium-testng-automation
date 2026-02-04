    package com.asrar.automation.utils;

    import com.asrar.automation.config.ConfigReader;
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import java.time.Duration;

    public class WaitHelper {

        private WebDriver driver;
        private WebDriverWait wait;

        public WaitHelper(WebDriver driver) {
            this.driver = driver;

            int timeout = ConfigReader.getExplicitWait();
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        }

        // Wait for visibility
        public WebElement waitForVisibility(By locator) {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(locator));
        }

        // Wait for clickability
        public WebElement waitForClickable(By locator) {
            return wait.until(
                    ExpectedConditions.elementToBeClickable(locator));
        }

        // Wait for presence in DOM
        public WebElement waitForPresence(By locator) {
            return wait.until(
                    ExpectedConditions.presenceOfElementLocated(locator));
        }

        // Wait for text in element
        public boolean waitForText(By locator, String text) {
            return wait.until(
                    ExpectedConditions.textToBePresentInElementLocated(locator, text));
        }

        // Wait for URL contains
        public boolean waitForUrlContains(String partialUrl) {
            return wait.until(
                    ExpectedConditions.urlContains(partialUrl));
        }

        // Wait for invisibility (useful for loaders)
        public boolean waitForInvisibility(By locator) {
            return wait.until(
                    ExpectedConditions.invisibilityOfElementLocated(locator));
        }
    }
