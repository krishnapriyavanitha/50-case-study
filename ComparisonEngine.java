import java.util.*;
public class ComparisonEngine{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
System.out.println(a>b&&a>c?a:b>c?b:c);
}}
