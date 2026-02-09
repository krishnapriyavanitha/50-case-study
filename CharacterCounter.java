import java.util.*;
public class CharacterCounter{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String t=s.nextLine(); char c=s.next().charAt(0); int cnt=0;
for(int i=0;i<t.length();i++) if(t.charAt(i)==c) cnt++;
System.out.println(cnt);
}}
