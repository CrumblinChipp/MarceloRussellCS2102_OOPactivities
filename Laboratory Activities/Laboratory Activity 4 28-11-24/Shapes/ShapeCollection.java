
public class ShapeCollection {
    private Shape[] shapes;

    ShapeCollection(Shape[] shapes){
        this.shapes =shapes;
    }

    public void getPropertyValues(){
        for (Shape shape : shapes){
            shape.printShapeType();
            System.out.printf("Area: %.2f\n", shape.getArea());
            System.out.printf("Perimeter: %.2f\n\n", shape.getPerimeter());
        }
    }
}
