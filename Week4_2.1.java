class Marks
{
    int M1, M2, M3, total;

    
    Marks()
    {
        M1 = 90;
        M2 = 92;
        M3 = 100;
     }

   
    void sum()
   {
        total = M1 + M2 + M3; 
        System.out.println("Total Marks: " + total);
    }
}


class Average extends Marks
{
    double Avg;

    
    void average() {
        Avg = total / 3.0; 
        System.out.println("Average Marks: " + Avg);
    }
}


class Percentage extends Average {
    
    void percent() {
         
        System.out.println("Percentage: " + (total / 300.0) *100);
    }
}


public class MultiLevel {
    public static void main(String[] args) {
        Percentage P = new Percentage(); 
        P.sum();      
        P.average(); 
        P.percent();  
    }
}
