class Rectangle implements Shape {
    
    private double length, width;


    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(){
        this.length = 0;
        this.width = 0;
    }

    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return (2*length) + (2*width);
    }

    @Override
    public void printShapeType(){
        System.out.println("Rectangle");
    }
}
