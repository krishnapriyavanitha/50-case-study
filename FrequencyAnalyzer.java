import java.util.*;
public class FrequencyAnalyzer{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),a[]=new int[n]; for(int i=0;i<n;i++) a[i]=s.nextInt();
for(int i=0;i<n;i++){int c=1; if(a[i]==-1) continue; for(int j=i+1;j<n;j++) if(a[i]==a[j]){c++;a[j]=-1;} System.out.println(a[i]+" -> "+c);}
}}
