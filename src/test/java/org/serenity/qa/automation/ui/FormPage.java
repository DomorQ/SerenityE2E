package org.serenity.qa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormPage extends PageObject {
    public static final Target FIRST_NAME = Target.the("first name")
            .located(By.xpath("//input[@id='first-name']"));
    public static final Target LAST_NAME = Target.the("last name")
            .located(By.xpath("//input[@id='last-name']"));
    public static final Target POSTAL_CODE = Target.the("postal code")
            .located(By.xpath("//input[@id='postal-code']"));
    public static final Target CONTINUE = Target.the("continue")
            .located(By.xpath("//input[@id='continue']"));
}
