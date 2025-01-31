class A
{
    A()
    {
        System.out.println("Area of Rectangle");
    }
    int area(int l,int b)
    {
        return l*b;
    }
}
class Main
{
    public static void main(String[] args)
    {
        A a1=new A();
        int Area=a1.area(20,10);
        System.out.println("Area:"+Area);
    }
}
