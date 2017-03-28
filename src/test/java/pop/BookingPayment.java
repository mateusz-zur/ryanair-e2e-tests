package pop;

import org.openqa.selenium.By;

public class BookingPayment {
	
	public static By loginButton = By.xpath("//button[@ui-sref='login']");
	public static By emailField = By.xpath("//input[@type='email']");
	public static By passField = By.xpath("//input[@type='password']"); //Bestpass12345
	public static By loginButtonOnPrompt = By.xpath("//button-spinner[@on-click='$ctrl.doLogin()']");

	public static By titleField = By.xpath("//select[@ng-model='passenger.name.title']");
	public static By firstNameField = By.xpath("//input[@ng-model='passenger.name.first']");
	public static By surnameField = By.xpath("//input[@ng-model='passenger.name.last']");
	
	public static By phoneNumberCountryField = By.xpath("//select[@name='phoneNumberCountry']");
	public static By phoneNumberField = By.xpath("//input[@name='phoneNumber']");
	
	public static By cardNumberField = By.xpath("//input[@name='cardNumber']");
	public static By cardTypeField = By.xpath("//select[@name='cardType']");
	public static By expiryMonthField = By.xpath("//select[@name='expiryMonth']");
	public static By expiryYearField = By.xpath("//select[@name='expiryYear']");
	public static By securityCodeField = By.xpath("//input[@name='securityCode']");
	public static By cardHolderNameField = By.xpath("//input[@name='cardHolderName']");
	
	public static By addressField = By.xpath("//input[@name='sa.nameAddressLine1']");
	public static By cityField = By.xpath("//input[@name='sa.nameCity']");
	public static By acceptPolicyField = By.xpath("//input[@name='acceptPolicy']");
	
	public static By payNowButton = By.xpath("//button[@translate='common.components.payment_forms.pay_now']");
	
	public static By errorMessage = By.xpath("//prompt[@class='error']");
}
