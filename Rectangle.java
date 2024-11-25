
// Create a Rectangle class with methods to calculate the area and perimeter

    public class Rectangle {
        private double length;
        private double width;
    
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
            System.out.println("Length : "+length);
            System.out.println("Width : "+width);
        }
    
        public double calculateArea() {
            return length * width;
        }
    
        public double calculatePerimeter() {
            return 2 * (length + width);
        }
            public static void main(String[] args) {
                Rectangle rectangle = new Rectangle(5, 3);
                System.out.println("Area: " + rectangle.calculateArea());
                System.out.println("Perimeter: " + rectangle.calculatePerimeter());    
         }
    }