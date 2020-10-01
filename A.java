import java.util.*;
class A {
    private String name;
    protected int age;
    public int lucky_number;
    String prefixed_name;
    String prefixed_age;
    
    static
    {
        Scanner x = new Scanner(System.in);
        A obj1 = new A();
        System.out.println("Enter a name : ");
        obj1.name = x.nextLine();
        System.out.println("Enter an age : ");
        obj1.age = x.nextInt();
        System.out.println("Enter a Lucky Number : ");
        obj1.lucky_number = x.nextInt();
        display(obj1);
    }
    
    public static void operate()
    {
        A obj2 = new A();
        obj2.prefixed_name = obj2.lucky_number+obj2.name;
        obj2.prefixed_age = Integer.toString(obj2.lucky_number)+obj2.age;
    }
    
    static void display(A obj3)
    {
        System.out.println("Name : "+obj3.name);
    }
}
