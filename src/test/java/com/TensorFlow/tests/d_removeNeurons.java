package com.TensorFlow.tests;

import com.TensorFlow.pages.NavigationPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class d_removeNeurons extends TestBase{

    @Test
    public void RemoveNeurons(){
        NavigationPage nav = new NavigationPage();
        Actions actions = new Actions(driver);

        actions.moveToElement(nav.removeNeurons1).click().perform();
        System.out.println("Neuron(s):"+nav.getTextRemoveNeurons1.getText());

        actions.moveToElement(nav.removeNeurons2).click().perform();
        System.out.println("Neuron(s):"+nav.getTextRemoveNeurons2.getText());
    }
}
