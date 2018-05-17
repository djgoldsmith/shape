import java.io.*;
import java.util.*;

public class Chatterbot2a {

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
	String result = "Im sorry, I don't understand you"; //Default Response
	for(int i = 0; i < KnowledgeBase.length; ++i) {
	    if(KnowledgeBase[i][0].equalsIgnoreCase(str)) {
		System.out.println("Len "+KnowledgeBase[i].length);
		Random generator = new Random();
		int randId = generator.nextInt(KnowledgeBase[i].length-1) +1;
		result = KnowledgeBase[i][randId];
		break;
	    }
	}
	return result;
    }
    
    //Entrypoint
    public static void main(String[] args) throws Exception {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//Main Loop
	while(true) {
	    //Initail Prompt
	    System.out.print(">");
	    //Get Input
	    String sInput = in.readLine();
	    sInput = sInput.replaceAll("[.?!]", "");
	    System.out.println("\tDEBUG: "+sInput);

	    //Create Response
	    String sResponse = findMatch(sInput);
	    //Print or Exit
	    if(sInput.equalsIgnoreCase("quit")) {
		System.out.println("BOT: It was nice talking,  goodbye");
		break;
	    } else {
		System.out.println("BOT: " + sResponse);
	    }
	}
    }
}
