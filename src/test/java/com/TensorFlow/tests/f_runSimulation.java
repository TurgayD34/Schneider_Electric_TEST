package com.TensorFlow.tests;

import com.TensorFlow.pages.NavigationPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class f_runSimulation extends TestBase{

    @Test
    public void runAndPauseSimulation(){

        NavigationPage nav = new NavigationPage();
        Actions actions = new Actions(driver);

        boolean simulations = nav.simulation.getAttribute("class").toLowerCase().contains("playing");
        if (simulations = true) {
            actions.moveToElement(nav.runSimulation).click().perform();
        }
    }
}
