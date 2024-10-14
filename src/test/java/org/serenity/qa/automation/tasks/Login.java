package org.serenity.qa.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.serenity.qa.automation.ui.LoginPage;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private org.serenity.qa.automation.ui.LoginPage loginPage;

    public static Login onSauceDemo(){
        return instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Open.browserOn().the(loginPage),
                Enter.theValue("standard_user").into(LoginPage.USERNAME_FIELD),
                Enter.theValue("secret_sauce").into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
