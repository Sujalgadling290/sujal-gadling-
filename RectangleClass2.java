import java.util.Scanner;
class Rectangle{
         int 1,b,,area;
         public Rectangle(int x,int y){
                 1=x;
                 b=y;
         }
         public int Area(){
                  area=1*b;
                  return area;
         }
}
class RectangleClass2{
         public static void main(String[] args) {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("Enter Length and Breadth: ");
                 int a=sc.nextInt();
                 int c=sc.nextInt();
                 Rectangle obj=new Rectangle(a,c);
                 int res=obj.Area();
                 System.out.println("The Area Of Rectangle is "+res);
         }
}
