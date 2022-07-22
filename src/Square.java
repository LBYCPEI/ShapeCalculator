public class Square extends Shape{

    private int lengthOfSide;

    public void setLengthOfSide(int lengthOfSide) {
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
