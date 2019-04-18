package Basics;

public class Strings {

	public static void main(String[] args) {
		String BookTitle;
		String wordChoice = "ring";
		BookTitle = "The lord of the rings";
		
		if (BookTitle.contains(wordChoice)){
			System.out.println("THe book contains the word Ring");
		}
		
		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chrome");
		}
		
		String firstname = "Tim";
		String lastname = "Short";
		String SSN = "984523";
		
		System.out.println("There are "+SSN.length() + " digits in your SSN");
		
		System.out.print(firstname.substring(0,1));
		System.out.print(lastname.substring(0,1));
		System.out.println(SSN.substring(3));
	}
	
	

}
