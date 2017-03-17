/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Robbie
 */
public abstract class Board {
    String[][] board=new String[3][3];
    public void printBoard(){
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]+"|");
            }
            System.out.println();
            System.out.println("__  __  __");
        }
        
    }
    abstract void place();
    abstract boolean checkWin();
}
