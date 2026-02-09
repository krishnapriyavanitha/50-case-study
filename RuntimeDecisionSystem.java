class Base{void show(){System.out.println("Base");}}
class Child extends Base{void show(){System.out.println("Child");}}
public class RuntimeDecisionSystem{public static void main(String[] a){Base b=new Child(); b.show();}}
