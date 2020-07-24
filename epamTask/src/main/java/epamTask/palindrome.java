package epamTask;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class palindrome {
	private static boolean isPalindrome(String str) {//method to check if the given string is palindrome or not.
		String tempString = str.replaceAll("\\s", "").toLowerCase();
		return IntStream.range(0,tempString.length()/2).
				noneMatch(i -> tempString.charAt(i)!=tempString.charAt(tempString.length()-i-1));
	}
	
	List<String> filterPalindromes(List<String> list) { 
		return list.stream()
				.filter(str -> isPalindrome(str))
				.collect(Collectors.toList());
		
	}
}
