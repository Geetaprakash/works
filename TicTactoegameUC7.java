import java.util.*;
	public class TicTactoegameUC7
	{
         public static void main(String[] args)
	{
  Scanner in = new Scanner(System.in);
  int row, column;
  char player = 'X';
  char[][] board = new char[3][3];
  for(int i=0;i<3;i++){
     for(int j=0;j<3;++j){
        board[i][j] = ' ';
     }
     }   
     while(!checkWin(board,'O')==true)
     {
        computerPlay(board);
        displayBoard(board);
        if(checkWin(board,'X'))
        {
           System.out.println("Computer Wins");
           System.exit(0);
        }
        if(checkTie(board))
        {
           System.out.println("Tie game");
           System.exit(0);
        }
        playerPlay(board);
        displayBoard(board);
        if(checkWin(board,'O'))
        {
           System.out.println("Player Wins");
           System.exit(0);
        }
        if(checkTie(board))
        {
           System.out.println("Tie game");
           System.exit(0);
        }
     }
  }

   
  public static void playerPlay(char[][] board)
  { 
  int row, column;
  Scanner in = new Scanner(System.in);
  while(checkTie(board)!= true)
  {

     System.out.println("Enter a row and column (0, 1, or 2); for player :");
     row = in.nextInt();
     column = in.nextInt();
  }
 }
 // Check by row, column, and diagonals
 public static boolean checkWin(char[][] board,char ch)
 {
  if (  board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O' || 
  
        board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O' || 
        board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O' || 
        board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O' || 
        board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O' ||  
        board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O' || 
        board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O' ||  
        board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O')    
 
   {
     return true;
   }
   else {

     return false;
   }
}

 public static boolean checkTie(char[][] board)
 {
  for (int i = 0; i< board.length; i++) {
     for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] != 'O' && board[i][j] != 'X') {
           return true;
        }
     }
   }
  return false;
 }

 public static void displayBoard(char[][] board)
 {
  System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n---------");
  System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n---------");
  System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2] + "\n");
}
 public static void computerPlay(char[][]board)
 {
  while(checkTie(board)!= true)
  {
     for (int i=0; i<board.length; i++){
        for(int j = 0; j<board.length; j++){
           board[i][j] = (char)(Math.random()*10);
        }
     }
  }
 }
}
