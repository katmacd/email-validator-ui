package email_validator_ui.email_validator_ui;
//Katharine MacDonald
//B00696392
//CSCI 3130 - Assignment 3

//Imports.
import java.util.ArrayList;


public class ev_backend {

	
	public static void main (String[]args){
	
	System.out.print("Welcome to Assignment #3, Email Validator.");
	
		
	}
	
	//Takes the string from main, and puts it into an array to check 
	public static boolean eChecker(String input){
		
		//String is broken down into an array.
		ArrayList<Character> parsethis = new ArrayList<Character>();
		for(int h = 0; h < input.length(); h++){
			
			parsethis.add(input.charAt(h));
			
		}
		
		//Simple boolean checks for finding @ and ., and .com, and is there no character at start.
		boolean at = false;
		boolean period = false;
		boolean com = false;
		boolean isIt = false;
		
		
		//Parsethis must have at least five characters. If it does not, return false. This means it doesn't have an address or domain, not just @.com NEW RULE
		if(parsethis.isEmpty() || parsethis.size() < 5){
			return isIt;
		}
		
		//Com check, makes sure it has com in the email address, this could be .ca but can assume a check could be for particular company email etc. NEW RULE
		String comcheck = ""+parsethis.get(parsethis.size()-3)+parsethis.get(parsethis.size()-2)+parsethis.get(parsethis.size()-1);
		if(comcheck.equals("com")){
			com = true;
		}
		
		//. check, makes sure it comes before com NEW/OLD Rule
		if(parsethis.get(parsethis.size()-4) == '.'){
			period = true;
		}
		
		//At check
		for(int i = 0; i < parsethis.size(); i++){
			
			if(parsethis.get(i) == '@'){
				
				at = true;
				
			}
			
		}
		
		//Final Combo Check
		if(at && period && com){
			
			isIt = true;
			
		}
		
		return isIt;
		
	}
	
}
