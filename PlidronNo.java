import java.util.Scanner;
class PlidronNo{
        public static void main(String[] args) {
                  Scanner sc=new Scanner(System.in);
                  System.out.print("Enter any Number: ");e
                  int no=sc.nextInt();
                  int rem,rev=0;
                  int no1=no;
                  do{
                     rem=no1%10;
                     rem=rev*10+rem;
                     no1=no1/10;
                  }while(no1>0);
            
                   if (rev==no) {
                           System.out.print(no+" is Palindrome Number");
                   }else {
                           System.out.print(no+" is not a palindrome Number");
                   }
        }
}
