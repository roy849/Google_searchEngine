package AdvanceSelenium;

import common.Googlebase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class practiceCheckbox extends Googlebase {



    public static void main(String[]args){


        launchBrowser( "//the-internet.herokuapp.com/hovers");

        WebElement chk1 = driver.findElement(By.xpath( "(//input[@type='checkbox'])[1]"));
        WebElement  chk2 =driver.findElement(By.xpath( "(//input[@type='checkbox'])[2]"));


        if (chk1 .isSelected()){

            chk1.click();
        }

         if(chk2 . isSelected()){

            System.out.println("check box 2 is already selected");
        }


    }
}
