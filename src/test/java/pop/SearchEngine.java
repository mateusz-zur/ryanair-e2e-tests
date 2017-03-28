package pop;

import org.openqa.selenium.By;

public class SearchEngine {
	
	public static By oneWayButton = By.id("flight-search-type-option-one-way");
	public static By flightOriginField = By.xpath("//input[@aria-labelledby='label-airport-selector-from']");
	public static By flightDestinationField = By.xpath("//input[@aria-labelledby='label-airport-selector-to']");
	public static By flyOutDateField = By.xpath("//input[@ng-model='date[0]']");
	public static By passengersField = By.xpath("//div[@passengers='flightModel.passengers']");
	public static By findButton = By.xpath("//button[@ng-click='searchFlights()']");
	public static By flyOutDate = By.xpath("//li[@data-id='29-04-2017']");
	
}