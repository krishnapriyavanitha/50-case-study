import java.util.*;
public class RankingSystem{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),a[]=new int[n],min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE; for(int i=0;i<n;i++){a[i]=s.nextInt(); if(a[i]<min){smin=min;min=a[i];} else if(a[i]<smin&&a[i]!=min) smin=a[i];}
System.out.println(min+" "+smin);
}}
