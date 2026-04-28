package solid.lsp;

import solid.lsp.solution.IShape;
import solid.lsp.solution.RectangleSolution;
import solid.lsp.solution.SquareSolution;

public class LiskovSubstitutionPrincipal {
    public static void main(String[] args) {
//Problem
//        Rectangle rectangle = new Rectangle();
//        rectangle.setHeight(10);
//        rectangle.setWidth(5);
//        System.out.println(rectangle.getArea());
//
//        Rectangle square = new Square();
//        square.setWidth(10);
//        square.setHeight(5);
//        //will print wrong output
//        System.out.println(square.getArea());

        //Solution
        IShape rectangle = new RectangleSolution(5, 10);
        System.out.println("Area of rectangle is : " + rectangle.getArea());

        IShape square = new SquareSolution(10);
        System.out.println("Area of square is : " + square.getArea());
    }
}
