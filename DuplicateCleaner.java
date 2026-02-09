import java.util.*;
public class DuplicateCleaner{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),a[]=new int[n]; for(int i=0;i<n;i++) a[i]=s.nextInt();
for(int i=0;i<n;i++){ boolean d=false; for(int j=0;j<i;j++) if(a[i]==a[j]) d=true; if(!d) System.out.print(a[i]+" "); }
}}
