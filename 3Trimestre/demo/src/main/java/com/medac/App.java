package com.medac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;

public final class App {
    private App() {
    }

    public static void main(String[] args) throws Exception {

        // Generado por Selenium IDE
        // Nos suscribimos a un NewsLetter generando correos electronicos aleatorios.
        // Repetimos el proceso dos veces para mostrar el generador de correo
        for (int i = 0; i < 2; i++) {
            GeneradorCorreo gr = new GeneradorCorreo();
            WebDriver driver;
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "src\\main\\java\\com\\medac\\driver\\chromedriver.exe");
            driver.get(
                    "https://email-marketing.mdirector.com/suscribete-a-la-newsletter?gclid=EAIaIQobChMIyI-u5sSG_gIV74xoCR1Y7w16EAAYASAAEgLbevD_BwE");
            Thread.sleep(1000);
            driver.manage().window().setSize(new Dimension(974, 1031));
            Thread.sleep(1000);
            driver.findElement(By.id("email")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("email")).sendKeys(gr.generarEmail());
            Thread.sleep(1000);
            driver.findElement(By.id("privacidad")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("#lpg-formButton-35 .btn")).click();
            Thread.sleep(1000);

            driver.quit();
        }

    }
}
