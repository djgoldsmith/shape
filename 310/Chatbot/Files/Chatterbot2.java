import java.io.*;
import java.util.*;

public class Chatterbot2 {

    //A List of Basic Responses
    static String[][] KnowledgeBase = {
		{"Hello", 
		 "Hi there!",
		},
		{"What is your name", 
		 "My name is Hal."
		},
		{"Who are you", 
		 "My name is Hal."
		},
		{"Where are you from", 
		 "Coventry, UK.",
		},
		{"What is the weather like", 
		 "Hot"
		},
		{"What is your favorite place", 
		 "Hong Kong"
		},
		{"Who is your faorite actor",
		 "Bruce Cambell"
		}
	};


    //Function to Calculate response.
    static String findMatch(String str) {
	String result = "";
	for(int i = 0; i < KnowledgeBase.length; ++i) {
	    if(KnowledgeBase[i][0].equalsIgnoreCase(str)) {
		result = KnowledgeBase[i][1];
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
