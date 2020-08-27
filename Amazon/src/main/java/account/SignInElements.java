package account;

public class SignInElements {

    //Sign in class
    public static final String SigninButtonXP = "//span[contains(text(),'Hello, Sign in')]";
    public static final String UserFieldXP = "//input[@id='ap_email']";
    public static final String ContinueButtonXP = "//input[@id='continue']";
    public static final String ContinueButtonValdation = "a-alert-heading";

    //create account
    public static final String CreateAccountButtonID = "createAccountSubmit";
    public static final String CustomerNameXP = "//input[@id='ap_customer_name']";
    public static final String CustomerEmailXP = "//input[@id='ap_email']";
    public static final String CustomerPassword1XP = "//input[@id='ap_password']";
    public static final String CustomerPassword2XP = "//input[@id='ap_password_check']";
    public static final String AmazonAccountXP = "//input[@id='continue']";
    public static final String EmailverificationXP = "//a[contains(text(),'Conditions of Use')]";

    //create account action
    public static final String SigninActionXP = "//span[@class='nav-action-inner']";


}
