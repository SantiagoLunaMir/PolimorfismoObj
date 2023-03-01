public class Triangle extends Shape{
    private double base,height;
    public Triangle(){
        super("Triangulo");
    }
    public Triangle(double base,double height){
        this();
        this.base=base;
        this.height=height;
    }
    public double getArea(){
        return (base*height/2);
    }
    public double getPerimeter(){
        double pitagoras,aux;
        pitagoras = (((1 / 2) * base)*((1 / 2) * base) )+(height*height);
        aux=Math.sqrt(pitagoras);
        return (2*aux + base);
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public String draw(){
        return "▲";
    }
    public double getSidesCount(){
        return 3;
    }
}
