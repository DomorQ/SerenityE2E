package org.serenity.qa.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static org.serenity.qa.automation.ui.ConfirmPage.FINISH_BOTTON;

public class ConfirmOrder implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FINISH_BOTTON)
        );
    }

    public static ConfirmOrder confirm(){
        return Tasks.instrumented(ConfirmOrder.class);
    }
}
