class ServiceOverloading{
int add(int a,int b){return a+b;}
double add(double a,double b){return a+b;}
public static void main(String[] a){ServiceOverloading o=new ServiceOverloading(); System.out.println(o.add(2,3)); System.out.println(o.add(2.5,3.5));}
}
