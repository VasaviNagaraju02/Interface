package interface1;
interface Showable2{
void show();
interface Message{
void msg();
}
}
class Interface5 implements Showable2.Message{
public void msg(){System.out.println("Hello nested interface");}
public static void main(String args[]){
Showable2.Message message=new Interface5();
message.msg();
}
}
