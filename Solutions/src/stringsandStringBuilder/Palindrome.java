package stringsandStringBuilder;

public class Palindrome {
	public static void main(String[] args) {
		String s="abba";
		boolean answer=isPalindrome(s,0,s.length()-1);
		if(answer) {
			System.out.println("Yes the String is Palindrome");
		}else {
			System.out.println("No the given String is not Palindrome");
		}
		
	}
	static boolean isPalindrome(String s, int start,int end) {
		if(start>end) {
			return true;
		}
		if(s.charAt(start)!=s.charAt(end)) {
			return false;
		}
		return isPalindrome(s,start+1,end-1);
		
		
	}

}
