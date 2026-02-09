import java.util.*;
public class DataMerger{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),m=s.nextInt(),a[]=new int[n],b[]=new int[m]; for(int i=0;i<n;i++) a[i]=s.nextInt(); for(int i=0;i<m;i++) b[i]=s.nextInt();
for(int x:a) System.out.print(x+" "); for(int x:b) System.out.print(x+" ");
}}
