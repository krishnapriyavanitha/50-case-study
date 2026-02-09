interface Pay{void pay();}
class UPI implements Pay{public void pay(){System.out.println("UPI Payment");}}
public class PaymentGateway{public static void main(String[] a){Pay p=new UPI(); p.pay();}}
