import java.util.HashMap;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        HashMap<String, MathObject> map = new HashMap<>();

        Vector2 a = new Vector2();
        Vector2 b = new Vector2(5, 9, "First");
        Vector2 c = b.clone();
        Vector2 d = new Vector2(9, 10, "Third");
        Vector2 e = new Vector2(4, 0, "Fourth");
        Vector2 f = new Vector2(1, 1, "Pineapple");
        

       

        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a.magnitude(b));
        System.out.println(b.magnitude(c));

        System.out.println(a.getDimension());
        System.out.println(b.getDimension());
        System.out.println(c.getDimension());

        System.out.println(a.isEqual(b));
        System.out.println(b.isEqual(c)); */
        map.put(a.descrption, a);
        map.put(b.descrption, b);
        map.put(c.descrption, c);
        map.put(d.descrption, d);
        map.put(e.descrption, e);
        map.put(f.descrption, f);


        Scanner scan  = new Scanner(System.in);
        boolean exit = false;

        while (!exit)
        {
         System.out.println("Please enter a descritpion ");
         String des = scan.nextLine();
         
         boolean found = false;
            for (String i : map.keySet()) 
              {
                if (des.equals(i))
                {
                    System.out.println(map.get(i));
                    found = true;
                    break;
                }
              }  
                  
              if (!found)
              {
                System.out.println("MathObject not found.");
              }
              for (String i : map.keySet()) 
              {
                System.out.println(map.get(i));
              }
       }

    }
}
