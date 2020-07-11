package co.com.tyba.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class TextosDisponibles implements Question<List<String>> {

    private final Target objetos;

    public TextosDisponibles(Target objeto) {
        this.objetos = objeto;
    }

    public static Question<List<String>> visibles(Target objeto) {
        return new TextosDisponibles(objeto);
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return Text.of(objetos).viewedBy(actor).asList();
    }
}
