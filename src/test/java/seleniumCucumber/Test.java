package seleniumCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Test {
	
	private ChromeDriver driver;
	
	@Given("^El usuario se encuentra en la pagina Home de HappyFamily$")
	public void el_usuario_se_encuentra_en_la_pagina_Home_de_HappyFamily() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver.exe");
	    ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.happyfamily.cl/pages/Academia");
        driver.manage().window().maximize();
	    
	}

	@When("^Hacer click sobre el link en el navbar Servicios de Coaching$")
	public void hacer_click_sobre_el_link_en_el_navbar_Servicios_de_Coaching() throws Throwable {
	   WebElement services = driver.findElement(By.linkText("Servicio de Coaching"));
	   services.click();
	}

	@Then("^Debe redirigir a la pagina Servicio de Coaching$")
	public void debe_redirigir_a_la_pagina_Servicio_de_Coaching() throws Throwable {
	    WebElement pageTitleLocal = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/article/header/h2"));
	    Assert.assertTrue("No se encontro el localizador",pageTitleLocal.isDisplayed());
	    Assert.assertEquals("Sección de coaching", pageTitleLocal.getText());
	    
	}
	
}
