import java.util.*;
public class SeriesGenerator{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),a=0,b=1,c; for(int i=1;i<=n;i++){System.out.print(a+" "); c=a+b; a=b; b=c;}
}}
