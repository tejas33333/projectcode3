class A{
  void displayA(){
    System.out.println("class A method");
 }
}
class B extends A{
  void displayB(){
    System.out.println("class B method");
 }
}
public class SingleInheritance{
public static void main(String[]args){
 B obj = new B();
 obj.displayA();
 obj.displayB();
 }
}