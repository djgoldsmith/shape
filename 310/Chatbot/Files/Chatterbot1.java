import java.io.*;
import java.util.*;

public class Chatterbot1 {
    //Set of Predefined Responses.
    static String[] Response = {
	"Hello",
	"How are you today,",
	"Tell me more",
	"What an interesting coversation",
    };

    //Entrypoint
    public static void main(String[] args) throws Exception {
	int i = 0; //Keep track of where we are
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//Main Loop
	while(true) {
	    //Initail Prompt
	    System.out.print(">");
	    //Get Input
	    String sInput = in.readLine();
	    System.out.println("\tDEBUG: "+sInput);

	    //Create Response
	    String sResponse = Response[i];
	    i = (i + 1) % Response.length;

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
