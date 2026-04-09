package Testngbatch64;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howtohandledisableelement {

    public static void main(String[] args) throws Exception {

        ChromeDriver b = new ChromeDriver();
        b.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
        b.manage().window().maximize();
     
       
        // Step 1: Switch to iframe
        b.switchTo().frame("iframeResult");

        // Step 2: Locate disabled element
        WebElement lastn = b.findElement(By.id("lname"));

        // Step 3: Remove disabled attribute using JS
        JavascriptExecutor js = (JavascriptExecutor) b;
        js.executeScript("arguments[0].removeAttribute('disabled')", lastn);

        // Step 4: Now send value
        lastn.sendKeys("Patil");

    }
}