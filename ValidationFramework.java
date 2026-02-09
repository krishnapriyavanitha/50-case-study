class Invalid extends Exception{}
public class ValidationFramework{
public static void main(String[] a){
try{throw new Invalid();}
catch(Exception e){System.out.println("Invalid Input");}
}}
