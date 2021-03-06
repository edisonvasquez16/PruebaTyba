package co.com.tyba.stepdefinitions;

import co.com.tyba.models.PrestamoModel;
import co.com.tyba.questions.TextosDisponibles;
import co.com.tyba.tasks.DiligenciarDatosPrestamo;
import co.com.tyba.tasks.NoDiligenciarFormulario;
import co.com.tyba.tasks.SeleccionarOpcion;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

import java.util.List;

import static co.com.tyba.ui.CalculoPrestamoPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.Matchers.hasItems;

public class CalculoPrestamoSteps {

    //Metodo encargado de diligenciar el formulario con los datos especificados
    @Dado("^que el usuario ingresa para el calculo de prestamo los datos (.*) y (.*)$")
    public void ingresaDatos(String ingresosMensuales, String plazoAnios) {
        theActorInTheSpotlight().wasAbleTo(DiligenciarDatosPrestamo.con(ingresosMensuales, plazoAnios));
    }

    //Se realiza la selección de la opción Calcular crédito
    @Cuando("^selecciona la opcion de calcular credito$")
    public void seleccionaCalcularCredito() {
        theActorInTheSpotlight().wasAbleTo(SeleccionarOpcion.calcularCredito());
    }

    //Se valida que los valores presentados en la UI correspondan a los esperados separados por datos de prestamo y datos de la tasa de interes
    //Se instancia el objeto encargado de gestionar los datos recibidos
    @Entonces("^el ve los calculos correspondientes para prestamo")
    public void verCalculosEsperados(List<String> data) {
        PrestamoModel prestamoModel = new PrestamoModel(data);
        theActorInTheSpotlight().should(
                seeThat(TextosDisponibles.visibles(TXT_DATOS_PRESTAMO),
                        hasItems(prestamoModel.getIngresoMensual(),
                                prestamoModel.getValorPrestamo(),
                                prestamoModel.getCuotaInicial(),
                                prestamoModel.getValorInmueble())),
                seeThat(TextosDisponibles.visibles(TXT_DATOS_TASA_INTERES),
                        hasItems(prestamoModel.getValorCuota(),
                                prestamoModel.getValorTasaInteres())));
    }

    //Metodo encargado de acceder al módulo de cálculo de prestamo
    @Dado("^que el no diligencia los ingresos mensuales$")
    public void noDiligenciaLosIngresosMensuales() {
        theActorInTheSpotlight().wasAbleTo(NoDiligenciarFormulario.deCredito());
    }

    //Se realiza la respectiva validación de que la opción debe estar deshabilitada
    @Entonces("^el ve el boton de calcular credito deshabilitado$")
    public void veBotonCalcularCreditoDeshabilitado() {
        theActorInTheSpotlight().should(
                seeThat(the(BTN_CALCULAR_CREDITO_DESH), isPresent())
        );
    }

    //Se valida que se visualice el mensaje del valor mínimo para los ingresos
    @Entonces("^el ve el mensaje de valor ingreso minimo$")
    public void veMensajeValorIngresoMinimo() {
        theActorInTheSpotlight().should(
                seeThat(the(MSJ_INGRESO_MINIMO), isPresent()));
    }

    //Se realiza la selección de la opción tramitar, dependiendo sobre que módulo se encuentre ubicado
    @Y("^selecciona la opcion de Tramitar credito para (.*)$")
    public void seleccionaLaOpcionDeTramitarCreditoParaPrestamo(String caso) {
        theActorInTheSpotlight().wasAbleTo(SeleccionarOpcion.tramitarCredito(caso));
    }

    //Se valida que se visualice la ventana emergente donde se realizará el trámite del crédito
    @Entonces("^el ve la ventana emergente para realizar tramite de credito$")
    public void veVentanaEmergenteRealizarTramiteDeCredito() {
        theActorInTheSpotlight().should(
                seeThat(the(TXT_TRAMITAMOS_CREDITO), isVisible()));
    }

}