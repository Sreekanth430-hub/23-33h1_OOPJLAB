class Method
{
    void Display(String Name,int ID)
    {
        System.out.println("Name:"+Name+ "ID:"+ID);
    }
    void Display(int age,int marks)
    {
        System.out.println("Age"+age+"Marks:"+marks);
    }
}
class MethodOverload
{
    public static void main(String args[])
    {
        Method a1=new Method();
        a1.Display("Sreekanth",39);
        a1.Display(20,100);
    }
}
