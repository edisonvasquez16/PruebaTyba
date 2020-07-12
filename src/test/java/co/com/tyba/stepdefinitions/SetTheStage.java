package co.com.tyba.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetTheStage {

    //Metodo encargado de iniciar la instancia del actor para entrar en contexto
    @Before
    public void setTheStage(){ OnStage.setTheStage(new OnlineCast()); }

}
