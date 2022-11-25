package com.TensorFlow.tests;

import com.TensorFlow.pages.NavigationPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class a_changeDataset extends TestBase{

    @Test
    public void ChangeDataSet() {
        // Go to the page: https://playground.tensorflow.org
        // This has been achived throw Driver class and configuration.properties for inputs (browser, url)
        Actions actions = new Actions(driver);
        NavigationPage nav = new NavigationPage();

        actions.moveToElement(nav.datasetExclusive,100,100).click().perform();
        Assert.assertTrue(nav.datasetExclusive.isDisplayed(),"Verify Exclusive is displayed");
















    }
}
