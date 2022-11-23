package com.TensorFlow.tests;

import com.TensorFlow.pages.NavigationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class g_epoch extends TestBase {

    @Test
    public void epochValue() throws InterruptedException {
        NavigationPage nav = new NavigationPage();
        Actions actions = new Actions(driver);

        boolean simulations = nav.simulation.getAttribute("class").toLowerCase().contains("playing");
        if (simulations = true) {
            actions.moveToElement(nav.runSimulation).click().perform();
        }
        if (nav.epocValue.getText() == "000,300"){

        }

        actions.moveToElement(nav.pauseSimulation).click().perform();

        Thread.sleep(7500);
        // We can use StringBuilder but if there is specific number
        System.out.println("Epoch Value"+nav.epocValue.getText());
        
    }
}