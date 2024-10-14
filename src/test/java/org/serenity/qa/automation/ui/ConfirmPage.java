package org.serenity.qa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmPage extends PageObject {

    public static final Target FINISH_BOTTON = Target.the("final botton")
            .located(By.xpath("//button[@id='finish']"));
    public static final Target THANKS_FIELD = Target.the("thanks field")
            .located(By.xpath("//h2[contains(text(),'Thank you for your order!')]"));

}
