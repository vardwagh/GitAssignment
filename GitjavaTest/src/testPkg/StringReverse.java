package testPkg;

public class StringReverse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str = "MyJava";
		 
        //1. Using StringBuffer Class
 
        StringBuffer sbf = new StringBuffer(str);
 
        System.out.println(sbf.reverse());    //Output : avaJyM
        
 
        //2. Using iterative method
 
        char[] strArray = str.toCharArray();
 
        for (int i = strArray.length - 1; i >= 0; i--)
        {
            System.out.print(strArray[i]);    //Output : avaJyM
        }
 
        System.out.println();
        
 
        //3. Using Recursive Method
 
        System.out.println(recursiveMethod(str));    //Output : avaJyM
    }
 
    //Recursive method to reverse string
 
    static String recursiveMethod(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
         System.out.println(str.substring(1));
         System.out.println(str.charAt(0));
         
         return recursiveMethod(str.substring(1)) + str.charAt(0);
         
    }

	

}
