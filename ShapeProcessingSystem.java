abstract class Shape{abstract double area();}
class Square extends Shape{double area(){return 4*4;}}
public class ShapeProcessingSystem{public static void main(String[] a){Shape s=new Square(); System.out.println(s.area());}}
