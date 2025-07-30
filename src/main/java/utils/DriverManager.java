package utils;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	// Private static variable to hold the driver instance
    private static WebDriver driver;

    // Setter method to store the driver
    public static void setWebDriver(WebDriver driverInstance) {
        driver = driverInstance;
    }

    // Getter method to retrieve the driver
    public static WebDriver getWebDriver() {
        return driver;
    }
}


