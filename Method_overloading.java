class Parent
{
    public void show(int a , int b)
    {
        System.out.println("Sum:" +(a+b));
    }
}

class Child extends Parent
{
    public void show(double a , double b)
    {
        System.out.println("Sum:" +(a*b));
    }
}



public class Method_overloading {
    public static void main(String[] args)
    {
        Child c1 = new Child();
        c1.show(10, 20);
        c1.show(10.1, 20.2);
    }
}
