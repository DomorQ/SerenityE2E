package org.serenity.qa.automation.questions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@AllArgsConstructor
@Slf4j

public class ValidateOrder implements Question<Boolean> {

    private static final Target THANKS_FOR_THE_ORDER = Target.the("thanks for the order")
            .located(By.xpath("//h2[contains(text(),'Thank you for your order!')]"));

    public static Question<Boolean> areVisible(){
        return new ValidateOrder();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return THANKS_FOR_THE_ORDER.resolveFor(actor).isVisible();
    }
}
