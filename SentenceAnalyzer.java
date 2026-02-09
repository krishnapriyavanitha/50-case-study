import java.util.*;
public class SentenceAnalyzer{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String[] w=s.nextLine().split(" "); String m="";
for(String x:w) if(x.length()>m.length()) m=x;
System.out.println(m);
}}
