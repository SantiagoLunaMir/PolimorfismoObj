public abstract class Shape {//tiene que se abstract la class tambn puede o no tener metodos abstract, no puede ser instanciada solo puede ser papa
    private String name;//protected indicando que es la padre como un distintivo
    public Shape(String name){
        this.name=name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract double getSidesCount();
    public String getName(){
        return name;
    }
    public abstract String draw();//abstract implementado de manera obligatoria

}

