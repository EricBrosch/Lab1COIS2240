// Lab 1
// Eric Brosch-Sanchez

import javax.swing.JOptionPane;


public class Lab1{

    public static void main(String[] args){

        String guess;
        int random;
        int MIN = 1;
        int MAX = 5;
        boolean correctGuess;

        random = MIN + (int)(Math.random() * MAX);

        guess = JOptionPane.showInputDialog(null, "Try to guess the random number between 1 - 5");
        System.out.println("The Guess was " + guess);
        if(Integer.parseInt(guess) == random)
        {
            correctGuess = true;
        }
        else
        {
            correctGuess = false;
        }
        //JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
        JOptionPane.showMessageDialog(null, correctGuess + ", The Answer was " + random);
        System.out.println("The Answer was " + random);

    }


}