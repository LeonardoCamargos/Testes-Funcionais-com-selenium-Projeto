package Pages;

import Core.BasePage;
import org.openqa.selenium.By;

public class ResumoPage extends BasePage {

    public void excluiMovimentacao(){

        clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
    }

    public String obterMensagemSucesso(){

        return obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }

}
