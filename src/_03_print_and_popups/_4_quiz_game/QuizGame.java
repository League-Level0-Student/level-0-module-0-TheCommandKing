package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		 String answer = JOptionPane.showInputDialog("What's the biggest animal in the world?");
		 if(answer.equalsIgnoreCase ("blue whale")) {
	score += 1;
		 }
		 else {
				score -= 1;}
				// 2.  Ask the user a question 
		answer = JOptionPane.showInputDialog("Which sea creature has three hearts?");
		if(answer.equalsIgnoreCase ("octupus")) {
			score += 1;
		}
		else {
			score -= 1;}
		
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		answer = JOptionPane.showInputDialog("In the traditional rhyme, how many mice were blind?");
	if(answer.equalsIgnoreCase ("3")){
			score += 1;
		}
	else {
		score -= 1;}
	
		answer = JOptionPane.showInputDialog("How many bones does an adult human have?");
		if(answer.equalsIgnoreCase ("206")) {
			score += 1;
		}
		answer = JOptionPane.showInputDialog("How many pedals do most modern pianos have?");
		if(answer.equalsIgnoreCase ("3")) {
			
		}
		else {
			score -= 1;}
		answer = JOptionPane.showInputDialog("Which Australian marsupial enjoys eating eucalyptus leaves?");
		if(answer.equalsIgnoreCase ("koala")) {
			score += 1;	
		}
		else {
			score -= 1;}
		answer = JOptionPane.showInputDialog("Which Russian town suffered an infamous nuclear disaster in 1986?");
		if(answer.equalsIgnoreCase ("chernobyl")) {
			score += 1;	
		}
		else {
			score -= 1;}
		answer = JOptionPane.showInputDialog("At first I have 4 legs, second I have 2 legs, and at last I have 3. What am I?");
		if(answer.equalsIgnoreCase ("Human")) {
			score += 1;	
		}
		else {
			score -= 1;}
		answer = JOptionPane.showInputDialog("Which type of entertainment has cars but no roads, curves but no figure, and white knuckles?");
		if(answer.equalsIgnoreCase ("roller coaster")) {
			score += 1;	
		}
		else {
			score -= 1;}
		answer = JOptionPane.showInputDialog("What has three classes, can be found underground or high up, and can be a target for ultra-modern hopes or lavish nostalgia?");
		if(answer.equalsIgnoreCase ("train")) {
			score += 1;	
		}
		else {
			score -= 1;}
		answer = JOptionPane.showInputDialog("I have a cake and a table named after me, and I'm used all round the world. What am I?");
		if(answer.equalsIgnoreCase ("coffee")) {
			score += 1;	
		}
		else {
			score -= 1;}
		answer = JOptionPane.showInputDialog("Home to the Ross Sea and a species of flightless bird—where is this?");
		if(answer.equalsIgnoreCase ("antarcica")) {
			score += 1;	
		}
		else {
			score -= 1;}
		answer = JOptionPane.showInputDialog("Born in the 16th Century in Devon, England, his career was linked to tobacco and potatoes, and he was imprisoned in the Tower of London. Who was this?");
		if(answer.equalsIgnoreCase ("sir walter raleigh")) {
			score += 1;	
		}
		else {
			score -= 1;}
		answer = JOptionPane.showInputDialog("First think of the person who lives in disguise,\n"
				+ "Who deals in secrets and tells naught but lies.\n"
				+ "Next, tell me what’s always the last thing to mend,\n"
				+ "The middle of the middle and end of the end?\n"
				+ "And finally, give me the sound often heard\n"
				+ "During the search for a hard-to-find word.\n"
				+ "Now string them together, and answer me this,\n"
				+ "Which creature would you be unwilling to kiss?\n"
				+ "\n"
				+ "Who am I?");
		if(answer.equalsIgnoreCase ("spider")) {
			score += 1;	
		}
		else {
			score -= 1;}
		answer = JOptionPane.showInputDialog("I roam the woods of Hogwarts school\n"
				+ "And my coat is a lovely white,\n"
				+ "But don’t you dare, try to drink my blood\n"
				+ "Or you’ll be cursed for life.\n"
				+ "\n"
				+ "Who am I?");
		if(answer.equalsIgnoreCase ("unicorn")) {
			score += 1;	
		}
		else {
			score -= 1;}
		answer = JOptionPane.showInputDialog("All the trouble Harry Potter had\n"
				+ "On this person it can be blamed\n"
				+ "He once went by the name Tom Riddle\n"
				+ "And now He-Who-Must-Not-Be-Named\n"
				+ "\n"
				+ "Who is he?");
		if(answer.equalsIgnoreCase ("lord voldemort")) {
			score += 1;	
		}
		else {
			score -= 1;}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showConfirmDialog(null, score);
	}
}
