
class B extends A {
    public static void main(String[] args)
    {
        A obj = new A();
        System.out.println("Age : "+obj.age);
        System.out.println("Lucky Number : "+obj.lucky_number);
        System.out.println("Prefixed Name : "+obj.prefixed_name);
        System.out.println("Prefixed age : "+obj.prefixed_age);
        
    }
}