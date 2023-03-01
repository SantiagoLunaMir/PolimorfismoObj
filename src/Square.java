public class Square extends Shape{
    private double side;
    public Square(){
        //super referencia a la clase padre y su construntor
        super("Cuadrado");//tiene que ir al inicio del constructor
    }
    public Square(double side){
        this();
        this.side=side;
    }
    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return side*4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public String draw(){
        return "▀";
    }
    public double getSidesCount(){
        return 4;
    }
}
