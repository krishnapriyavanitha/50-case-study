import java.util.*;
public class ReverseProcessingUnit{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),r=0; for(;n>0;n/=10) r=r*10+n%10;
System.out.println(r);
}}
