/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/**
 * step1 : generate 7 random cards and store in array - how step 2: take any
 * card input from user suit,number step 3: user card is in the array 'card is
 * found'
 *
 * @author Kishorkumar_Gondaliya
 * ID_number: 991506516
 */
//Kishorkumar_Gondaliya 
//ID_number: 991506516
import java.util.Scanner;

public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number from 1 to 13");
        int x = input.nextInt();

        System.out.println("Enter your Suit name from diamonds,clubs,spades,hearts");
        String s = input.next();

        System.out.println("\n****************************************");
        System.out.println("Your number is :" + x + " and suit is :" + s);
        System.out.println("****************************************");
        System.out.println("\n");

        Card[] magicHand = new Card[7];
        
       
        for (int i = 0; i < magicHand.length; i++) {
            Card c1 = new Card();
            c1.setValue(c1.cardNumberGenerator());// use a method to generate random *13
            c1.setSuits(c1.suitGenerator());// random method suit
            magicHand[i] = c1;
        }
        
        for (int i = 0; i < magicHand.length; i++) {
            System.out.println("Number is: " + magicHand[i].getValue() + " and suit is " + magicHand[i].getSuits());
        }

        int count = 0;
        for (int i = 0; i < magicHand.length; i++) {
            if (x == magicHand[i].getValue() && s.equals(magicHand[i].getSuits())) {
                count = 1;
                System.out.println("Your number " + x + " and suit " + s + " are matched");
            }
        }

        if (count == 0) {
            System.out.println("Your number and suit are not matched!!!");
        }

    }

}
