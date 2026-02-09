import java.util.*;
public class DuplicateCharacterDetector{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String t=s.nextLine();
for(int i=0;i<t.length();i++) for(int j=i+1;j<t.length();j++) if(t.charAt(i)==t.charAt(j)) {System.out.print(t.charAt(i)+" "); break;}
}}
