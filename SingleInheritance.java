class Room
{
    int l, w;

    
    Room()
   {
        l = 10;
        w = 5;
    }

    void display()
    {
        System.out.println("Area of room: " + (l * w));
    }
}

class Hall extends Room
{
    int H = 15; 

    
    void volume()
    {
        System.out.println("Volume of room: " + (l * w * H));
    }
}

public class SingleInheritance
{
    public static void main(String[] args) 
    {
        Hall h = new Hall();
        h.display(); 
        h.volume();
    }
}
