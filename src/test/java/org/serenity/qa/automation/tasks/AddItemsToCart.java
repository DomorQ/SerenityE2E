package org.serenity.qa.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.serenity.qa.automation.ui.ProductPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddItemsToCart implements Task {

    public static AddItemsToCart withProducts(String product1, String product2) {
        return instrumented(AddItemsToCart.class, product1, product2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductPage.ADD_TO_ITEM1_BOTTON),
                Click.on(ProductPage.ADD_TO_ITEM2_BOTTON),
                Click.on(ProductPage.CAR_LINK_BOTTON),
                Click.on(ProductPage.CHECK_OUT)
        );
    }
}
