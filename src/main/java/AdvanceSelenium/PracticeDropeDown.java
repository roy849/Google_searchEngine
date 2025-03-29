package AdvanceSelenium;

import common.Googlebase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PracticeDropeDown extends Googlebase{


   public static void  main(String[]args) throws InterruptedException {



       launchBrowser( "https://the-internet.herokuapp.com/dropdown");


       WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));

           Select s =new Select(dropDown);





           // selecting by the index number
       s.selectByIndex(1);
        Thread.sleep (3000);//  setting timer
       // selecting by the value
       s.selectByValue("2");


       Thread.sleep (3000);// setting timer for delay

       // selecting by the visible text
            s.selectByVisibleText("Option1");



            //deselecting the dropdown
       s.deselectByIndex(1);
       s.deselectByValue("2");
       s.deselectByVisibleText("");





       List<WebElement> allItems = s.getOptions();
       for(int i =0;i<allItems.size();i++){
           System.out.println(allItems.get(i).getText());
       }






   }

}
