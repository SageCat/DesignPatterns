package $03_Bridge;

public class RectangleShape extends Shape
{
    public RectangleShape(Color color)
    {
        super(color);
    }

    @Override
    String getShape()
    {
        return mColor.getColor() + "的矩形";
    }
}
