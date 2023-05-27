package br.com.mentoria.automacao.web;

import br.com.mentoria.automacao.web.commons.Dsl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class SwitchTo extends Dsl {

    @Before
    public void beforeTest(){
        super.acessSite("https://demo.automationtesting.in/Register.html");
        super.actionByXpath("//a[@class='dropdown-toggle' and text()='SwitchTo']");
    }


    @Test

    public void iframeTest(){


        super.clickByXpath("//a[text()='Frames']");
        super.iframeById("aswift_2");
        super.iframeById("ad_iframe");
        super.clickById("dismiss-button");

    }

    @Test

    public void multipleIframe(){

        super.clickByXpath("//a[text()='Frames']");
        super.iframeById("aswift_2");
        super.iframeById("ad_iframe");
        super.clickById("dismiss-button");
        super.quitIframe();
        super.clickByXpath("//a[@class='analystic' and text()='Iframe with in an Iframe']");
        super.iframeByXpath("//iframe[@src='MultipleFrames.html']");
        super.iframeByXpath("//iframe[@src='SingleFrame.html']");
        super.writeByXpath("//input[@type='text']" , "Teste");



    }

    @Test
    public void interactionAlertOk(){
        super.clickByXpath("//a[text()='Alerts']");
        super.iframeById("aswift_2");
        super.iframeById("ad_iframe");
        super.clickById("dismiss-button");
        super.quitIframe();
        super.clickByXpath("//button[@class='btn btn-danger']");
        super.acceptAlert();

    }

    @Test
    public void interactionAlertCancel(){
        super.clickByXpath("//a[text()='Alerts']");
        super.iframeById("aswift_2");
        super.iframeById("ad_iframe");
        super.clickById("dismiss-button");
        super.quitIframe();
        super.clickByXpath("//a[@href='#CancelTab']");
        super.clickByXpath("//button[@class='btn btn-primary']");
        super.dismissAlert();
        Assert.assertEquals("You Pressed Cancel", super.recoverValueById("demo"));

    }

    @Test
    public void interactionAlertTextOk(){
        super.clickByXpath("//a[text()='Alerts']");
        super.iframeById("aswift_2");
        super.iframeById("ad_iframe");
        super.clickById("dismiss-button");
        super.quitIframe();
        super.clickByXpath("//a[@href='#Textbox']");
        super.clickByXpath("//button[@class='btn btn-info']");
        super.textAlert("Carlos");
        super.acceptAlert();
        System.out.println(super.recoverValueById("demo1"));
    }

    @After
    public void afterTest(){
        driver.quit();
    }

}
