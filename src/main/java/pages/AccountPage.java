package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

    private WebDriver webDriver;

    // Locators for username, password, login button, and error message
    private By usernameInput = By.id("username"); // Username field
    private By passwordInput = By.id("password"); // Password field
    private By loginButton = By.cssSelector("button.woocommerce-button[name='login']"); // Login button
    private By errorMessage = By.cssSelector("ul.woocommerce-error"); // Login error message container

    // Constructor: initializes the WebDriver
    public AccountPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    // Method to enter the username
    public void enterUsername(String username) {
        webDriver.findElement(usernameInput).clear(); // Clear field before typing
        webDriver.findElement(usernameInput).sendKeys(username); // Type username
    }

    // Method to enter the password
    public void enterPassword(String password) {
        webDriver.findElement(passwordInput).clear(); // Clear field before typing
        webDriver.findElement(passwordInput).sendKeys(password); // Type password
    }

    // Method to click the login button
    public void clickLogin() {
        webDriver.findElement(loginButton).click();
    }

    // Method to attempt login with provided credentials
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    // Method to retrieve the error message if login fails
    public String getLoginErrorMessage() {
        return webDriver.findElement(errorMessage).getText();
    }
}
