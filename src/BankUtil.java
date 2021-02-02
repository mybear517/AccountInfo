import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BankUtil {
    private BankAccount[] arr;
	public BankUtil(int size) {
		// TODO Auto-generated constructor stub
		arr = new BankAccount[size];
	}
   public boolean newCustomer(BankAccount ba) {
	   for(int i=0; i< arr.length; i++) {
		   if(arr[i] == null) {
			   arr[i] = ba;
			   return true;
		   }
	   }
	   return false;
   }
   public boolean modifyCustomer(int accNo,BankAccount ba) {
	   for(int i=0; i< arr.length; i++) {
		   if(arr[i].getAccNo() == accNo) {
			   arr[i] = ba;
			   return true;
		   }
	   }
	   return false;
   }
   public boolean removeCustomer(int accNo,BankAccount ba) {
	   for(int i=0; i< arr.length; i++) {
		   if(arr[i].getAccNo() == accNo) {
			   arr[i] = null;
			   return true;
	       }
	   }
	   return false;
   }
   public boolean getCustomer(int accNo,BankAccount ba) {
	   for(int i=0; i< arr.length; i++) {
		   if(arr[i] != null && arr[i].getAccNo() == accNo) {
			   arr[i] = ba;
			   return true;
		   }
	   }
	   return false;
   }
   public boolean getAllCustomers(BankAccount ba) {
	   for(int i=0; i< arr.length; i++) {
			   arr[i] = ba;
			   return true;
	   }
	   return false;
   }

   public ArrayList getArray(BankAccount ba) {
	   ArrayList arrList = new ArrayList();
	   System.out.println("size-" + arr.length);
	   for(int i=0; i< arr.length; i++) {
		   if(arr[i] != null) {
			   arrList.add(arr[i]);
		   }
	   }
	   return arrList;
   }
}
