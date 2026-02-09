class SecureDataModule{
private int data;
void set(int d){data=d;} int get(){return data;}
public static void main(String[] a){SecureDataModule o=new SecureDataModule(); o.set(50); System.out.println(o.get());}
}
