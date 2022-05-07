package $03_Bridge;

public class Test
{
    public static void main(String[] args)
    {
        TriangleShape triangleShape = new TriangleShape(new BlueColor());
        System.out.println(triangleShape.getShape());
        System.out.println("改变颜色 >>>>>>>>>>>");
        triangleShape.setColor(new RedColor());
        System.out.println(triangleShape.getShape());

        RectangleShape rectangleShape = new RectangleShape(new BlueColor());
        System.out.println(rectangleShape.getShape());
        System.out.println("改变颜色 >>>>>>>>>>>");
        rectangleShape.setColor(new YellowColor());
        System.out.println(rectangleShape.getShape());
    }
}
