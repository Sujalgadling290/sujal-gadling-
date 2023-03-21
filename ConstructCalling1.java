//Constructor Calling Hierarchy
class A{
        public A(){
                 Sytem.out.println("Class A Constructor");
        }
        public void showA(){
                System.out.println("Class A Show");
        }
}
class B extends A{
        public B(){
                 System.out.println("Class B Constructor");
        }
        public void showB(){
                System.out.println("Class B Show");
        }
}
class ConstructorCalling1{
        public static void main(String[] args) {
                B onj=new B();
                obj.showB();
                A obj1=new a();
                obj.showA();
        }
}
