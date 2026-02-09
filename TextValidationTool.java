import java.util.*;
public class TextValidationTool{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String t=s.next(); String r=""; for(int i=t.length()-1;i>=0;i--) r+=t.charAt(i);
System.out.println(t.equals(r)?"Palindrome":"Not Palindrome");
}}
