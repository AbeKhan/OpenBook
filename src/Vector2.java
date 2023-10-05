import java.lang.Cloneable; 
public class Vector2 extends MathObject implements Cloneable
{
    int x;
    int y;
    

    public Vector2()
    {
        super();
        x = 0;
        y = 0;
    }

    public Vector2(int x, int y, String something)
    {
        super(something);
        this.x = x;
        this.y = y;
    }

    public int getDimension()
    {
        return 2;
    }

    public float magnitude(Vector2 a)
    {
        float holder = (float) Math.sqrt((this.x * a.x) + (this.y * a.y));
        return holder;
    }

    public boolean isEqual(Vector2 v)
    {
        if (this.x == v.x && this.y == v.y)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }

    public Vector2 clone() {
        try {
            // call clone in Object.
            return (Vector2) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(" Cloning not allowed. ");
            return this;
        }
    }

    public String toString()
    {
        return "(" + x + "," + y + ") Descrption: " + super.toString();
    }
}
