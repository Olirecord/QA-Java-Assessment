package com.qa.javaAssessment;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		
		
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		if (a>b&b>c) {
			return a-b==b-c;
		}
		else if (a>c&c>b) {
			return a-c==c-b;
		}
		else if (b>a&a>c) {
			return b-a==a-c;
		}
		else if (b>c&c>a) {
			return b-c==c-a;
		}
		else if (c>a&a>b) {
			return c-a==a-b;
		}
		else {
			return c-b==b-a;
		}		
	}
		
		
		
	

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		
		String sec1;
		String secEnd;
		String result;
		
		sec1= input.substring(0,input.length()/2-a/2);
		secEnd= input.substring(input.length()/2+a/2+1,input.length());
		result = sec1+secEnd;
		
		
		
		return result;
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {
		
		String check1="";
		String check2="";
		int count=0;
		int max=0;
		
		int i = 0;
		
		for (;i<input.length()-1;i++) {
			check1=input.substring(i,i+1);
			check2=input.substring(i+1,i+2);
			
			if (check1.equals(check2)) {
				count++;
				
			}
			if(count>max) {
				max=count;
			}
				
		}
			
		return max;
	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		
		String lookFor=" am ";
		String alpha;
		int word=0;
		int i =0;
		
		arg1 = arg1.toLowerCase();
		
		if(arg1.substring(i,i+3).equals("am ")) {
			word++;
		}
		if(arg1.substring(arg1.length()-3,arg1.length()).equals(" am")) {
			word++;
		}
		
		for (;i<arg1.length()-lookFor.length()+1;i++) {
			alpha=arg1.substring(i, i+lookFor.length());
			
			if(alpha.equals(" am ")) {
				word+=1;
				
			}
		}
		
		return word;
		
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		
		String valid = "";
		
		if(arg1>=3||arg1>=5) {
			if(arg1%3==0) valid="fizz";
			if(arg1%5==0) valid="buzz";
			if(arg1%3==0&arg1%5==0) valid="fizzbuzz";
			
		}
	
		
		
		return valid;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		Integer.parseInt("3"); // 3
		
		//searches both at a time like the superblock but converts to ints. if one of them is a space then it doesnt count
		//wil need two variables to do the check and then one for highest and another for current streak.
		
	}
}
