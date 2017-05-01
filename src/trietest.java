
public class trietest {
	public static void main(String [] args){
trietest dict = new trietest();
dict.insert("are");
dict.insert("area");
dict.inser("base");
dict.inser("cat");
dict.inser("cater");
dict.inser("basement");

String input = "catrer";
System.out.print(input+"");
System.out.println(dict.getMatchingPrefix(input));

input = "basement";
System.out.print(input + ":   ");
System.out.println(dict.getMatchingPrefix(input));                      

input = "are";
System.out.print(input + ":   ");
System.out.println(dict.getMatchingPrefix(input));              

input = "arex";
System.out.print(input + ":   ");
System.out.println(dict.getMatchingPrefix(input));              

input = "basemexz";
System.out.print(input + ":   ");
System.out.println(dict.getMatchingPrefix(input));                      

input = "xyz";
System.out.print(input + ":   ");
System.out.println(dict.getMatchingPrefix(input));
}
}

