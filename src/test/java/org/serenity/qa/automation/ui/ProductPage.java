package org.serenity.qa.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    public static final Target ADD_TO_ITEM1_BOTTON = Target.the("add to cart button")
            .located(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
    public static final Target ADD_TO_ITEM2_BOTTON = Target.the("add to cart button")
            .located(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
    public static final Target CAR_LINK_BOTTON = Target.the("car link")
            .located(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
    public static final Target CHECK_OUT = Target.the("check out")
            .located(By.xpath("//button[@id='checkout']"));
}
