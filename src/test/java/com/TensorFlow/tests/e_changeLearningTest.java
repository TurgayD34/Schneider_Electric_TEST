package com.TensorFlow.tests;

import com.TensorFlow.pages.NavigationPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class e_changeLearningTest extends TestBase{

    @Test
    public void ChangeLearningTest() {
        NavigationPage nav = new NavigationPage();

        Select selectValue = new Select(nav.changeLearningTest);
        List<WebElement> options = selectValue.getOptions();
        for (WebElement option : options){
            System.out.println(option.getText());
        }
        selectValue.selectByVisibleText("0.1");
        //Assert ekle
    }
}
