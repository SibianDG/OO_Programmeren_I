class Circle {

    double radius;

    public double getLength (){
        System.out.println(radius);
        return 2*radius*Math.PI;
    }

    public double getArea (){
        return Math.pow(radius, 2)*Math.PI;
    }
}