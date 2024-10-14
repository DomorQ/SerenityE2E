package org.serenity.qa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://www.saucedemo.com/")
public class LoginPage extends PageObject {
    public static final Target USERNAME_FIELD = Target.the("username field")
            .located(By.xpath("//input[@id='user-name']"));
    public static final Target PASSWORD_FIELD = Target.the("password field")
            .located(By.xpath("//input[@id='password']"));
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.xpath("//input[@id='login-button']"));
}
