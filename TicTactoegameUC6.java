
import java.util.Scanner;
public class TicTactoegameUC6{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("player1");
	String p1 = in.nextLine();
	System.out.println("player2");
	String p2 = in.nextLine();
 	char[][] borad= new char[3][3];
		for(int i = 1; i < 3; i++){ 
			for(int j = 1; j < 3; j++){
	 		borad[i][j] = '-';
			}
		}
	
	
	boolean isplayer1 = true;
	char symbol = ' ';
	if(isplayer1) {
		symbol= 'X';
	}else{
		symbol= 'O';
	}
if(isplayer1){
	System.out.println(p1+ "'s Turn (X):");
	System.out.println(p2+ "'s Turn (O):");
	}
int row = 0;
int col = 0;
while(true){
System.out.println("enter row (0,1,2) : ");
	 row = in.nextInt();
System.out.println("enter col (0,1,2) : ");
	 col = in.nextInt();
if(row < 0 || col < 0 || row > 2 || col > 2){
System.out.println("your row and col are out of bounds!");
}else 
if(borad[row][col] != '-'){
System.out.println("already made move");
}else{
break;
}
borad[row][col] = symbol;
displayborad(borad);
}
}

public static  void displayborad(char[][] borad){
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
	System.out.println(borad[i][j]);
	}
}
}

public static void computerPlay(char[][]borad)
 {
  while(checkTie(borad)!= true)
  {
     for (int i=0; i<borad.length; i++){
        for(int j = 0; j<borad.length; j++){
           borad[i][j] = (char)(Math.random()*10);
		}
	}
 }
}
}
