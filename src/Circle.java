public class Circle extends Shape{
    private double radio;

    public Circle(){
        super("Circulo");
    }
    public String toString() {
        return  "○";
    }
    public Circle(double radio){
        this();//llamar al constructor anterior y tiene que ser el primero tambien
        this.radio=radio;
    }
    public double getArea(){
        return Math.PI*radio*radio;
    }
    public double getPerimeter(){
        return Math.PI*radio*2;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String draw(){
            return "●";
        }
    public double getSidesCount(){
        return 1;
    }
}
