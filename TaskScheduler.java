class Task extends Thread{public void run(){System.out.println("Task Running");}}
public class TaskScheduler{
public static void main(String[] a){new Task().start();}
}
