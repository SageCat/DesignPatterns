package $03_Bridge;

public class TriangleShape extends Shape
{
    public TriangleShape(Color color)
    {
        super(color);
    }

    @Override
    String getShape()
    {
        return mColor.getColor() + "的三角形";
    }
}
