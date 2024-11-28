class Triangle implements Shape {
    
    private double a, b, c;


    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    @Override
    public double getArea(){
        double s = (getPerimeter())/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double getPerimeter(){
        return a+b+c;
    }

    @Override
    public void printShapeType(){
        System.out.println("Triangle");
    }
}
