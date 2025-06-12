class Parent
{
    public void display()
    {
        System.out.println("This is paraent class");
    }
}

class Child extends Parent
{
    public  void display1()
    {
        System.out.println("This is child class");
    }
}



public class Inheritance1 {
    public static void main(String[] args) 
    {
        Child c1  = new Child();
        c1.display();
        c1.display1();    
    }
}
