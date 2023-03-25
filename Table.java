import java.util.Scanner;
class Table{
        public static void main(String[] args) {
               Scanner sc=new SCanner(System.in);
               System.out.print("Enter The Number: ");
               int n=sc.nextInt();
                  for (int i=0;i<=10 ;++i ) {
                       System.out.println(n+" X "+i+"="+(n*i));
                  }
        }
}
