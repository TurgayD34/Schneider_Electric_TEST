package com.TensorFlow.tests;

import com.TensorFlow.pages.NavigationPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class b_changeNoise extends TestBase{

    @Test
    public void ChangeNoise(){
        NavigationPage nav = new NavigationPage();
        for (int i=0; i <= 5; i++){
            nav.noise.sendKeys(Keys.ARROW_RIGHT);
            if (i < 10); break;
        }


    }

}
