package co.com.tyba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.tyba.ui.CalculoPrestamoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarDatosPrestamo implements Task {

    private final String ingresosMensuales;
    private final String plazoAnios;

    public DiligenciarDatosPrestamo(String ingresosMensuales, String plazoAnios) {
        this.ingresosMensuales = ingresosMensuales;
        this.plazoAnios = plazoAnios;
    }

    public static DiligenciarDatosPrestamo con(String ingresosMensuales, String plazoAnios) {
        return instrumented(DiligenciarDatosPrestamo.class, ingresosMensuales, plazoAnios);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(W_CALCULO_PRESTAMO),
                Enter.theValue(ingresosMensuales).into(INPUT_INGRESOS_MENSUALES),
                SelectFromOptions.byVisibleText(plazoAnios).from(INPUT_PLAZO_ANIOS)
        );
    }
}
