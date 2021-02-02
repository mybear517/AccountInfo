import java.util.ArrayList;


public class BankApp {

	public static void main(String[] args) {
	    BankAccount ba = new BankAccount();

	  
	   BankUtil util = new BankUtil(5);
       util.newCustomer(new BankAccount(101, "venna", 1000));
       util.newCustomer(new BankAccount(102, "Smith", 4000));
       util.newCustomer(new BankAccount(103, "Johnson", 3000));
       util.newCustomer(new BankAccount(104, "Carl", 5000));
       System.out.println("Created New Customers" );
       
   /*    ArrayList lst = util.getArray(ba);
        for(int i=0; i<lst.size(); i++) {
        	System.out.println("List" + lst.get(i));
        }
  */
       util.modifyCustomer(102, ba);
       System.out.println("Modified Customer");
       
      util.removeCustomer(103, ba);
       System.out.println(" Removed Customer");
       util.getCustomer(104, ba); 
       System.out.println(" Got one Customer");

       util.getAllCustomers(ba);
       System.out.println(" Got All Customers");
	}
	 public static void printArray(int[] a) {
	      System.out.print("[ ");
	      for (int i = 0; i < a.length; i++) {
	         System.out.print(a[i] + " ");
	      }
	      System.out.println("]");
	   }

}
