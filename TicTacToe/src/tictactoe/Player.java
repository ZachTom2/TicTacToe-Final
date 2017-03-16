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
public class Player extends Board
{
String xOro;
    public Player(String xOro) {
        this.xOro = xOro;
}
    public void placeX(int r, int c) {
        board[r][c] = "X";
    }
    public void placeO(int r, int c) {
    }
    public String checkWin(String winner) {
        return winner;
    }
    }