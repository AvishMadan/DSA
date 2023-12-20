import java.util.HashMap;
import java.util.Map;

public class DSA {

	
	public static void main(String[] args) {
		
		String s ="aab";
		
		int a[]=new int[26];
		
	for (int i = 0; i < s.length(); i++) {
	a[s.charAt(i)-'a']++;	
	}
	
	char max_char = 0 ;
	int max_freq=Integer.MIN_VALUE;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>max_freq) 
		{
			max_freq=a[i];
			max_char=(char)(i+'a');
		}}
		int index=0;
		 while(max_freq>0  && index<s.length()) {
			char[] sa=s.toCharArray();
			 sa[index]=max_char;
			 s=new String(sa);
			 max_freq--;
			 index=index+2;
			
		}
		 if(max_freq !=0) 
		 {
			 System.out.println("Output is blank");
		 }
		 a[max_char-'a']=0;
		 for (int j = 0; j < a.length; j++) {
			while(a[j]>0) 
			{
				
				 
				index=index>=s.length()?1:index;
				char[] sa=s.toCharArray();
				 sa[index]=(char)(j+'a');
				
				 s=new String(sa);
				
				a[j]--;
				index +=2;
				
				
			}
			 
		}
		 System.out.println(s);
	}	
	
	
}
