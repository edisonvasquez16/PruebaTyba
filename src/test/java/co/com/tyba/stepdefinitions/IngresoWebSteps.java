package co.com.tyba.stepdefinitions;

import co.com.tyba.navigation.AbrirNavegador;
import co.com.tyba.tasks.AccederModulo;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IngresoWebSteps {

    @Dado("^que el usuario (.*) accede hasta la pagina de metrocuadrado$")
    public void usuarioAccedePagina(String nombreUsuario){
        theActorCalled(nombreUsuario).wasAbleTo(AbrirNavegador.ahora());
    }
    @Cuando("^accede hasta el modulo de CALCULADORA DE CREDITO PARA VIVIENDA$")
    public void accedeModuloCalculadora(){
        theActorInTheSpotlight().wasAbleTo(AccederModulo.calculadora());
    }
}
