import java.util.*;
public class PowerComputationEngine{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int b=s.nextInt(),p=s.nextInt(),r=1; for(int i=1;i<=p;i++) r*=b;
System.out.println(r);
}}
