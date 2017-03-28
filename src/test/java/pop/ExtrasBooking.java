package pop;

import org.openqa.selenium.By;

public class ExtrasBooking {
	
	public static By checkOutButton = By.xpath("//button[@ng-click='$ctrl.checkout()']");
	public static By closeSeatPromptButton = By.xpath("//button[@ng-click='closeThisDialog()']");

}