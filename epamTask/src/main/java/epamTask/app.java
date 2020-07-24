package epamTask;
import java.util.Arrays;
import java.util.List;
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		averagecalculation avgobj = new averagecalculation();
		wordslist wordsobj = new wordslist();
		palindrome palindromeobj = new palindrome();
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<String>  list2 = Arrays.asList("apple","app","bank","Adv","uhyt");
		List<String>  list3 = Arrays.asList("hoh","kuh","bharath","Hii","MADAM");
	
	
	System.out.println(avgobj.average(list1));
	System.out.println(wordsobj.search(list2));
	System.out.println(palindromeobj.filterPalindromes(list3));
}}
