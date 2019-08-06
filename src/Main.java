public class Main {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
        shapes[1] = new Rectangle(3,3);
        shapes[2] = new Square(2);
        shapes[0] = new Square(9);
        for(Shape shape:shapes){
            if(shape instanceof Square){
                Square square= (Square)shape;
                System.out.println(square+"  ");
                square.howToColor();
            }
        }

    }

}
