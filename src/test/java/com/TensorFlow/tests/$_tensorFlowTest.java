package com.TensorFlow.tests;

import com.TensorFlow.pages.NavigationPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class $_tensorFlowTest extends TestBase{

    @Test
    public void TensorFlowTest() throws InterruptedException {
        Actions actions = new Actions(driver);
        NavigationPage nav = new NavigationPage();

        // Change dataset to exclusive as shown in
        actions.moveToElement(nav.datasetExclusive).click().perform();
        Assert.assertTrue(nav.datasetExclusive.isDisplayed(),"Verify Exclusive is displayed");


        // Change noise to 5 percent
        for (int i=0; i <= 5; i++){
            nav.noise.sendKeys(Keys.ARROW_RIGHT);
            if (i < 10); break;
        }

        // Select two more features
        String actFeatureSinX = nav.featuresSinX.getAttribute("class");
        if ("canvas inactive".equals(actFeatureSinX)){
            actions.moveToElement(nav.featuresSinX).click().perform();
        }
        // There is another way also, we can use contains method but, if method is more comfortable
        String actFeatureSinY = nav.featuresSinY.getAttribute("class");
        if ("canvas inactive".equals(actFeatureSinY)){
            actions.moveToElement(nav.featuresSinY).click().perform();
        }

        // Remove one neuron (d) and (e)
        actions.moveToElement(nav.removeNeurons1).click().perform();
        actions.moveToElement(nav.removeNeurons2).click().perform();

        // Change learning rate to 0.1
        Select selectValue = new Select(nav.changeLearningTest);
        selectValue.selectByVisibleText("0.1");

        // Click to run the simulation
        boolean simulations = nav.simulation.getAttribute("class").toLowerCase().contains("playing");
        if (simulations = true) {
            actions.moveToElement(nav.runSimulation).click().perform();
        }

        // Wait until epoch is more than 0.3
        Thread.sleep(5700);
        actions.moveToElement(nav.pauseSimulation).click().perform();

        // Report the test loss value in console
        System.out.println("Epoch Value is "+nav.epocValue.getText());


    }
}
