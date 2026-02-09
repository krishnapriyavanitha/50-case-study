public class RobustErrorHandler{
public static void main(String[] a){
try{int x=a.length; int y=10/x; System.out.println(y);}
catch(ArithmeticException e){System.out.println("Math Error");}
catch(Exception e){System.out.println("Other Error");}
}}
