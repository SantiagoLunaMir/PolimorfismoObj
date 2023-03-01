//package oop.parcial2;

import java.util.LinkedList;
import java.util.List;

//import oop.parcial2.shapes.*;

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();


        shapes.add(new Square(10)); // providing side
        shapes.add(new Rectangle(10, 20)); // providing base and height
        shapes.add(new Triangle(10, 20)); // providing base and height
        shapes.add(new Circle(10)); // providing radio


        for(Shape shape: shapes){
            System.out.println("Shape: " + shape.getName() + ": " + shape); //with shape print something related to the actual shape, for example ○ ▲ ■ █
            System.out.println("Real class name: " + shape.getClass().getName());
            System.out.println("Sides count: " + shape.getSidesCount());
            System.out.println("Perimeter: " + shape.getPerimeter());
            System.out.println("Area: " + shape.getArea());
            System.out.println("---------------------------------------");
        }

    }
}

/*
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");//LAS CLASES HIJAS DEBEN IMPLEMENTAR TODOS LOS METODOS DE LAS CLASES PADRE/abstract
        Triangle triangle = new Triangle(10,5);
        Rectangle rectangle=new Rectangle(6,4);
        Square square=new Square(9);
        Circle circle=new Circle(10);
        Object object = triangle;
        double area;

        area=triangle.getArea();
        area=rectangle.getArea();
        area=square.getArea();
        area=circle.getArea();
        //Shape shape = new Shape();//no puede ser instanciada
        //shape.draw(); //puede no hacer nada ya que no esta definido

        ArrayList<Shape> figuresFromMain = new ArrayList<>();

        figuresFromMain.add(triangle);
        figuresFromMain.add(rectangle);
        figuresFromMain.add(square);
        figuresFromMain.add(circle);
//polimorfismo estatico y dinamico
        printAreas(figuresFromMain);
    }
    public static void printAreas(ArrayList<Shape> shapes){
        for(Shape shape:shapes){//enhanced for(int dato:arreglo)
           System.out.println(shape.getName());
            System.out.println("Area: "+shape.getArea());
            System.out.println("Dibujito: "+shape.draw());
           //figure.getArea();
        }
        //java.util.itereator//iterador
    }
}
*/