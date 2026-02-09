class Parent{void work(){System.out.println("Basic Work");}}
class Child extends Parent{
public static void main(String[] a){Child c=new Child(); c.work();}
void work(){System.out.println("Enhanced Work");}
}
