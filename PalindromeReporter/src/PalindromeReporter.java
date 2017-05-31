/*
 * Done By: Talib Bacchus
 * This program takes in a String data type and checks if the string is a palindrome or not.
 */
public class PalindromeReporter {
	public static boolean IsPalindrome(String str)
	{
		if(str.length()==0 || str.length()==1 )
		{
			return true;
		}
		if(str.charAt(0)== str.charAt(str.length()-1))
		{
			return IsPalindrome(str.substring(1,str.length() -1 ));
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(IsPalindrome("MOM"));
	}
}
