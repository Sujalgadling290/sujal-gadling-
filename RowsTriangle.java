import java.util.Scanner;
class RowsTriangle{
      public static void main(Static[] args){
             Scanner sc=new Scanner(System.in);
             System.out.print("Input Number Of Rows: ");
             int r=sc.nextInt();
              for (int i=1;i<=r ;++i ) {
                    for (int j=1;j<=i ;++ ) {
                             System.out.print(j);
                    }         
                    System.out.println();        
                    } 
      }     
}                     
