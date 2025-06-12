class parent
{
    void show()
    {
        System.out.println("This is patrent class ");
    }
}

class child extends parent
{
    void disp()
    {
        System.out.println("This is child class");
    }
}




public class Inheritance {
    public static void main(String[] args) 
    {
        parent p1 = new parent();
        child c1 = new child();
        p1.show();
        c1.disp();   
    }
}
