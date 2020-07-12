package co.com.tyba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.tyba.ui.CalculoCuotasPage.BTN_CALCULAR_CUOTAS;
import static co.com.tyba.ui.CalculoCuotasPage.BTN_TRAMITAR_CREDITOC;
import static co.com.tyba.ui.CalculoPrestamoPage.BTN_CALCULAR_CREDITO;
import static co.com.tyba.ui.CalculoPrestamoPage.BTN_TRAMITAR_CREDITOP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcion implements Task {
    private final String opcion;
    private String caso;

    public SeleccionarOpcion(String opcion) {
        this.opcion = opcion;
    }
    public SeleccionarOpcion(String opcion, String caso) {
        this.opcion = opcion;
        this.caso = caso;
    }

    //Método encargado de seleccionar las diferentes opciones del módulo, dependiendo de que parámetro se reciba en el constructor
    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (opcion) {
            case "credito":
                actor.attemptsTo(Click.on(BTN_CALCULAR_CREDITO));
                break;
            case "cuotas":
                actor.attemptsTo(Click.on(BTN_CALCULAR_CUOTAS));
                break;
            case "tramitar":
                if (caso.equals("prestamo"))
                    actor.attemptsTo(Click.on(BTN_TRAMITAR_CREDITOP));
                if (caso.equals("cuotas"))
                    actor.attemptsTo(Click.on(BTN_TRAMITAR_CREDITOC));
                break;
        }
    }

    public static SeleccionarOpcion calcularCredito() {
        return instrumented(SeleccionarOpcion.class, "credito");
    }

    public static SeleccionarOpcion calcularCuotas() {
        return instrumented(SeleccionarOpcion.class, "cuotas");
    }

    public static SeleccionarOpcion tramitarCredito(String caso) { return instrumented(SeleccionarOpcion.class, "tramitar", caso); }
}
