package net.onlinenotepad.Tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.onlinenotepad.UserInterfaces.NotepadOnlineUserInterfaces.btnNotaEnriquecida;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class NotaEnrriquecidaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(btnNotaEnriquecida)
        );
    }

    public static NotaEnrriquecidaTask crearNotaEnrriquecida(){
        return instrumented(NotaEnrriquecidaTask.class);
    }
}
