package test.util;

import static test.util.DriverFactory.*;

import org.openqa.selenium.By;

public class DSL {
    public void escrever (By by, String texto ){
        getDriver().findElement(by).sendKeys(texto);
    }
    public void clicarBotão (By by){
        getDriver().findElement(by).click();
    }
    public String obterTexto(By by){
        return getDriver().findElement(by).getText();
    }
    public void limparEditText(By by){
        getDriver().findElement(by).clear();
    }
}
