class Square implements Shape{
    private double side;
    

    Square(double side){
        this.side = side;
    }

    public Square(){
        this.side = 0;
    }

    @Override
    public double getArea(){
        return side*side;
    }

    @Override
    public double getPerimeter(){
        return side*4;
    }
    
    @Override
    public void printShapeType(){
        System.out.println("Square");
    }
}
