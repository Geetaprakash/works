public class TicTactoegameUC1{
public static void main(String[] args){
 	char[] borad= new char[10];
	borad = new char[10];
		for(int i = 1; i <borad.length; i++)
		{ 
	 		borad[i] = '-';
		}
	displayborad(borad);
	}

public static  void displayborad(char[] borad){
	System.out.println("|------|-----|");
	System.out.println(borad[1]+ "|" +borad[2]+ "|" +borad[3]);
	System.out.println("|------|-----|");
	System.out.println(borad[4]+ "|" +borad[5]+ "|" +borad[6]);
	System.out.println("|------|-----|");
	System.out.println(borad[7]+ "|" +borad[8]+ "|" +borad[9]);
	System.out.println("|------|-----|");
	}
}
