import java.util.*;
public class DataValidationSystem{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),a[]=new int[n],b[]=new int[n]; for(int i=0;i<n;i++) a[i]=s.nextInt(); for(int i=0;i<n;i++) b[i]=s.nextInt();
boolean same=true; for(int i=0;i<n;i++) if(a[i]!=b[i]) same=false;
System.out.println(same?"Same":"Not Same");
}}
