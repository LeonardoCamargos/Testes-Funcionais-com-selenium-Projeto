package Tests;

import Core.BasePage;
import Core.BaseTest;
import Pages.MenuPage;
import Pages.ResumoPage;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static Core.Driverfactory.getDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTest {
private MenuPage menuPage = new MenuPage();
private ResumoPage resumoPage = new ResumoPage();

    @Test
    public void test1ExcluirMovimentacao(){
        menuPage.acessarTelaResumo();

        resumoPage.excluiMovimentacao();

        Assert.assertEquals("Movimentação removida com sucesso!",
                resumoPage.obterMensagemSucesso());
    }

    @Test
    public void test2ResumoMensal(){
        menuPage.acessarTelaResumo();

        Assert.assertEquals("Seu Barriga - Extrato", getDriver().getTitle());
    }


}
