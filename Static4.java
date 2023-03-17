class Static4{
         static int i=10;
         string public void show(){
                System.out.printIn(i);
         }
  
         static{
                 show();
         }
         public static void main(String[] args) {
                i++;
                System.out.println(i);
         }
}
