package co.com.tyba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TextoEncontrado implements Question<String> {

    private final Target objeto;

    public TextoEncontrado(Target objeto) {
        this.objeto = objeto;
    }

    public static Question<String> visibleEn(Target objeto) {
        return new TextoEncontrado(objeto);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(objeto).viewedBy(actor).asString().trim();
    }
}
