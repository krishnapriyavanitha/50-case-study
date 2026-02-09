class A extends Thread{public void run(){System.out.println("A");}}
class B extends Thread{public void run(){System.out.println("B");}}
public class ConcurrentProcessingSystem{
public static void main(String[] a){new A().start(); new B().start();}
}
