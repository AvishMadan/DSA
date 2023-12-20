
public class MaxLengthPalindrome {
	
	public static void main(String[] args) {
		
	String s ="dvfkanakadv";
	String ans="";
	for (int i = 0; i < s.length(); i++) {
		
		for (int j = i; j < s.length(); j++) {
			
			if(isPlaindrome(s, i, j)) 
			{
				
				String t=s.substring(i, j+1);
				 ans=t.length()>ans.length() ? t : ans;
				
				
			}
			
			
			
			
		}
	}
	
	System.out.println(ans);
	}
	
	public static boolean isPlaindrome(String s,int start,int end) 
	{
		
		while(end>start){
			
			
			if(s.charAt(start) != s.charAt(end)) 
			{
				
				
				return false;
			}
			else 
			{
				end--;
				start++;
			}		
		}
		return true;
	}
		}
