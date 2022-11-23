package com.TensorFlow.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPage extends BasePage{

    @FindBy(xpath = "//canvas[@data-dataset='xor']")
    public WebElement datasetExclusive;

    @FindBy(id = "noise")
    public WebElement noise;

    // Neurons
    @FindBy(xpath = "//div[@class='ui-numNodes1']/button[2]/i")
    public WebElement removeNeurons1;

    @FindBy(xpath = "//*[@class=\"plus-minus-neurons\"][1]/div[2]")
    public WebElement getTextRemoveNeurons1;

    @FindBy(xpath = "//div[@class='ui-numNodes2']/button[2]/i")
    public WebElement removeNeurons2;

    @FindBy(xpath = "//*[@class=\"plus-minus-neurons\"][2]/div[2]")
    public WebElement getTextRemoveNeurons2;

    //Features
    @FindBy(id = "canvas-sinY")
    public WebElement featuresSinY;

    @FindBy(id = "canvas-sinX")
    public WebElement featuresSinX;

    //Dropdown
    @FindBy(id = "learningRate")
    public WebElement changeLearningTest;

    // Run/Pause Simulation
    @FindBy(xpath = "//*[@id='play-pause-button']/i[1]")
    public WebElement runSimulation;

    @FindBy(xpath = "//*[@id='play-pause-button']/i[2]")
    public WebElement pauseSimulation;

    @FindBy(xpath = "//*[@title='Run/Pause']")
    public WebElement simulation;

    @FindBy(id = "iter-number")
    public WebElement epocValue;

    @FindBy(id = "loss-test")
    public WebElement getTestLoss;


}
