package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;

    public static WebDriver GetDriver(){
        if(driver == null){

            driver = new ChromeDriver();
        }
        return driver;
    }
    public static WebDriver quitDriver(){
        if(driver!= null){
            driver.quit();

        }
        return null;

    }
}
