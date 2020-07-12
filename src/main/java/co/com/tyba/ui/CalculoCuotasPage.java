package co.com.tyba.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculoCuotasPage {

    //Pestaña de opción
    public static final Target W_CALCULO_CUOTA = Target.the("Opcion para acceder a la ventana de cálculo de cuotas").located(By.className("vercuotas"));

    //Campos de diligenciamiento
    public static final Target INPUT_VALOR_CREDITO = Target.the("Caja de texto valor del crédito").located(By.name("loadAmount"));
    public static final Target INPUT_PLAZO_ANIOS = Target.the("Select plazo en años").locatedBy("//select[@ng-model='termInYearsByQuota']");

    //Opciones de interaccion
    public static final Target BTN_CALCULAR_CUOTAS = Target.the("Botón calcular cuotas").locatedBy("//button[@ng-click='calculateByQuota()']");
    public static final Target BTN_CALCULAR_CUOTAS_DES = Target.the("Botón calcular cuotas deshabilitado").locatedBy("//button[@ng-click='calculateByQuota()' and @disabled]");
    public static final Target BTN_TRAMITAR_CREDITOC = Target.the("Botón traminar crédito deshabilitado").locatedBy("(//a[contains(text(),'¡Tramitar crédito!')])[2]");

    //Campos de calculos realizados
    public static final Target TXT_DATOS_PRESTAMO = Target.the("Datos de cuotas").locatedBy("//dd");
    public static final Target TXT_DATOS_TASA_INTERES = Target.the("Datos de tasa interes").locatedBy("//td[@class='ng-binding']");
    public static final Target MSJ_VALORCREDITO_MINIMO = Target.the("Mensaje de validación ingreso mínimo").locatedBy("//p[contains(text(),'El valor del crédito debe ser mayor o igual a $15,000,000.')]");

}
