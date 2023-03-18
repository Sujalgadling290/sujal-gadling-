class StringManipulators{
        public static void main(String[] args) {
                String str="sujal";
                System.out.println(str);
                String str1=new String("sujal");
                System.out.println(str1);
          
                char[] ch={'s','u','j','a','l',};
                String str3=new String(ch);
                String.out.println(str3);
          
                char[] ch1={'s','u','j','a','l','g','a','d','l','i','n','g'};
                String str4=new String(ch1,2,8);
                Sytsem.out.println(str4);
          
                byte[] b={65,66,67,68,69,70};
                String str5=new String(b);
                System.out.println(str5);
          
                byte[] b1={65,66,67,68,69,70};
                String str6=new String(b1,2,4);
                String.out.println(str6);
        }
}
