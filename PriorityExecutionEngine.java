class P extends Thread{public void run(){System.out.println(getPriority());}}
public class PriorityExecutionEngine{
public static void main(String[] a){P t=new P(); t.setPriority(8); t.start();}
}
