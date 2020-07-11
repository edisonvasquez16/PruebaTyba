package co.com.tyba.stepdefinitions;

import co.com.tyba.models.CuotasModel;
import co.com.tyba.questions.TextosDisponibles;
import co.com.tyba.tasks.DiligenciarDatosCuotas;
import co.com.tyba.tasks.NoDiligenciarFormulario;
import co.com.tyba.tasks.SeleccionarOpcion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static co.com.tyba.ui.CalculoCuotasPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.hasItems;

public class CalculoCuotasSteps {

    @Dado("que el usuario ingresa para el calculo de cuotas los datos (.*) y (.*)")
    public void ingresaDatos(String valorCredito, String plazoAnios) {
        theActorInTheSpotlight().wasAbleTo(DiligenciarDatosCuotas.con(valorCredito, plazoAnios));
    }

    @Cuando("selecciona la opcion de calcular cuotas")
    public void seleccionarCalcularCuotas() {
        theActorInTheSpotlight().wasAbleTo(SeleccionarOpcion.calcularCuotas());
    }

    @Entonces("el ve los calculos correspondientes para cuotas")
    public void verCalculosEsperados(List<String> data) {
        CuotasModel cuotasModel = new CuotasModel(data);
        theActorInTheSpotlight().should(
                seeThat(TextosDisponibles.visibles(TXT_DATOS_PRESTAMO),
                        hasItems(cuotasModel.getValorCredito(),
                                cuotasModel.getIngresosMensuales(),
                                cuotasModel.getCuotaInicial(),
                                cuotasModel.getValorInmueble()))
        );
        theActorInTheSpotlight().should(
                seeThat(TextosDisponibles.visibles(TXT_DATOS_TASA_INTERES),
                        hasItems(cuotasModel.getValorCuotaMensual(),
                                cuotasModel.getValorPrestamo(),
                                cuotasModel.getValorTasaIntere()))
        );
    }

    @Dado("^que el no diligencia el valor del credito$")
    public void noDiligenciaValorDelCredito() {
        theActorInTheSpotlight().wasAbleTo(NoDiligenciarFormulario.deCuotas());
    }

    @Entonces("^el ve el boton de calcular cuotas deshabilitado$")
    public void veBotonCalcularCuotasDeshabilitado() {
        theActorInTheSpotlight().should(
                seeThat(the(BTN_CALCULAR_CUOTAS_DES), isPresent())
        );
    }
}
