package co.com.tyba.stepdefinitions;

import co.com.tyba.models.PrestamoModel;
import co.com.tyba.questions.TextosDisponibles;
import co.com.tyba.tasks.DiligenciarDatosPrestamo;
import co.com.tyba.tasks.NoDiligenciarFormulario;
import co.com.tyba.tasks.SeleccionarOpcion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static co.com.tyba.ui.CalculoPrestamoPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.hasItems;

public class CalculoPrestamoSteps {

    @Dado("^que el usuario ingresa para el calculo de prestamo los datos (.*) y (.*)$")
    public void ingresaDatos(String ingresosMensuales, String plazoAnios) {
        theActorInTheSpotlight().wasAbleTo(DiligenciarDatosPrestamo.con(ingresosMensuales, plazoAnios));
    }

    @Cuando("^selecciona la opcion de calcular credito$")
    public void seleccionaCalcularCredito() {
        theActorInTheSpotlight().wasAbleTo(SeleccionarOpcion.calcularCredito());
    }

    @Entonces("^el ve los calculos correspondientes para prestamo")
    public void verCalculosEsperados(List<String> data) {
        PrestamoModel prestamoModel = new PrestamoModel(data);
        theActorInTheSpotlight().should(
                seeThat(TextosDisponibles.visibles(TXT_DATOS_PRESTAMO),
                        hasItems(prestamoModel.getIngresoMensual(),
                                prestamoModel.getValorPrestamo(),
                                prestamoModel.getCuotaInicial(),
                                prestamoModel.getValorInmueble())));
        theActorInTheSpotlight().should(
                seeThat(TextosDisponibles.visibles(TXT_DATOS_TASA_INTERES),
                        hasItems(prestamoModel.getValorCuota(),
                                prestamoModel.getValorTasaInteres())));
    }

    @Dado("^que el no diligencia los ingresos mensuales$")
    public void noDiligenciaLosIngresosMensuales() {
        theActorInTheSpotlight().wasAbleTo(NoDiligenciarFormulario.deCredito());
    }

    @Entonces("^el ve el boton de calcular credito deshabilitado$")
    public void veBotonCalcularCreditoDeshabilitado() {
        theActorInTheSpotlight().should(
                seeThat(the(BTN_CALCULAR_CREDITO_DES), isPresent())
        );
    }
}