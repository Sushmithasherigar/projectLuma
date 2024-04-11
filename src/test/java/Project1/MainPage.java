package Project1;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainPage {

	
	@Test
	public static void mainExecutionMethod() throws InterruptedException, IOException{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//Create Account
		CreateAccount cn = new CreateAccount(driver);
		
		//SignIn And Logout
		LogInOutPage loginout = new LogInOutPage(driver);
		
		//End to End by adding one item to the cart
		EndToEnd endtoend = new EndToEnd(driver);
		
		//Filling the address details
		FillAddressDetails filladdress = new FillAddressDetails(driver);
		
		//Place Order
		PlaceOrder placeorder = new PlaceOrder(driver);

		//Multiple Items To Cart
		MultipleItemsToCart multipleitemcart = new MultipleItemsToCart(driver);
		
		//Open Multiple Items Together
		OpenMultipleItemsTogether openmultipleitem = new OpenMultipleItemsTogether(driver);
		
		//Add to Fav
		AddToFav addfav = new AddToFav(driver);
		
		//Placing Order with existing Address
		PlacingorderwithExistingAdd existingAddress = new PlacingorderwithExistingAdd(driver);
		
		//Go to Gear Section
		Gear gear =new Gear(driver);
		
		//Login with Negative Scenario
		LogInNegative loginNegative = new LogInNegative(driver);
		
		//Checking Scenario For Forgot Password 
		ForgotResetPassword forgotResetPass = new ForgotResetPassword(driver);
		
		//Placing Order Without Login
		PlaceOrderWithoutLogin placewithoutlogin = new PlaceOrderWithoutLogin(driver);
		
		//Login with Wrong Password
		WrongPassword wrongpassword = new WrongPassword(driver);
		
		//Click on My Order, View Order and Place Order
		MyOrder myorder = new MyOrder(driver);
		
		//Add to Cart logout and login then Check whether added item is in cart
		CheckCart checkcart = new CheckCart(driver);
		
		//Delete 1 Item From Cart click on (alert)ok, change the quantity in cart update and go to view and edit cart clear 2nd item from cart 
		ClearCart clearcart = new ClearCart(driver);
		
		//Empty Cart and click on cart check whether the cart is showing empty
		ClickEmptyCart clickemptycart = new ClickEmptyCart(driver);
		
		//Create Account with Existing account
		CreateAccountwithregisteredAccount crtaccwithregacc = new CreateAccountwithregisteredAccount(driver);
		
		//Add New Address
		AddNewAddress addnewaddress = new AddNewAddress(driver);
		
		//Check for Address list
		AddressBook addressbook = new AddressBook(driver);
		
		//Add New Address from Address Book
		AddAddress addaddress = new AddAddress(driver);
		
		//Login through Data Driven
		DataDrivenLogin datadriven = new DataDrivenLogin(driver);
		
		//To Create Account
//		cn.url();
//		cn.enterFirstname();
//		cn.enterLastname();
//		cn.enterEmail();
//		cn.enterPassword();
//		cn.enterConfirmpassword();
//		cn.clickCreateAnAccount();
		
		//Create Account with Existing account
//		cn.url();
//		crtaccwithregacc.fname();
//		crtaccwithregacc.lname();
//		crtaccwithregacc.email();
//		crtaccwithregacc.pwd();
//		crtaccwithregacc.cpwd();
//		crtaccwithregacc.createaccount();
//		crtaccwithregacc.confirmMessage();
		
		//Login and Logout
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		loginout.logOut();
//		loginout.signedOut();
		
		//Login, Open First Few(5) Item All Together and Logout
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		endtoend.clicklogo();
//		openmultipleitem.clickMen();
//		openmultipleitem.clicktop();
//		loginout.logOut();
//		loginout.signedOut();
				
		//LogIn With New Account, Add One Item to the Cart, Go to Cart, Proceed To Pay, Fill Details with New Address, Place Order and Logout
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		endtoend.clicklogo();
//		endtoend.addOneItemToCart();
//		endtoend.digital();
//		endtoend.addtocart();
//		endtoend.goToCart();
//		endtoend.viewcart();
//		endtoend.proceedToCheckout();
//		filladdress.com();
//		filladdress.street();
//		filladdress.street1();
//		filladdress.street2();
//		filladdress.city();
//		filladdress.state();
//		filladdress.pin();
//		filladdress.country();
//		filladdress.phone();
//		filladdress.shippingmethod();
//		filladdress.nextbutton();
//		placeorder.placeOrder();
//		placeorder.confirmMessage();
//		loginout.logOut();
//		loginout.signedOut();
		

		//LogIn, Add Multiple Items To The Cart
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		endtoend.clicklogo();
//		multipleitemcart.clickwomen();
//		multipleitemcart.topsWomen();
//		multipleitemcart.addSizeL();
//		multipleitemcart.colorWhite();
//		multipleitemcart.addCart();
//		multipleitemcart.clickwomen();
//		multipleitemcart.jackets();
//		multipleitemcart.selectJacket();
//		multipleitemcart.sizeM();
//		multipleitemcart.colorGreen();
//		multipleitemcart.quantity();
//		multipleitemcart.addCart();
//		multipleitemcart.cart();
//		multipleitemcart.checkCartItem();
//		loginout.logOut();
//		loginout.signedOut();
		
		//Delete Item From Cart
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		multipleitemcart.cart();
//		clearcart.delete1();
//		clearcart.ok();
//		clearcart.clickvieweditcart();
//		clearcart.updatequantity();
//		clearcart.clickupdateshoppingcart();
//		clearcart.delete2();
//		clearcart.confimemptyshoppingcart();
//		loginout.logOut();
//		loginout.signedOut();
		
		//Empty Cart check whether the cart is showing empty
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		endtoend.clicklogo();
//		clickemptycart.geararrow();
//		clickemptycart.watches();
//		clickemptycart.clickonlist();
//		clickemptycart.clicklumowatch();
//		clickemptycart.addtocart();
//		clickemptycart.gotocart();
//		clickemptycart.cartClear();
//		clickemptycart.ok();
//		clickemptycart.confimemptycart();
//		loginout.logOut();
//		loginout.signedOut();
		
		//Add One Item To Favorite
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		openmultipleitem.clickMen();
//		addfav.pants();
//		addfav.gympant();
//		addfav.wishlist();
//		addfav.item();
//		loginout.logOut();
//		loginout.signedOut();
		
		//Placing Order with Existing Address
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		endtoend.clicklogo();
//		existingAddress.herohoodie();
//		multipleitemcart.addSizeL();
//		multipleitemcart.colorGreen();
//		existingAddress.clickAddtoCart();
//		existingAddress.clickCart();
//		existingAddress.checkOut();
//		existingAddress.placingOrderWithExistingAdd();
//		placeorder.placeOrder();
//		placeorder.confirmMessage();
//		loginout.logOut();
//		loginout.signedOut();
		
		//Going to Gear Section and Add item from there
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		endtoend.clicklogo();
//		gear.clickgear();
//		gear.clickfitness();
//		gear.rollerclick();
//		gear.navigate();
//		loginout.logOut();
//		loginout.signedOut();
	
		//Login with Negative Scenario
//		loginNegative.eid();
//		loginNegative.pwd();
//		loginNegative.signin();
//		loginNegative.incorrectAccount();
		
		//Checking Scenario For Forgot Password 	
//		forgotResetPass.eid();
//		forgotResetPass.forgot();
//		forgotResetPass.emailid();
//		forgotResetPass.resetpass();
//		forgotResetPass.confirmAlert();
		
		//Placing Order Without Login
//		placewithoutlogin.selectitem();
//		placewithoutlogin.custandcart();
//		placewithoutlogin.addButton();
//		placewithoutlogin.myCart();
//		endtoend.viewcart();
//		endtoend.proceedToCheckout();
//		placewithoutlogin.emailid();
//		placewithoutlogin.firstname();
//		placewithoutlogin.lastname();
//		filladdress.com();
//		filladdress.street();
//		filladdress.street1();
//		filladdress.street2();
//		filladdress.city();
//		filladdress.state();
//		filladdress.pin();
//		filladdress.country();
//		filladdress.phone();
//		filladdress.shippingmethod();
//		filladdress.nextbutton();
//		placeorder.placeOrder();
//		placewithoutlogin.confirmMessage();
		
		//Login with Wrong Password
//		wrongpassword.eid();
//		wrongpassword.pwd();
//		wrongpassword.signin();
//		wrongpassword.incorrectPassword();
		
		//Click on My Order, View Order and Take Screenshot Bill
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		myorder.clickMyOrder();
//		myorder.vieworder();
		
		//Add to Cart logout and login then Check whether added item is in cart
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		endtoend.clicklogo();
//		multipleitemcart.clickwomen();
//		multipleitemcart.topsWomen();
//		multipleitemcart.addSizeL();
//		multipleitemcart.colorWhite();
//		multipleitemcart.addCart();
//		checkcart.clickwomen();
//		checkcart.clickjacket();
//		checkcart.clickjadejacket();
//		multipleitemcart.addSizeL();
//		multipleitemcart.colorGreen();
//		multipleitemcart.quantity();
//		checkcart.addtocart();
//		checkcart.shoppingCart();
//		loginout.logOut();
//		loginout.signedOut();
//		checkcart.signin();
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		endtoend.goToCart();
	
		//Add New Address
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		multipleitemcart.clickwomen();
//		addnewaddress.shorts();
//		addnewaddress.runningshorts();
//		addnewaddress.size();
//		addnewaddress.colorblack();
//		endtoend.addtocart();
//		endtoend.goToCart();
//		endtoend.viewcart();
//		endtoend.proceedToCheckout();
//		addnewaddress.newaddress();
//		addnewaddress.company();
//		addnewaddress.street();
//		addnewaddress.street1();
//		addnewaddress.street2();
//		addnewaddress.city();
//		addnewaddress.state();
//		addnewaddress.pin();
//		addnewaddress.country();
//		addnewaddress.phone();
//		addnewaddress.shipherebutton();
//		addnewaddress.shippingmethod();	
//		filladdress.nextbutton();
//		placeorder.placeOrder();
//		placewithoutlogin.confirmMessage();
		
		//Check for Address list
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		addressbook.clickaddressbook();
//		addressbook.deleteadditionaladdress();
//		addressbook.ok();
		
		//Add New Address from Address Book
//		loginout.emailid();
//		loginout.password();
//		loginout.signin();
//		loginout.loggedIn();
//		addaddress.clickaddressbook();
//		addaddress.addnewaddress();
//		addaddress.company();
//		addaddress.phone();
//		addaddress.street();
//		addaddress.street1();
//		addaddress.street2();
//		addaddress.city();
//		addaddress.state();
//		addaddress.pin();
//		addaddress.country();
//		addaddress.saveaddress();
//		addaddress.confirmsavedadd();
		
		//Login through Data Driven
//		datadriven.dataDrivenLogin();
	}

}
