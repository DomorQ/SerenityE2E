package org.serenity.qa.automation.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.serenity.qa.automation.tasks.AddItemsToCart;
import org.serenity.qa.automation.tasks.CompleteForm;
import org.serenity.qa.automation.tasks.ConfirmOrder;
import org.serenity.qa.automation.tasks.Login;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.serenity.qa.automation.utils.Constants.*;

@Slf4j
public class OpebWebStep {

    @Given("^\"user\" login to the web page")
    public void loginToTheWebPage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR).wasAbleTo(Login.onSauceDemo());
    }

    @When("add items {string} and {string} to cart")
    public void addItemsAndToCart(String product1, String product2) {
        theActorInTheSpotlight().attemptsTo(AddItemsToCart.withProducts(product1, product2));
    }

    @When("complete form")
    public void completeForm() {
        theActorInTheSpotlight().attemptsTo(
                CompleteForm.now()
        );
    }

    @When("check the buy")
    public void checkTheBuy() {
        theActorInTheSpotlight().attemptsTo(
                ConfirmOrder.confirm()
        );
    }

    @Then("confirm order")
    public void confirmOrder() {
        OnStage.theActorInTheSpotlight().should();
    }
}
