# Introduction

## About the Course

- AI is both an art and a science
  - We need good programming skills
  - We also need understanging of Cognative processess
- To make something realisticly human, we need to know what a human is
  how it would behave etc.
- This can be really difficult!!! 


## What is an Agent!

- Lets start with Intelegent systems
  - Something that uses internal informtion to achive some purpouse
    - Computers, Robots, People, Cats etc...
  - Each of these (even cats, who are generally a law unto themselves) follows
    some set of internal rules to achieve aims.
- Some Philosopical questions here.  What is the meaning of Life? 
  - To survive, have a family etc.
  - Tasks we need to do this?
     - Work (Sadly)
	 - Eat
	 - Complex set of Goals.
	 
- For a Robot it is easier
  - Manuacture somthing / perform a specific task.
     - Very simple set of Goals
     - Cut Something,  Screw something.
	 - Where is the intelegence.  (Simple, set of basic rules)
	    - If there are no screws, alert the Humans.

- Gamers?
  - Bots in games are also intelegent agents. 

- We will focus on "Artifical Autonomous Intelegent Agents"	 
  - Thats a mouthfull, so we restrict it io just Intelegent Agents.
  - MAIN SLIDE

- Now we want to talk about why this is imporant
  - Automation on the web is increasing
  - Agents allow organisations to automate tasks perviously done by humans
     - Ethial Considerations here?  (Unemployment etc)
	 - Benifits:  Consistancy, sticking to the script, COST!! etc.
	 
- And Timely.
  - <https://www.theguardian.com/world/2018/apr/19/russia-fake-news-salisbury-poisoning-twitter-bots-uk>
  - <https://www.theguardian.com/technology/2018/jan/19/twitter-admits-far-more-russian-bots-posted-on-election-than-it-had-disclosed>
  - <http://www.scmp.com/lifestyle/article/2141038/how-bots-rule-twitter-two-thirds-tweets-posted-automated-accounts-study>
  
- Final Article
  - 2/3 of messages are automated
    - About 90% of messages related to Adult entertainment sites
	   - Not as surprising as it seems,  If that is your kind of thing, you tend not to talk about it.
	- 76% of popular Sports sites
	   - This is a bit more interesting.  No social stigma associated with sport link to news
	- 66% of News sites
	   - I am not too surprised by this, its about syndicating information.
	   - You write an article for the main newspaper and it comes out 
	      - Online
		  - Social Media
  
- Election Tampering is huge news back home (and in the US)
  - We dont need to hack the system, we hack the human
  - Social engineering side of hacking
  - Interesting Ethical viewpoint. Is influencing peoples decisions correct?
  
- Its not all bad though
 - Customer serice chat bots
 - Automated booking systems etc.
 - Medical Diagnosis
 - Space Missions 
 
 
## What is an Agent

 - Lets think about a really basic concept
 - Thermostat on the Airconditioning.
   - Does it control an environment
   - Does it behave autonomously?
   
 - This is the simplest form of agent possible.
   - But it still MAPs to our rules
   
 - Draw ON Board
 
   -  INPUT -> SENSOR -> RULES -> AIRCON -> OUTPUT
   - Sensor turns the **environment** into Input
   - Rules Govern **Behaviour**
   - Physical Aircon is the **Output**.
 
 
 - Even though this is a really simple system,  There is still some feedback
   - If it gets too hot the Aircon comes on,
   - When it reaches a certain point it turns off again.
   
 - Obvs there are more complex temperature management systems out there, we will talk about them later
 
 
## Reactivity

 - With the Aircon we have a simple decision to make
 - Envirnomnent is well defined.
    - Data required is well defined.  We always have access to the informaiton we need
    - There is no need to remember the current state of affairs.

 - More complex systems will need to store this data
    - Make a set of assumptuions about the current environment
	- Make use of multiple inputs
	- Make assumptions about future state of the system.
	
 - Consider an intelegent agent designed to play chess / go
   - It knows the current state
   - To make the best move it must extrapolate future states
     - Chose the best option from those states
	    - I am a poor chess player, can only ever think about 2 moves in advance.

 - What about an Intelegent heating system.
   - Pre-emptive cooling? 
   - We need to start predicting the weather!
 

## Proactiveness

 - This is where the intelegence comes in.
   - Make decisions to **actively** reach a goal
   - Consider the Chess playing agent.
      - Takes the decision that (on ballance) is most likely to win the game
	  - This may not be the best decision at the current moment (sacrifice piece)
	  - This is where I suffer at chess as I may seek revenge / short term goal.
 
 - Consider a more inteleent Building management system
    - We know what time the occupant is in the building
	- Turn OFF cooling when the building is unocupied
	- Turn ON cooling when occupied
	   - But this has a period of LAG (get to work / home and it is too hot)
   - Look at Prior / Current inforamtion to make an informed choice
      - Its 6:30 AM and 25,  I want it 20 at 8:30AM. when do i turn the cooling on, and at what power.
 
 - This raises an intersting Ethical issue.
 - Trolly prolem
   - What should the Goal of the autonomous car be
      - Kill the occupant
	  - Kill the bus load of children?
	  
 
## Social

 - A lot of the situations we have talked about have been individual.
   - One Thermoatat.
 - Agents need to interact.
   -  Humans (I want food), go to Vendor
   - Chess Robot (Wants to win),  needs an opponent.
   
 - Consider a more integent BMS
   - Multiple aircon units
   - Can work together to keep a room cool, based on one set of info
 
 - This relies on information being shared between the Agents.
 

# AI

## 4: Goals

 - Links back to our agents
   - GOALS:
      - What does the AI want to achive
	    - Meet conditions for heating system
	    - Win at Chess
		- Human like behaviour
		   - Getting Food

   - These may have subgoals
     - I Am Hungry so I must have food.
	    - Deside what to eat
		- Deside how to eat
		   - Cook myself
		   - Go out 
	    - Deside Where to eat
		   - (Easy if cooking my own food)
		   - Harder if I am going out
		     - Cost
			 - Type of Food
			 - Business hours
			 - How busy it is likely to be...
	   - Deside how to get there
	       - Walk
		   - Publilc Transport
		   - Taxi
		   - Drive
		   

## AI Models

 - Subtle difference between thinking and acting 
 
## Systems that Think like humans

 - Understanding Humann Thought Processes (hard)
   - How do we "see".  
      - Facial recorgnition is a "hard" AI problem (Though mostly solved by facebook)
	  - We do this natrually
	     - Babies regorgnise faces
	  - What is it about features we recorgnise
	     - Eye color, Hair Color, Hair Length etc.
		 - We automatically process these in our heads to recorgnise people
		 
   - AI face recorgnisiton is similar.
      - Early systems wouold pick out key points and compare to a database of images
	    - Eyes, Mouth, Cheeks, Size of face etc. All turned into Coordinates
		- Coordiantes compared with those in a specific database
	    - Only worked with speficic photos
		 
	  - Advances normalised the points based on overall shape (deal with tilt, distance) 
  
      - Apples Face Id Login system, shines 30,000+ IR dots onto the face,
	    - Then read by the camera,
		- Compared to the "Stored profile"
 
## Acting Like Humans

 - Aims to emulate human behaviour
 - TURING TEST LATER
 - Trys to fool user into thinking they are interacting with a real person
 - This combines some elements of thinking like humans.
   - So How would a human answer a question??
   
## Capablilities

 - Natrual Language processing.
   - There is a huge difference in the way we talk
     - Both Spoken and Written communications differ
	 - Languages Differ  (You guys do a much better job of processing English, than I do cantoneese)
	 - AI is doing the same sort of thing.  Translating a foreign language into one it understands.
	 
 - Representing Knowlege
   - There are limits to all peoples knowlege.
   - The answer 10 X*Y is easy for a computer to calculate
     Hard for a human
   - If we want to act like a human perhaps this information should be misrepresented?
   - Also How do we put the information across.
     - Answer like a written reference work
	 - Answer with natural english (whatever that is)
	 - Answer with Slang?
	 
  - Keeping track of the conversation
    -  Do we retain inforamtion
	-  You tell the bot your name,  it refers to you by your name
       - How long will it remember this.
	   
## The Turing test

 - After AMT
   - Guy invented theory computation
     - Though it was Newman and Tommy Flowers who invented the first computer
	 - Interstingly he was a pretty crappy programmer too.
 - Hypothesis:  
   - AI will be here, when it is impossible to distingusih a cocmputer from a human.
   - Imitation Game (film).
   
 - As We dont have realisic human avatars yet it currently works though Chat bots
   - Judge in one room
   - Either a Human or the AI in another
   - Have a conversation over a chat interface
   - At the end of the conversation, judge is asked wheter they were a bot or not
   
 - Has it been Passed?
   - According to some it has!
   - I was actually at the event.  
   - However.  Personally, (and this is backed up by others) i dont belive it has.
      - There was Bias in the testing (the guy running the competition wanted it to happen
	  - "Winner" was Eugine Goostman.  Who has the personally of a 13 year old Ukranin boy.
	  
  - Flaws in the Turing Test and True AI
     - Humans do not always behave intellengently.
	 - True AI would not care about appearing human, if it helped offer the right information
	 - IE, I ask the bot:  What is the current HK$ Conversion Rate?
	    - Most humans would not know
		- If they did they could provide an approximation (about 10$ - £)
		- Its actually ~10.6 HKD
		- Is this relevant information?  Yes if I am making a large purchace
		

## Total:  Show Video

## Turing Test:  A bit of fun for you

Try out cleverbot <www.cleverbot.org>
Aparently it has also passed the turing test
 - Do you belive those claims
 - First of talk to it in english.
 - I also believe it speaks cantoneese, I wouold be interested how that works.
 
 
## Thinking Rationally

- So this is about applying LOGICAL thought to all processes
   - Sometimes the Logical Choice may not be the best to help us reach our goals.
      - Short term gain VS long term Loss etc.
   - I like to think of this a pure statistical information

## Problems
 - We all know how to get food.
 - How the heck to we formalise this.
 - Formal proofs, Predicate calculus are hard.
 
 - It is popssible to win every game of chess.  Simply work out all possible combinations of moves from a given point.
 - Huge amounts of processing required.

## Acting Rationally

 - Builds upon thinking rationally.
 - Has some morals / ethics attached to it.
 - Given a particualr situation what is the logical response?
   - We also need to take account of all other factors
   - What is the current environment
   - What are our end goals
 - Use this Prior Information to help make decisions
 - A bit more like Bayes,  What prior information do we have to help us make decisions

## Thinking and Acting Summary

- So in order to think and act our agent needs a few things

 - Information about its envionment (sensors etc)
 - An set of goals
    - Possibly intermediate ones

  - The Envoronment may be simple (aircon) or complex (stock exchange) which will effect the choices we can make.

 - So we will look at the current state, inlight of the goals we have and make a decision on how to proceseed.
 - This may be based on rationall decuduction.
    - My Goal is to Get food,  I currently know what I want to eat, so I now need to make a choice on Where to eat.
	  - Base on Enviromnent,  Location, Time of day, Money etc.
	  
  - We may want to take previous experince into account
    - Again this behavour is much like the human behaiour.
	- The closest food is Here, but I had a crappy meal last time.

 - If we want to reduce compuation we can start using Heuristics.
   - Generalised rules 
   - Group available input into classes
      - So go to the movies looking for two seats.
	    - Do I check each seat individually, to see if it is occupied?
		- No I scan heads looking for gaps.
		- Thus our rule here is to check the size of gap.


 - Agents also need to react to change.
   - Our behaviour affects the world around us
   - Lets say we are queing at the store:
     - This effects the size of the queue
	 - So they put a second Cashier on
	 - We need to reevaluate the situation and what this means to our goals.
	 

## Problem Types
 - Two of the more usual problems we will encounter

## Problems that require search

 - In this case the algorithm is not known before hand
 - We have to use trial and error to find the best result (Brute forcing).
 - Many problems in AI can be resulved through search)
   - Chess, we build a Tree of all possible moves and see which takes us closest to the end goal
   - Sat Nav:  Build a list of Nodes betwen destination + Location, then search fro the optimal route. (Dykstra)
 - This doesnt scale well.  Search space can quickly become Huge!
   - Heuristics can help here
   - Pruning the search tree (Remove results unlikely to help meet result)
 - Other search methods include:
   - "optimisation" (hill climb, simulated annealing)
   - Evolutionalty Computation (genetic algs, swarm algoithms)
   

## Poorly Specified Problems
  - How do people see
  - What subconsious decision are made
  - We can make an approximation of how people would approach a task, though a generalised set of rules.
  - Machine Learning can help here
  - American Tanks Example
  
## Eliza lives at
http://psych.fullerton.edu/mbirnbaum/psych101/Eliza.htm 

COmpare to clever bot.


https://experiments.withgoogle.com/collection/ai
  
	  
   
   
