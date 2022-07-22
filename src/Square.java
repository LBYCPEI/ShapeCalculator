public class Square extends Shape{

    private double lengthOfSide;

    public void setLengthOfSide(double lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double calculateArea() {
        return lengthOfSide*lengthOfSide;
    }

    @Override
    public double calculatePerimeter() {
        return 4*lengthOfSide;
    }
}
