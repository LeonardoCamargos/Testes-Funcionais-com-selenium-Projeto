package Core;

public class Propriedades {

    public static boolean FECHAR_BROWSER = true;

    public static Browsers browsers = Browsers.CHROME;

    public enum Browsers {
        CHROME,
        FIREFOX
    }
}
//Caso queira que feche a cada execução coloque = true;