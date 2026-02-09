class InitializationSystem{
InitializationSystem(){System.out.println("Default");}
InitializationSystem(int a){System.out.println(a);}
public static void main(String[] a){new InitializationSystem(); new InitializationSystem(10);}
}
