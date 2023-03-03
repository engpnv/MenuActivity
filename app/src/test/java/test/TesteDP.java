package test;

import test.page.DadosPessoaisPage;
import test.page.MenuPage;
import test.util.DSL;
import test.util.DriverFactory;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TesteDP {
    private AndroidDriver<MobileElement> driver;
    private final DSL dsl = new DSL();
    private MenuPage menu = new MenuPage();
    private DadosPessoaisPage dadosPessoaisPage = new DadosPessoaisPage();
    @Before
    public void inicializar() throws InterruptedException {
        driver = DriverFactory.getDriver();
        menu.acessarDadosPessoais();
    }

    @Test
    public void testaCamposTextos() throws InterruptedException {
        dadosPessoaisPage.escreverNome("Pablo");
        dadosPessoaisPage.escreverSobrenome("Nunes Vargas");
        dadosPessoaisPage.escreverData("22/05/1986");
        dadosPessoaisPage.clicarSalvar();
        Assert.assertEquals("nome: Pablo Nunes Vargas nascido em: 22/05/1986", dadosPessoaisPage.obterResultado());
    }

    @After
    public void finalizar() {
        DriverFactory.finalizarDriver();
    }
}
