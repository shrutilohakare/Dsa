package com.String;

public class Masking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //Input: shrutilohakare@gmail.com;
		//output: s*************@g***l.com
		
		String email="shrutilohakare@gmail.com";
		int indexOfAt=email.indexOf("@");
		
		int indexOfDot=email.indexOf(".");
		
		String output="";
		
		for(int i=0;i<email.length();i++) {
			char ch=email.charAt(i);
			if(i>0 && i<indexOfAt) {
				output+="*";
			}
			else if(i>indexOfAt+1 && i<indexOfDot-1) {
				output+="*";
			}
			else {
				output=output+email.charAt(i);
			}
		}
		System.out.println(output);
	}

}
