package $03_Bridge;

abstract class Shape
{
    protected Color mColor;

    public Shape(Color color)
    {
        mColor = color;
    }

    public Color getColor()
    {
        return mColor;
    }

    public void setColor(Color color)
    {
        mColor = color;
    }

    abstract String getShape();

}
