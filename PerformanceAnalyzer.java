import java.util.*;
public class PerformanceAnalyzer{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),a[]=new int[n],m=0; for(int i=0;i<n;i++){a[i]=s.nextInt(); if(a[i]>m)m=a[i];}
System.out.println(m);
}}
