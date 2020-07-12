package co.com.tyba.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculoPrestamoPage {

    //Pestaña de opción
    public static final Target W_CALCULO_PRESTAMO = Target.the("Opcion para acceder a la ventana de cálculo de prestamo").located(By.className("verprestamo"));

    //Campos de diligenciamiento
    public static final Target INPUT_INGRESOS_MENSUALES = Target.the("Caja de texto ingresos mensuales").located(By.id("ingresosMensuales"));
    public static final Target INPUT_PLAZO_ANIOS = Target.the("Select plazo en Años").locatedBy("//select[@ng-model='termInYears']");

    //Opciones de interacción
    public static final Target BTN_CALCULAR_CREDITO = Target.the("Botón calcular crédito").locatedBy("//button[@ng-click='calculateByMonthlyIncome()']");
    public static final Target BTN_CALCULAR_CREDITO_DES = Target.the("Botón calcular crédito deshabilitado").locatedBy("//button[@ng-click='calculateByMonthlyIncome()' and @disabled]");
    public static final Target BTN_TRAMITAR_CREDITOP = Target.the("Botón traminar crédito deshabilitado").locatedBy("(//a[contains(text(),'¡Tramitar crédito!')])[1]");

    //Campos de calculos realizados
    public static final Target TXT_TRAMITAMOS_CREDITO = Target.the("Ventana emergente para tramitar crédito").locatedBy("//h3[contains(text(),'Tramitamos tu crédito')]");
    public static final Target TXT_DATOS_PRESTAMO = Target.the("Datos de prestamo").locatedBy("//dd");
    public static final Target TXT_DATOS_TASA_INTERES = Target.the("Datos de tasa interes").locatedBy("//td[@class='ng-binding']");
    public static final Target MSJ_INGRESO_MINIMO = Target.the("Mensaje de validación ingreso mínimo").locatedBy("//p[contains(text(),'Los ingresos deben ser mayores o iguales a $737,717.')]");

}
