import java.util.*;
public class StatisticsGenerator{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),a[]=new int[n],sum=0; for(int i=0;i<n;i++){a[i]=s.nextInt(); sum+=a[i];}
System.out.println("Sum="+sum+" Avg="+(sum/n));
}}
