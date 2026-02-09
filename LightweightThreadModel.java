class Job implements Runnable{public void run(){System.out.println("Job Running");}}
public class LightweightThreadModel{
public static void main(String[] a){new Thread(new Job()).start();}
}
