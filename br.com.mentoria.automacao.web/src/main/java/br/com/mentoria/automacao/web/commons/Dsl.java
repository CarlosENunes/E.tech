package br.com.mentoria.automacao.web.commons;

import br.com.mentoria.automacao.web.configuration.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dsl extends BaseTest {

    /**
     * Acessar uma url
     * @param url Inserir url desejada
     */

    public void acessSite(String url){

        driver.get(url);

    }

    /**
     * Escreve em um elemento desejado
     * @param xpath Insira o xpath
     * @param text Insira o texto desejado
     */

    public void writeByXpath(String xpath, String text){

        driver.findElement(By.xpath(xpath)).sendKeys(text);

    }

    /**
     * Escreve em um elemento desejado
     * @param id Insira o id
     * @param text Insira o texto desejado
     */

    public void writeById(String id, String text){

        driver.findElement(By.id(id)).sendKeys(text);

    }


    /**
     * Clicar em um elemento desejado
     * @param xpath Inserir o xpath do elemento
     */

    public void clickByXpath (String xpath){

        driver.findElement(By.xpath(xpath)).click();

    }

    /**
     * Clicar em um elemento desejado
     * @param id Inserir o id do elemento
     */

    public void clickById (String id){

        driver.findElement(By.id(id)).click();

    }

    /**
     * Selecionar uma opção a partir de um select
     * @param id Inserir o id do elemento
     * @param value Inserir o value do elemento
     */

    public void selectById(String id, String value){

        Select select = new Select(driver.findElement(By.id(id)));
        select.selectByValue(value);

    }

    /**
     * Selecionar uma opção a partir de um select
     * @param xpath Inserir o xpath do elemento
     * @param value Inserir o value do elemento
     */

    public void selectByXpath(String xpath, String value){

        Select select = new Select(driver.findElement(By.xpath(xpath)));
        select.selectByValue(value);

    }

    /**
     * Realiza a interação do cursor até o elemento
     * @param xpath Inserir o xpath do elemento
     */

    public void actionByXpath(String xpath){

        Actions action = new Actions(driver);
        WebElement element = driver.findElement(By.xpath(xpath));
        action.moveToElement(element).build().perform();

    }

    /**
     * Alterar para um iframe
     * @param id Inserir o id do iframe
     */

    public void iframeById(String id){
        driver.switchTo().frame(id);

    }

    /**
     * Alterar para um iframe
     * @param xpath Inserir o xpath do iframe
     */

    public void iframeByXpath(String xpath){
        driver.switchTo().frame(driver.findElement(By.xpath(xpath)));



}

    /**
     * Sair do frame atual
     */
    public void quitIframe(){
        driver.switchTo().defaultContent();
    }

    /**
     * Clicar em um botão ok de um alert
     */

    public void acceptAlert(){
        super.driver.switchTo().alert().accept();
    }

    /**
     * Clicar no botão Cancelar do alert
     */
    public void dismissAlert(){
        super.driver.switchTo().alert().dismiss();
    }

    /**
     * Escrever um texto em um alert
     * @param text
     */
    public void textAlert(String text){
        super.driver.switchTo().alert().sendKeys(text);
    }

    /**
     * Recuperar o valor de um elemento a partir de um id
     * @param id
     */
    public String  recoverValueById(String id){
         return super.driver.findElement(By.id(id)).getText();
    }

}

