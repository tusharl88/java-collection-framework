import java.util.Scanner;
public class BinarySearch {
public  static int BinarySear(int [] a,int n, int x){
	int left = 0;
	int right = n -1;
	int middle = (left + right)/2;
	while(left<= right){
		if( x == a[middle]){
			return middle;
		}
		else if(x<a[middle]){
			right = middle -1;
			
		}
		else{
			right = middle -1;
		}
	}
	return -1;
}
 public static void main(String [] args){
	 int [] data = { 2,4,5,7, 13 ,14 ,15,23};
	 System.out.println("enter a number");
	 Scanner in = new Scanner(System.in);
	 int x = in.nextInt();
	 int returnvalue = BinarySear(data, 8, x);
	 if(returnvalue != -1){
		 System.out.println("element found at index"+ returnvalue);
	 }
	 else{
		 System.out.println("element not found");
	 }
 }
	 
	 }
 
