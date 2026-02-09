class One extends Thread{public void run(){System.out.println("One");}}
public class DependencyExecutionSystem{
public static void main(String[] a)throws Exception{One t=new One(); t.start(); t.join(); System.out.println("Two");}
}
