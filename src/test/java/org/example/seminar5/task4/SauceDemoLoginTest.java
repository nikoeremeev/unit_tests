package org.example.seminar5.task4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SauceDemoLoginTest {

    public static void main(String[] args) {
// Установите путь к драйверу браузера Chrome
        System.setProperty("webdriver.chrome.driver", "путь_к_вашему_драйверу/chromedriver");

// Создайте экземпляр веб-драйвера Chrome
        WebDriver driver = new ChromeDriver();

// Откройте сайт https://www.saucedemo.com/
        driver.get("https://www.saucedemo.com/");

// Найдите поле ввода логина и введите логин "standard_user"
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

// Найдите поле ввода пароля и введите пароль "secret_sauce"
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

// Найдите кнопку "Login" и нажмите на нее
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

// Используйте явное ожидание, чтобы дождаться загрузки страницы с продуктами
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product_label")));

// Проверьте, что на странице отображается надпись "Products"
        WebElement productsLabel = driver.findElement(By.className("product_label"));
        String label = productsLabel.getText();

        if ("Products".equals(label)) {
            System.out.println("Авторизация прошла успешно. Товары отображаются.");
        } else {
            System.out.println("Ошибка авторизации или товары не отображаются.");
        }

// Закройте браузер
        driver.quit();
    }
}
