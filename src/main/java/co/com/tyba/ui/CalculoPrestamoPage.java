package co.com.tyba.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CalculoPrestamoPage {

    //Pestaña de opción
    public static final Target W_CALCULO_PRESTAMO = Target.the("Opcion para acceder a la ventana de cálculo de prestamo").located(By.className("verprestamo"));

    //Campos de diligenciamiento
    public static final Target INPUT_INGRESOS_MENSUALES = Target.the("Caja de texto ingresos mensuales").located(By.id("ingresosMensuales"));
    public static final Target INPUT_PLAZO_ANIOS = Target.the("Select plazo en Años").locatedBy("//select[@ng-model='termInYears']");
    public static final Target BTN_CALCULAR_CREDITO = Target.the("Botón calcular crédito").locatedBy("//button[@ng-click='calculateByMonthlyIncome()']");
    public static final Target BTN_CALCULAR_CREDITO_DES = Target.the("Botón calcular crédito deshabilitado").locatedBy("//button[@ng-click='calculateByMonthlyIncome()' and @disabled]");

    //Campos de calculos realizados
    public static final Target TXT_DATOS_PRESTAMO = Target.the("Datos de prestamo").locatedBy("//dd");
    public static final Target TXT_DATOS_TASA_INTERES = Target.the("Datos de tasa interes").locatedBy("//td[@class='ng-binding']");

}
