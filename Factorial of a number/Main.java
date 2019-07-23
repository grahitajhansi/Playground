import java.util.Scanner;
class Main{
	public static void main (String[] args){
     


 Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int fact = 1;
        //Multiplication of all numbers from 1 to given number
	    for(int count = 1; count <= num; count++)
	    {
	        fact = fact * count;
	    }
	    System.out.print(fact);
	}
}  