package Tests;

import Core.BaseTest;
import Core.Propriedades;
import Pages.HomePage;
import Pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class SaldoTest extends BaseTest {
    HomePage page = new HomePage();
    MenuPage menu = new MenuPage();

    @Test
    public void testSaldoConta(){
        menu.acessarTelaPrincipal();
        Assert.assertEquals("500.00", page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
    }

}
