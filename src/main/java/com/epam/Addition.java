package com.epam;

/**
* The add program performs addition of numbers of string format.
*
* @author  Mangesh Gawade
* @version 1.0
* @since   2018-04-02 
*/
public class Addition {


	
	 /**
	   * This method is used to addition of numbers of string format
	   * @param str This is the string parameter for numbers
	   * @return int This returns sum of numbers.
	   */
	 public static int add(String str){
		 String[] numberArray = str.split(",");
		    int sum=0;
		 if(str.contains(","))
		     numberArray = str.split(",|\n|;");
		 if(str.contains(";"))
		 {
			 str=str.substring(3, str.length());
			 str=str.replace("\n", "");
		     numberArray = str.split(";");
		 }
		 if(str.length()==0)
		    {
	            sum=0;
		    }
		else{
	            for (String number : numberArray) {
	                sum+=Integer.parseInt(number.trim()); 
	            }
	        }
			return sum;
	    }
}
