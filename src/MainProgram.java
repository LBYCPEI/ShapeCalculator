public class MainProgram {

    public static void main(String[] args) {
        // 1. Declare and Instantiate Square
        Square square = new Square();
        // 2. Set the side value
        square.setLengthOfSide(2);
        // 3. Let the object calculate its area
        System.out.println(square.calculateArea());

        // Another example:
        //  1. Declare and Instantiate Rectangle
        Rectangle rectangle = new Rectangle();
        // 2. Set the length and width value
        rectangle.setLength(2.0);
        rectangle.setWidth(3.0);
        // 3.  Let the object calculate its area and perimeter
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
    }
}
