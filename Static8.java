class Static8{
         public void show(){
                 System.out.println("Non Static show");
         }
         static public void show1(){
                System.out.println("Static show");
         }
         {
               show();
         }
         static{
                show1();
         }
         public static void main(String[] args) {
                Static8 s=new Static8();
                System.out.println("I am in main");
         }
}
