public class Rectangle extends Shape{
    private double base, height;
    public Rectangle(){
        super("Rectangulo");
    }
    public Rectangle(double base,double height){
        this();
        this.base=base;
        this.height=height;
    }
    public double getArea(){//overriding , sobreeescritura de metodos
        return base*height;
    }
    public double getPerimeter(){
        return ((base*2)+(height*2));
    }
    public String draw(){
        return "█";
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    public double getSidesCount(){
        return 4;
    }
}
