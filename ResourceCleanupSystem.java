public class ResourceCleanupSystem{
public static void main(String[] a){
try{System.out.println(10/0);}
catch(Exception e){System.out.println("Exception");}
finally{System.out.println("Cleanup Done");}
}}
