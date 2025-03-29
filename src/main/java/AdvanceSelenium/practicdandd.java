package AdvanceSelenium;

import common.Googlebase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class practicdandd extends Googlebase {


    public static void main(String[]args){


        launchBrowser("https://the-internet.herokuapp.com/drag_and_drop");

 // it is basically changing the position between two things.
        WebElement colA = driver.findElement(By.xpath("//div[@id='column-a']"));
        WebElement colB = driver.findElement(By.xpath("//div[@id='column-b']"));

        Actions act =new Actions(driver);

       act.dragAndDrop(colA,colB).build().perform();
  // act.dragAndDropBy(colA,100,200).build().perform(); // this method not popular
    }
}
