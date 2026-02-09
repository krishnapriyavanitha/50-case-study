class Person{void show(){System.out.println("Person");}}
class Student extends Person{void study(){System.out.println("Student");}}
class Scholar extends Student{public static void main(String[] a){Scholar s=new Scholar(); s.show(); s.study(); System.out.println("Scholar");}}
