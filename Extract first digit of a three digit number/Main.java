import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int num,first;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      first=num;
      while(first>=10)
      {
        first=first/10;
      }
      System.out.println(first);
        
	}
}