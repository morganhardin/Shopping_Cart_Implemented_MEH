/** 
 * 
 * @author morganhardin
 *
 */
public class Application 
{
	/** This main method creates a new instance of the
	 * ShoppingCart class using strings and then 
	 * calls the various methods in that class to test
	 * and manipulate them.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Shopping_Cart_Implemented_MEH<String> ShoppingCart = new Shopping_Cart_Implemented_MEH<>();
		
		System.out.println("Is Cart Empty: " + ShoppingCart.isEmpty() + "\n");
		ShoppingCart.addItem("Shirt");
		ShoppingCart.addItem("Pants");
		ShoppingCart.addItem("Shoes");
		ShoppingCart.addItem("Socks");
		ShoppingCart.addItem("Hat");
		System.out.println("Items in Cart: " + ShoppingCart.toString());
		System.out.println("Is Cart Empty: " + ShoppingCart.isEmpty());
		System.out.println("Cart's Current Size: " + ShoppingCart.getCurrentSize() + "\n");
		
		ShoppingCart.removeItem("Shoes");
		System.out.println("Items in Cart: " + ShoppingCart.toString());
		System.out.println("Cart's Current Size: " + ShoppingCart.getCurrentSize() + "\n");
		
		System.out.println("Item Removed: " + ShoppingCart.removeItem());
		System.out.println("Items in Cart: " + ShoppingCart.toString());
		System.out.println("Cart's Current Size: " + ShoppingCart.getCurrentSize() + "\n");
		
		ShoppingCart.addItem("Shirt");
		ShoppingCart.addItem("Shirt");
		System.out.println("Items in Cart: " + ShoppingCart.toString());
		System.out.println("Cart's Current Size: " + ShoppingCart.getCurrentSize() + "\n");
		System.out.println("Frequency of Shirt: " + ShoppingCart.getFrequencyOf("Shirt") + "\n");
		
		ShoppingCart.addItem("Belt");
		System.out.println("Does Cart Contain Belt: " + ShoppingCart.containsItem("Belt") + "\n");
		
		ShoppingCart.clearCart();
		System.out.println("Items in Cart: " + ShoppingCart.toString());
		System.out.println("Is Cart Empty: " + ShoppingCart.isEmpty());
		System.out.println("Cart's Current Size: " + ShoppingCart.getCurrentSize());
	}
}
