package com.String;

public class MaskingPattern {

	public static void main(String[] args) {
		//input :abcde@gmail.com;
		//output:a****@gmail.com;
		
		String input="abcde@gmail.com";
	    String output="";
	    
	     int indexOfAt=input.indexOf("@");
         
	     for(int i=0;i<input.length();i++) {
	    	 if(i>0 && i<indexOfAt) {
	    		 output+="*";
	    	 }
	    	 else {
	    		 output+=input.charAt(i);
	    	 }
	    	 System.out.println(output);
	    }

	}

}
