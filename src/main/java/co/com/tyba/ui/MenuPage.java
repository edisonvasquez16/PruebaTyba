package co.com.tyba.ui;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {

    //Opciones del menú principal
    public static final Target MENU_BUSCAR_INMUEBLE = Target.the("Opción menú principal buscar inmueble").locatedBy("//span[contains(text(),'Buscar Inmueble')]");
    public static final Target MENU_NOTICIAS_TENDENCIAS = Target.the("Opción menú principal noticias y tendencias").locatedBy("//span[contains(text(),'Noticias y tendencias')]");
    public static final Target MENU_HERRAMIENTAS = Target.the("Opción menú principal herramientas").locatedBy("//span[contains(text(),'Herramientas')]");

    //SubMenu Herramientas
    public static final Target SUBMENU_CALCULADORA_CREDITO = Target.the("Opción Sub-menú Calculadora credito").locatedBy("//a[@href='https://www.metrocuadrado.com/calculadora-credito-hipotecario-vivienda/']");
    public static final Target SUBMENU_CALCULADORA_SEGUROS = Target.the("Opción Sub-menú Calculadora de seguros").locatedBy("//a[@href='https://www.metrocuadrado.com/calculadora-poliza-seguro-arrendamiento/']");
    public static final Target SUBMENU_PRECIOS_M2 = Target.the("Opción Sub-menú Precios m2").locatedBy("//a[@href='https://www.metrocuadrado.com/noticias/herramientas/precios-m2')]");

}
