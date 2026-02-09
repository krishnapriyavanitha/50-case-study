import java.util.*;
public class CalculationSafetyModule{
public static void main(String[] a){
Scanner s=new Scanner(System.in);
try{System.out.println(10/s.nextInt());}catch(Exception e){System.out.println("Error");}
}}
