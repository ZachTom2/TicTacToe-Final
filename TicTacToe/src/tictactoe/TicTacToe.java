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

    Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        
        
        Player one =new Player("x");
        Player two = new Player("o");
    }
    public void createPlayer(player x){
        System.out.println("X or Y?");
        String temp=scan.next();
        Player x =new Player(temp);
    }
    
}
