package GroupIDTeamSixMaven.ArtifactIDTeamSixMaven;

/**
 * Hello world!
 *
 */
public class App 
{
     public static void main( String[] args )
    {
       
    	String str = "abc";
    	String str1 = "abc";
    	System.out.println(str==str1);
    	
    	String str2 = "XXXX123Sh4G21";

		String digits = str2.replaceAll("[a-z]", "");

		System.out.println(digits);
		
    	
    }
}
