package AdvanceSelenium;

import common.Googlebase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;



public class practiceswitchingwindo extends Googlebase {

    public static void main(String[]args) {


        launchBrowser("https://the-internet.herokuapp.com/hovers");

        WebElement clickHereButton = driver.findElement(By.linkText("click Here"));
        clickHereButton.click();

        switchingWindowByTitle(driver, "New Window");

        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println(text.getText());
    }

    private static void switchingWindowByTitle(WebDriver driver, String newWindow) {
    }
    //System.out.println(driver.getWindowHandle());
        //System.out.println(driver.getWindowHandles());
        //System.out.println(driver.getTitle());

   public static void  switchWindowByTitle(WebDriver driver , String title)
         {


       String currentWindow = driver.getWindowHandle();
       Set<String> allWindows = driver.getWindowHandles();

       for (String winHandle: allWindows){

           if (!driver.switchTo().window(winHandle).getTitle().equals(title)){

               driver.switchTo().window(currentWindow);

           }

       }


        }

    }



