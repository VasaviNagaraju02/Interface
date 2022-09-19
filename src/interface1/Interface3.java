package interface1;


interface Printable1{
void print();
}
interface Showable1 extends Printable{
void show();
}
class Interface3 implements Showable{
public void print(){System.out.println("Hello");}
public void show(){System.out.println("Welcome");}

public static void main(String args[]){
Interface3 obj = new Interface3();
obj.print();
obj.show();
}
}
