import java.util.HashMap;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        HashMap<MathObject, MathObject> map = new HashMap<>();

        Vector2 a = new Vector2();
        Vector2 b = new Vector2(5, 9, "First");
        Vector2 c = b.clone();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a.magnitude(b));
        System.out.println(b.magnitude(c));

        System.out.println(a.getDimension());
        System.out.println(b.getDimension());
        System.out.println(c.getDimension());

        System.out.println(a.isEqual(b));
        System.out.println(b.isEqual(c));
        
    }
}
