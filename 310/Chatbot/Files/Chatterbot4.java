//Stores previous Answers
import java.io.*;
import java.util.*;

public class Chatterbot3b {

    //Define Class Variables
    private static String sInput =  new String("");
    private static String sResponse = new String();
    private static String result = new String("");
    private static Random generator = new Random();
    private static int randId;
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static String lastInput = new String("");

    //A List of Basic Responses
    static String[][] KnowledgeBase = {
		{"Hello", 
		 "Hi there",
		 "Hello!",
		 "Hello, How are you?"
		},
		{"What is your name", 
		 "My name is Hal.",
		 "My name is Hal. What is yours?",
		 "I am Hal."
		},
		{"Who are you", 
		 "My name is Hal.",
		 "I am Hal",
		 "I am a chatbot",
		},
		{"Where are you from", 
		 "Coventry, UK.",
		},
		{"What is the weather like", 
		 "Hot",
		 "Cold",
		 "Fair",
		 "Wet"
		},
		{"What is your favorite place", 
		 "Hong Kong",
		},
		{"Who is your faorite actor",
		 "Bruce Cambell"
		}
	};


    //Function to Calculate response.
    static String findMatch(String str) {
	result = "Im sorry, I don't understand you"; //Default Response
	//Split input into an array based on spaces
	String[] inArray = str.split(" ");
	int bestIndex = 0; //The Best Match
	int bestCount = 0;
	for(int i = 0; i < KnowledgeBase.length; ++i) {
	    //Tokenise the input
	    String[] checkArray = KnowledgeBase[i][0].split(" ");
	    int count = 0;
	    //Count the matches
	    for (int outer = 0; outer < checkArray.length; outer++){ //Outer Loop (knowlege Base)
		for (int inner = 0; inner < inArray.length; inner++){ //Inner Loop (input)
		    if (checkArray[outer].equalsIgnoreCase(inArray[inner])){
			count += 1;
		    }
		}
	    }
	    //Now we work out the best answer
	    if (count > bestCount){
		bestCount = count;
		bestIndex = i;
	    }
	}
	//And we should have the best response
	if (bestCount > 0){
	    int randId = generator.nextInt(KnowledgeBase[bestIndex].length-1) +1;
	    result = KnowledgeBase[bestIndex][randId];
	}
	return result;
    }

    public static void getInput() throws Exception {
	System.out.print(">");
	//Get Input
	sInput = in.readLine();
    }

    public static void cleanInput(){
	sInput = sInput.replaceAll("[.?!]", "");
    }

    public static boolean checkRepeat(){
	//Check against last input
	if (sInput.equals(lastInput)){
	    return true;
	}
	//Update and return
	lastInput = sInput;
	return false;
    }
    
    public static boolean run(){

	try{
	    getInput();
	    cleanInput();
	    System.out.println("\tDEBUG: "+sInput);
	    if(sInput.equalsIgnoreCase("quit")) {
		System.out.println("BOT: It was nice talking,  goodbye");
		return false;
	    }
	    else {
		//Check for duplicates
		if(checkRepeat()){
		    System.out.println("You are repeating yourself!");
		}
		else{
		    sResponse = findMatch(sInput);
		    System.out.println("BOT: " + sResponse);
		}
	    }
	}
	catch(Exception e){
	    e.printStackTrace();
	}

	//Create Response
	//Print or Exit
	return true;
    }
    //}

    //Entrypoint
    public static void main(String[] args) throws Exception {

	//Main Loop
	while(true) {
	    //Initail Prompt
	    if (run() == false){
		break;
	    }
	       
	}
    }
}
