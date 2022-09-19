package interface1;

interface Printable{
void print();
}
interface Showable{
void print();
}

class Interface2 implements Printable, Showable{
public void print(){System.out.println("Hello");}
public static void main(String args[]){
Interface2 obj = new Interface2();
obj.print();
}
}
