package Pages;

import Core.BasePage;
import org.kohsuke.rngom.parse.host.Base;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public String obterSaldoConta(String nome){

        return obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();
    }
}
