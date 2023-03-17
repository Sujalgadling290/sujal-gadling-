import java.util.Scanner;
class Product{ 
        int res1=1,rem=0;
        public int prd(int no){
                 while (no>0) {
                         rem=no%10;
                         res1=res1*rem;
                         no=no/10;
                 }
                 return res1;
        }
}
class ProductOfDigitsClass{
        public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter Any Number: ");
               int n=sc.nextInt();
               product obj=new product();
               int res=obj.prd(n);
               system.out.println("The Product Of Digits is "+res);
        }
}
          
