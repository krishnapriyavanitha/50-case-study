import java.util.*;
public class TextAnalyzer{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String t=s.nextLine(); int v=0,c=0; for(char ch:t.toLowerCase().toCharArray()) if(ch>='a'&&ch<='z') if("aeiou".indexOf(ch)>=0) v++; else c++;
System.out.println("Vowels:"+v+" Consonants:"+c);
}}
