package Exercises;

import java.util.Scanner;
public class GoAskAlice {
    public static void main(String[] args){
        String alice = "Alice was beginning to get very tired of sitting" +
                " by her sister on the bank, and of having nothing" +
                " to do: once or twice she had peeped into the" +
                " book her sister was reading, but it had no" +
                " pictures or conversations in it, 'and what is" +
                " the use of a book,' thought Alice 'without" +
                " pictures or conversation?'";

        Scanner input = new Scanner(System.in);
        System.out.println("What word should we search for?");
        String searchTerm = input.nextLine();
        input.close();

        //Boolean searchTermFound = true;

        if(alice.toLowerCase().contains(searchTerm.toLowerCase())){
            System.out.println(searchTerm + " is in the text.");
        }else{
            System.out.println(searchTerm + " is not the text.");
        }

        int index = alice.indexOf(searchTerm);
        int length = searchTerm.length();
        System.out.println("Your search term first appears at index " + index + " . Your term is " + length + " characters long." );
        String modifiedSentence = alice.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
}
