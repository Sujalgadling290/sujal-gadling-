import java.util.Scanner;
class Day{
         public static void main(String[] args) {
                 Scanner sc=new Scanner(System.in);
                 System.out.print("Enter day(sun/mon/tue/wed/thr/fri/sat/): ");
                 String day=sc.next();
                 switch(day){
                   case "sun" :
                           System.out.print("The day is Sunday");
                           break:
                    case "mon":
                           System.out.print("The day is Monday");
                           break;
                     case"tue":
                           System.out.print("The day is Tuesday");
                           break;
                      case"Wed":
                           System.out.print("The day is Wednesday");
                            break;
                   case "Thr":
                          System.out.print("The day is Thrusday");
                          break;
                   case "Fri":
                          System.out.print("The day is Friday");
                          break;
                    case"Sat":
                          System.out.print("The day is Saturday");
                           break;
                 }
         }
}
                     
    
                     
