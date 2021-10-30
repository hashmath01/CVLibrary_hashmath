package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

    WebDriver driver;

    public WebDriver lauchBrowser(String browsername){

        switch (browsername){
            case "chrome":
                System.setProperty("webdriver.chrome.driver","C:\\Users\\44744\\IdeaProjects\\CVLibrary\\src\\main\\resources\\Drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;
            default:
                System.setProperty("webdriver.chrome.driver","C:\\Users\\44744\\IdeaProjects\\CVLibrary\\src\\main\\resources\\Drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();

        }
        return  driver;
    }
}
