class Rectangle{
         int 11,12,b1,b2,res1,res2;
         public Rectangle(int x1,int y1,int x2,int y2){
                 11=x1;
                 b1=y1;
                 12=x2;
                 b2=y2;
         }
         public int area1(){
                 res1=11*b1;
                 return res1;
         }
         public int area2(){
                 res2=12*b2;
                 return res2;
         }
}
class RectangleClass{
       public static void main(String[] args) {
               Rectangle obj=new rectangle(4,5,5,8);
               int res1=obj.area1();
               int res2=obj.area2();
               System.out.println("The Area Of 1st Rectangle is "+res1);
               System.out.println("The Area of 2nd rectangle is "+res2);
       }
}
