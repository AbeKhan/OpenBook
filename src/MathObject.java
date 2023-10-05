public abstract class MathObject 
{
    String descrption;

    public MathObject()
    {
        descrption = "Empty";
    }

    public MathObject(String text)
    {
        descrption = text;
    }

    public String toString()
    {
        return descrption;
    }

    abstract  int getDimension();

}
