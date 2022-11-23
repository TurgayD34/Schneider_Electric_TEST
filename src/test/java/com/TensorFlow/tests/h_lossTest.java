package com.TensorFlow.tests;

import com.TensorFlow.pages.NavigationPage;
import org.testng.annotations.Test;

public class h_lossTest extends TestBase{

    @Test
    public void LossTest(){

        NavigationPage nav = new NavigationPage();

        System.out.println(nav.epocValue.getText());
    }
}
