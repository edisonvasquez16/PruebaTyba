package co.com.tyba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.tyba.ui.CalculoCuotasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciarDatosCuotas implements Task {
    public static DiligenciarDatosCuotas con(String valorCredito, String plazoAnios) {
        return instrumented(DiligenciarDatosCuotas.class, valorCredito, plazoAnios);
    }

    private final String valorCredito;
    private final String plazoAnios;

    public DiligenciarDatosCuotas(String valorCredito, String plazoAnios) {
        this.valorCredito = valorCredito;
        this.plazoAnios = plazoAnios;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(W_CALCULO_CUOTA),
                Enter.theValue(valorCredito).into(INPUT_VALOR_CREDITO),
                SelectFromOptions.byVisibleText(plazoAnios).from(INPUT_PLAZO_ANIOS)
        );
    }
}
