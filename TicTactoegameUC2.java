import java.util.Scanner;
public class TicTactoegameUC2{
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
	displayborad(borad);
	
	boolean isplayer1 = true;
	char symbol = ' ';
	if(isplayer1) {
		symbol= 'X';
	}else{
		symbol= 'O';
	}

System.out.println("enter row (0,1,2) : ");
	int row =in.nextInt();
System.out.println("enter col (0,1,2) : ");
	int col =in.nextInt();
}

public static  void displayborad(char[][] borad){
	for(int i = 0; i < 3; i++){
		for(int j = 0; j < 3; j++){
	System.out.println(borad[i][j]);
	}
}
}
}
