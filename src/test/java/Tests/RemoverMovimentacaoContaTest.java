package Tests;

import Core.BasePage;
import Core.BaseTest;
import Core.Propriedades;
import Pages.ContasPage;
import Pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class RemoverMovimentacaoContaTest extends BaseTest {

    MenuPage menuPage = new MenuPage();
    ContasPage contasPage = new ContasPage();

    @Test
    public void testExcluirContaComMovimentacao(){
        menuPage.acessarTelaListarConta();

        contasPage.clicarExcluirConta(Propriedades.NOME_CONTA_ALTERADA);

        Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
    }

}
