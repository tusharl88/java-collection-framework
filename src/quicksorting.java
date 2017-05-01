
public class quicksorting {
    public static void main(String [] args){
        int [] a= {10,80,30,90,40,50,70};
        int n= a.length;
        quicksort(a,0,n-1); // here we are not creating object from quicksorting thats why all methods created are static.
        printarray(a);
    }

public static void quicksort(int [] b,int low ,int high){
    if(low<high){
    int pi= partition(b,low ,high); // goes to partition method.
    quicksort(b,low,pi-1);       // recursion is occuring for elements before pivot where sorted elements also undergoes quicksort until loop ends.
    quicksort(b,pi+1,high); // recursion is occuring for elements after pivot to sort them. 
    }
    
}
public static int partition(int []b, int low, int high){
   int  pivot= b[high];
    int pindex = low ;
    for(int i=low;i<=high-1; i++){
        if(b[i]<=pivot){
            
            int t=b[i];     // here we are doing swapping by using t variable  
            b[i]=b[pindex];    // we can also create static swap method and pass our array b but it would create another array, hence more space is required.
            b[pindex]=t;    // and if we were using c++ we could have easily used pointers.
            pindex++;
        }
    }
    int t= b[high];
    b[high]=b[pindex];
    b[pindex]=t;
    return pindex;
    
}
public static void printarray(int[] c){
	for(int i=0; i<c.length;i++){
		System.out.println("Sorted array is "+c[i]);
	}
}
}

