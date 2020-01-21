package Pages;

import Core.BasePage;
import Core.Driverfactory;
import org.openqa.selenium.By;

public class InicialPage extends BasePage {

    public void acessarTelaInicial(){
        Driverfactory.getDriver().get("http://srbarriga.herokuapp.com");
    }

    public void setEmail(String email) {
        escrever("email", email);
    }

    public void setSenha(String senha) {
        escrever("senha", senha);
    }

    public void entrar(){
        clicarBotaoPorTexto("Entrar");
    }

    public void logar(String email, String senha) {
        setEmail(email);
        setSenha(senha);
        entrar();
    }

}
