package com.TensorFlow.tests;

import com.TensorFlow.pages.NavigationPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c_moreFeatures extends TestBase{

    private Object link;

    @Test
    public void MoreFeatures(){
        NavigationPage nav = new NavigationPage();
        Actions actions = new Actions(driver);

        String actFeatureSinX = nav.featuresSinX.getAttribute("class");
        if ("canvas inactive".equals(actFeatureSinX)){
            actions.moveToElement(nav.featuresSinX).click().perform();
        }
        // There is another way also, we can use contains method but, if method is more comfortable
        String actFeatureSinY = nav.featuresSinY.getAttribute("class");
        if ("canvas inactive".equals(actFeatureSinY)){
            actions.moveToElement(nav.featuresSinY).click().perform();
        }

    }
}
