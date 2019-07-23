import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int first=n/100;
    int second=((n/10)%10);
    int third=n%10;
    int reverse=(third*100)+(second*10)+first;
    System.out.println(reverse);
  }
}