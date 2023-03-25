//Single Inheritance
import java.util.Scanner;
class parent{
        public void add(int a,int b){
               System.out.println("The Addition is "+(a+b));
        }
        public void sub(int a,int b,){
               System.out.println("The Multiplication is "+(a-b));
        }
}
class Child extends parent{
        public void mul(int a,int b){
               System.out.println("The Subtraction is "+(a+b));
        }
        public void div(int a, int b){
               System.out.println("The dxivision is "+(a/b));
        }
}
