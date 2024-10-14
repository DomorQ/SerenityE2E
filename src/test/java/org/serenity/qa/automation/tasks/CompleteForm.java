package org.serenity.qa.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.serenity.qa.automation.ui.FormPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteForm implements Task {

    public static CompleteForm now() {
        return instrumented(CompleteForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Juan").into(FormPage.FIRST_NAME),
                Enter.theValue("Diaz").into(FormPage.LAST_NAME),
                Enter.theValue("170701").into(FormPage.POSTAL_CODE),
                Click.on(FormPage.CONTINUE)
        );
    }
}
