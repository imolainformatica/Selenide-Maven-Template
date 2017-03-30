package com.lazerycode.selenium.tests;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.exist;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleExampleSelenideIT {

    @Test
    public void googleCheeseExample() throws Exception {

        // And now use this to visit Google
        open("http://www.google.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

        // Find the text input element by its name
        // Enter something to search for
       $(By.name("q")).setValue("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        $(By.name("q")).submit();

        // Check the title of the page
        System.out.println("Page title is: " + Selenide.title());

        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        $(By.className("g")).waitUntil(exist,10000);
        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + Selenide.title());
    }

}