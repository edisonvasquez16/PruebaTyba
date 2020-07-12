package co.com.tyba.navigation;

import co.com.tyba.ui.MetroCuadradoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class AbrirNavegador implements Task {

    //Tarea encargada de realizar la apertura del navegador en la página especificada
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(new MetroCuadradoPage()));
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static AbrirNavegador ahora() {
        return instrumented(AbrirNavegador.class);
    }
}
