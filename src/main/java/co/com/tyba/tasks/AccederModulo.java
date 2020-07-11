package co.com.tyba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.tyba.ui.MenuPage.MENU_HERRAMIENTAS;
import static co.com.tyba.ui.MenuPage.SUBMENU_CALCULADORA_CREDITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccederModulo implements Task {

    public static AccederModulo calculadora() {
        return instrumented(AccederModulo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(MENU_HERRAMIENTAS),
                MoveMouse.to(MENU_HERRAMIENTAS));
        actor.attemptsTo(Click.on(SUBMENU_CALCULADORA_CREDITO));
    }
}
