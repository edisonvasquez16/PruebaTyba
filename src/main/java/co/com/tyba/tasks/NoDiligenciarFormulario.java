package co.com.tyba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.tyba.ui.CalculoCuotasPage.W_CALCULO_CUOTA;
import static co.com.tyba.ui.CalculoPrestamoPage.W_CALCULO_PRESTAMO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class NoDiligenciarFormulario implements Task {


    private final String opcion;
    public NoDiligenciarFormulario(String opcion){
        this.opcion = opcion;
    }

    //Método encargado de acceder al módulo sin diligenciar campos
    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (opcion){
            case "credito":
                actor.attemptsTo(Click.on(W_CALCULO_PRESTAMO));
                break;
            case "cuotas":
                actor.attemptsTo(Click.on(W_CALCULO_CUOTA));
                break;
        }
    }

    public static NoDiligenciarFormulario deCredito() {
        return instrumented(NoDiligenciarFormulario.class,"credito");
    }

    public static NoDiligenciarFormulario deCuotas() {
        return instrumented(NoDiligenciarFormulario.class,"cuotas");
    }
}
