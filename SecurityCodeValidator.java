import java.util.*;
public class SecurityCodeValidator{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),r=0,t=n; for(;t>0;t/=10) r=r*10+t%10;
System.out.println(n==r?"Valid Code":"Invalid Code");
}}
