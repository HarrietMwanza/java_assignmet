package assignment;

import java.util.*;


public class question1 {

	// JAVA TRIVIA 2022
	
	int x;
	int score;
	public static void main(String[] args) {
		
		   new Triviagame();

	}
	    public void Triviagame() {
	    	TriviagameI();
	    }
	    
	    public void TriviagameI() {
	  
			// WE HAVE OUR SCANNER
	    Scanner sc = new Scanner(System.in);
	    	String q[] = new String[10];
	    	String[] a = new String[10];
	    	String[] b = new String[10];
	    	String[] c = new String[10];
	    	String[] d = new String[10];
	    	String[] e = new String[10];
	    	String[] ans = new String[10];
	    	   String[] validletter = new String[5];
	    	   
	    int score = 0;
	    
	    validletter[0] ="a";
        validletter[1] ="b";
	    validletter[2] ="c";
	    validletter[3] ="d";
	    validletter[4] ="e";
	    
	       // The Question
	       q[0]="What color is chocolate?";
	       q[1]="How many computer generations have been invented?";
	       q[2]="What is the largest organ on the human body?";
	       q[3]="What do you call a baby goat?";
	       q[4]="What is the name of the device that performs both output and input functions in a computer?";
	       q[5]="What Who was the first woman to win a Nobel Prize (in 1903)?";
	       q[6]="What is a dog ?";
	       q[7]="Which animal can be seen on the Porsche logo?";
	       q[8]="Who named the Pacific Ocean ?";
	       q[9]="What was the first soft drink in space?";

// 0
		   a[0]="brown/white";
	       b[0]="blue/orange";
	       c[0]="black/white";
	       d[0]="blue";
	       e[0]="none";
	       
	    //   1
	       a[1]="5";
	       b[1]="2";
	       c[1]="8";
	       d[1]="10";
	       e[1]="12";
	       
// 2
	       a[2]="heart";
	       b[2]="lungs";
	       c[2]="ears";
	       d[2]="skin";
	       e[2]="bones";
	    
// 3
	       a[3]="baby";
	       b[3]="calf";
	       c[3]="cub";
	       d[3]="lamb";
	       e[3]="kid";
	       
// 4
	       a[4]="camera";
	       b[4]="microphone";
	       c[4]="modem";
	       d[4]="keyboard";
	       e[4]="speaker";
	       
// 5
	       a[5]="marie curie";
	       b[5]="harriet thubman";
	       c[5]="maya angelo";
	       d[5]="cecilia victorious";
	       e[5]="abbie mocks";
	       
// 6
	       a[6]="an animal";
	       b[6]="a termed animal";
	       c[6]="a fish";
	       d[6]="car model";

	       e[6]="Casterly Rock";
	       
// 7
	       a[7]="horse";
	       b[7]="cat";
	       c[7]="dog";
	       d[7]="mouse";
	       e[7]="hamster";
	       
// 8
	       a[8]="Ferdinand Magellan";
	       b[8]="maya angelo";
	       c[8]="rumby dary";
	       d[8]="harriet thubman";
	       e[8]="irene white";
	       
// 9
	       a[9]="orange juice";
	       b[9]="inyange";
	       c[9]="sprite";
	       d[9]="water";
	       e[9]="coca cola";
	       
// answers here
	        ans[0]="a";
	        ans[1]="a";
	        ans[2]="d";
	        ans[3]="e";
	        ans[4]="c";
	        ans[5]="a";
	        ans[6]="a";
	        ans[7]="a";
	        ans[8]="a";
	        ans[9]="e";
        System.out.println("Welcome to JAVA TRIVIA game 2020." +  "Your answer must be in lowercase,  You must pick the correct letter an not use numbers.");
        
        for(x = 0; x < 10; x++) {
        	 
          try {
        	  System.out.println(x+1 + "." +q[x]);
        	  System.out.println("A ." + a[x]);
        	  System.out.println("B ." + b[x]);
        	  System.out.println("C ." + c[x]);
        	  System.out.println("D ." + d[x]);
        	  System.out.println("E ." + e[x]);
        	  System.out.print("Enter your answer:");
        	  long startTime = System.currentTimeMillis();
        	  String myanswer = sc.nextLine();
        	  long endTime = System.currentTimeMillis();
        	  long questionTime = (endTime - startTime) / 1000;
        	  System.out.print("\n");
        	  
        	  if (myanswer.equalsIgnoreCase("a")||myanswer.equalsIgnoreCase("b")|| myanswer.equalsIgnoreCase("c")||myanswer.equalsIgnoreCase("d")||myanswer.equalsIgnoreCase("e")) {
        		  if (myanswer.equalsIgnoreCase(ans[x])) {
        			  System.out.println("CORRECT, it took" + questionTime + " seconds to press enter");
        			  score++;
        			  
        		  }
        		  else {
        			  System.out.println("Your answer " + myanswer.equalsIgnoreCase(ans[x]) + ", which is not CORRECT, and it you took " + questionTime + " seconds to press enter");
            	  }
        	  }else if(myanswer.equalsIgnoreCase("")||myanswer.equalsIgnoreCase("")||myanswer.equalsIgnoreCase("")||myanswer.equalsIgnoreCase("")||myanswer.equalsIgnoreCase("")) {
        		   
        		  throw new BlankAnswerException();
        	  }else if(myanswer.equalsIgnoreCase("0")||myanswer.equalsIgnoreCase("1")||myanswer.equalsIgnoreCase("2")||myanswer.equalsIgnoreCase("3")||myanswer.equalsIgnoreCase("4")) {
       		   
        		  throw new Exception("special characters or anything not stated in instructions is not allowed \n");
        	 }
        	  else {
        		  throw new InvalidLetterException();
        	  }
        		  
        		  
        		  
 
        } catch (InvalidLetterException ile) {
        	
        	System.out.println(ile.getMessage());
        	--x;
          }catch (BlankAnswerException bae) {
          	
          	System.out.println(bae.getMessage());
          	--x;
            }catch (Exception t) {
            	
            	System.out.println(t.getMessage());
            	--x;
              }
        }
        
        System.out.println("Your grade is:" + score + "/"+ 10);
	    
        try {
        	System.out.println("Would you like to play JAVA TRIVIA again? Y/N");
        	char decision = sc.nextLine().charAt(0);
        	
        	switch (decision) {
        	case 'Y':
        	case 'y':
        		TriviagameI();
        		break;
        	case 'N':
        	case 'n':
        		System.out.print("Thank you for you for participation in JAVA TRIVIA 2022");
        		System.exit(0);
        		break;
        	default:
        		System.out.println("Please enter a Yes or NO <Y/N>");
        		
        	}
        } catch(Exception t) {
        	System.out.print(t);
        }
	       
       }
	    public class InvalidLetterException extends Exception{
	    	public InvalidLetterException() {
	    		super("An invalid letter . Enter only A,B,C,D,E\n");
	    	}
	    }
	    public class BlankAnswerException extends Exception{
	    	public BlankAnswerException() {
	    		super("Blank .. You have no answer\n");
	    	}
	    }

}

