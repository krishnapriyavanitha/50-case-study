import java.util.*;
public class InventoryFactorCalculator{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),f=1; for(int i=1;i<=n;i++) f*=i;
System.out.println(f);
}}
