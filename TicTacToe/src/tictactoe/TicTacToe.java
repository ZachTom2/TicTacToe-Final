/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author 2005988
 */
import java.util.Scanner;
public class TicTacToe{
    public static void main(String[] args) {
        String xOro=null;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to be x or o?: ");
        xOro=input.nextLine();
        while (xOro!="X"||xOro!="O"){
            System.out.println("Do you want to be x or o?: ");
            xOro=input.nextLine();
            xOro.toUpperCase();
            if (xOro!="X"||xOro!="O"){
                System.out.println("Must be an x or o");
            }
        }  
        Player one =new Player(xOro);
        System.out.println("Player One is "+ xOro);
        if (xOro.equals("X")){
            Player two = new Player("O");
            System.out.println("Player Two is O");
        }
        else {
            Player two = new Player("X");
            System.out.println("Player Two is X");
        }
        play(one,two);
        
    }
}

        

        
