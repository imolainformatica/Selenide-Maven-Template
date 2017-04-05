package com.lazerycode.selenium.tests;


import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DownloadExampleSelenideIT {

    @Test
    public void downloadFileExample() throws Exception {

        // And now use this to visit Google
        open("https://www.imolainrete.it/wiki/Pagina_principale");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");
        File file = $("p.footer-dati a").download();
        System.out.println("File is: " +file.getAbsolutePath());
        // Check the title of the page
        System.out.println("Page title is: " + Selenide.title());

    }

}