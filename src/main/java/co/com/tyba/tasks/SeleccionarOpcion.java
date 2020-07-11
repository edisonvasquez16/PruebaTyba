package co.com.tyba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.tyba.ui.CalculoCuotasPage.BTN_CALCULAR_CUOTAS;
import static co.com.tyba.ui.CalculoPrestamoPage.BTN_CALCULAR_CREDITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarOpcion implements Task {
    public static SeleccionarOpcion calcularCredito() {
        return instrumented(SeleccionarOpcion.class, "credito");
    }

    public static SeleccionarOpcion calcularCuotas() {
        return instrumented(SeleccionarOpcion.class, "cuotas");
    }

    private final String opcion;

    public SeleccionarOpcion(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (opcion) {
            case "credito":
                actor.attemptsTo(Click.on(BTN_CALCULAR_CREDITO));
                break;
            case "cuotas":
                actor.attemptsTo(Click.on(BTN_CALCULAR_CUOTAS));
                break;
        }
    }
}
