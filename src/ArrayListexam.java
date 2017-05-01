//Traversing  Arraylist by using for loop

	import java.util.ArrayList;
	                                           //import java.util.Arrays;
	public class ArrayListexam 
	{
		public static void main(String args[])
		{
		   String [] things = {"how", "are", "you"};
		    ArrayList<String> a = new ArrayList<String> ();
		    for(String x : things)
		    {
		        a.add(x);
		    }
			
			//System.out.println(a);
		    // or use this to print the arraylist
		    
			for(int i =0; i<a.size();i++){
		   System.out.printf("%s", a.get(i));
				//System.out.println(a);
			}
		}
	}

