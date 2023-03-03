package test.page;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import test.util.DSL;

public class DadosPessoaisPage {
    DSL dsl = new DSL();
    Thread thread = new Thread();
    public void escreverNome(String nome) {
        dsl.escrever(By.id("com.example.menuactivity:id/et_nome"),nome);
    }
    public void escreverSobrenome(String sobrenome) {
        dsl.escrever(By.id("com.example.menuactivity:id/et_sobrenome"),sobrenome);
    }
    public void escreverData(String data) {
        dsl.escrever(By.id("com.example.menuactivity:id/et_dt"),data);
    }
    public void clicarSalvar() throws InterruptedException {
        dsl.clicarBotão(By.id("com.example.menuactivity:id/bt_salvar"));
        thread.sleep(1000);
    }
    public String obterResultado() {
       return dsl.obterTexto(By.id("com.example.menuactivity:id/tv_resultado"));
    }
}
