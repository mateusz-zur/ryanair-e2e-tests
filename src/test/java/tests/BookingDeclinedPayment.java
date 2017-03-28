package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pop.BookingPayment;
import pop.ExtrasBooking;
import pop.ResultsOfSearch;
import pop.SearchEngine;

public class BookingDeclinedPayment {
	
	@Test
	public void bookingDeclinedPaymentTest() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://www.ryanair.com/ie/en/");
		driver.findElement(SearchEngine.oneWayButton).click();
		driver.findElement(SearchEngine.flightOriginField).clear();
		driver.findElement(SearchEngine.flightOriginField).sendKeys("Wroclaw", Keys.RETURN);
		driver.findElement(SearchEngine.flightDestinationField).clear();
		driver.findElement(SearchEngine.flightDestinationField).sendKeys("Lisbon", Keys.RETURN);
		driver.findElement(SearchEngine.flyOutDateField).click();
		driver.findElement(SearchEngine.flyOutDate).click();
		driver.findElement(SearchEngine.findButton).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(ResultsOfSearch.flightSelectBox));
		driver.findElement(ResultsOfSearch.flightSelectBox).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(ResultsOfSearch.selectButton));
		driver.findElement(ResultsOfSearch.selectButton).click();
		wait.until(ExpectedConditions.elementToBeClickable(ResultsOfSearch.continueButton));
		driver.findElement(ResultsOfSearch.continueButton).click();
		wait.until(ExpectedConditions.elementToBeClickable((ExtrasBooking.checkOutButton)));
		driver.findElement(ExtrasBooking.checkOutButton).click();
		wait.until(ExpectedConditions.presenceOfElementLocated((ExtrasBooking.closeSeatPromptButton)));
		driver.findElement(ExtrasBooking.closeSeatPromptButton).click();
		wait.until(ExpectedConditions.elementToBeClickable((BookingPayment.loginButton)));
		driver.findElement(BookingPayment.loginButton).click();
		wait.until(ExpectedConditions.presenceOfElementLocated((BookingPayment.emailField)));
		driver.findElement(BookingPayment.emailField).sendKeys("o261923@mvrht.com");
		driver.findElement(BookingPayment.passField).sendKeys("Bestpass12345");
		driver.findElement(BookingPayment.loginButtonOnPrompt).click();
		Thread.sleep(800);
		wait.until(ExpectedConditions.presenceOfElementLocated((BookingPayment.firstNameField)));
		driver.findElement(BookingPayment.titleField).sendKeys("mr", Keys.RETURN);
		driver.findElement(BookingPayment.firstNameField).sendKeys("Mateusz");
		driver.findElement(BookingPayment.surnameField).sendKeys("Zur");
		
		driver.findElement(BookingPayment.phoneNumberCountryField).sendKeys("poland", Keys.RETURN);
		driver.findElement(BookingPayment.phoneNumberField).sendKeys("500500500");
		
		driver.findElement(BookingPayment.cardNumberField).sendKeys("4024007115942418");
		driver.findElement(BookingPayment.cardTypeField).sendKeys("Vis", Keys.RETURN);
		driver.findElement(BookingPayment.expiryMonthField).sendKeys("10", Keys.RETURN);
		driver.findElement(BookingPayment.expiryYearField).sendKeys("2018", Keys.RETURN);
		driver.findElement(BookingPayment.securityCodeField).sendKeys("416");
		driver.findElement(BookingPayment.cardHolderNameField).sendKeys("SYDNEY LONGMAN");
		
		driver.findElement(BookingPayment.addressField).sendKeys("Sample address 5");
		driver.findElement(BookingPayment.cityField).sendKeys("Wroclaw");
		driver.findElement(BookingPayment.acceptPolicyField).click();
		
		driver.findElement(BookingPayment.payNowButton).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated((BookingPayment.errorMessage)));
	}

}