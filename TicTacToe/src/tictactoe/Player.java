package tictactoe;

import java.util.Scanner;
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
/**
 *
 * @author Robbie
 */
public class Player extends Board {
String xOro;
    public Player(String xOro) {
        this.xOro = xOro;
}
    Scanner scan =new Scanner(System.in);
    public String play(Player a, Player b){
        if (checkWin()!=true){
            place(a);
        }
        if (checkWin()!=true){
            place(b);
        }
        if (checkWin()!=true){
            play(a,b);
        }
        if (checkWin()==true){
            return whoWon(a,b).xOro+ " Wins!";
        }
        }
    public void place(Player a){
        System.out.println("Which column do you want to place your " +a.xOro+" in ?");
        int c= scan.nextInt();
         System.out.println("Which row do you want to place your " +a.xOro+" in ?");
        int r= scan.nextInt();
        board[c][r]=a.xOro;
    }
    public boolean checkWin() {
        return true;
    }
    public Player whoWon(Player a, Player b){
        
    }
}