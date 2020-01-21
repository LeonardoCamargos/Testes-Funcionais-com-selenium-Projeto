package Core;

import Pages.InicialPage;
import Tests.ContaTest;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static Core.Driverfactory.getDriver;
import static Core.Driverfactory.killDriver;


public class BaseTest {


    @Rule
    public TestName testName = new TestName();



    @After
    public void finaliza() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target"+ File.separator + "ScreenShots" +
                File.separator + testName.getMethodName()+".jpg"));

        if(Propriedades.FECHAR_BROWSER){
            killDriver();
        }
    }

}
