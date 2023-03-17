import java.util.Scanner;
class RevArray{
        public static void main(String[] args) {
               Scanner sc=new Scanner(System.in);
               int arr[]=new int[5];
               System.out.print("Enter The Array Elements: ");
               for (int i=0;i<arr.length ;++i ) {
                       arr[i]=sc.nextInt();
               }
               system.out.println();
               System.out.print("The Reverse Array is: ");
               for (int i=arr.length-1;i>=0 ;--1 _ {
                        System.out.print(arr[i]+" ");
               }
           }
      }
