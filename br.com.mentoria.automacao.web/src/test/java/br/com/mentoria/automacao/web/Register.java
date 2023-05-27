package br.com.mentoria.automacao.web;

import br.com.mentoria.automacao.web.commons.Dsl;
import br.com.mentoria.automacao.web.configuration.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register  extends Dsl {

    @Test

    public void register (){

       //WebDriverWait wait = new WebDriverWait(driver, 25);


        super.acessSite("https://demo.automationtesting.in/Register.html");
        super.writeByXpath("//input[@placeholder='First Name']", "Carlos");
        super.writeByXpath("//input[@placeholder='Last Name']", "Nunes" );
        super.writeByXpath("//textarea[@ng-model='Adress']", "Teste Endereço");
        super.writeByXpath("//input[@type='email']", "carlosqa@qaetech.com");
        super.writeByXpath("//input[@type='tel']", "11950402943");
        super.clickByXpath("//input[@value='Male']");
        super.clickById("checkbox2");
        super.clickById("msdd");
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ui-corner-all' and text()='Portuguese']")));
        //super.clickByXpath("//a[@class='ui-corner-all' and text()='Portuguese']");
        super.selectById("Skills", "Java" );
        super.clickByXpath("//span[@class='select2-selection select2-selection--single']");
        super.writeByXpath("//input[@class='select2-search__field']", "Austra" );
        super.clickByXpath("//li[@class='select2-results__option select2-results__option--highlighted']");
        super.selectById("yearbox", "1989");
        super.selectByXpath("//select[@ng-model='monthbox']", "October");
        super.selectById("daybox", "16");
        super.writeById("firstpassword", "teste123" );
        super.writeById("secondpassword", "teste123");
        driver.quit();


    }

}
