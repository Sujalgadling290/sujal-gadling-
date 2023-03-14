import java.util.Scanner;
class Gndrf{
        public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
               System.out.print("Enter 1st Paper Marks: ");
               int m1=sc.nextInt();
               System.out.print("Enter 2nd Paper Marks: ");
               int m2=sc.nextInt();
               System.out.print("Enter 3rd Paper marks: ");
               int m3=sc.nextInt();
               System.out.print("Enter gender(male/female) :");
               String gender=sc.next();
               int total=m1+m2+m3;
               double per=total/3.0;
                if (per>=62 && gender.equals("female")) {
                         System.out.print("you can take Admission");
                }else{
                      System.out.print("you can't take Admission");
                }
        }
}
