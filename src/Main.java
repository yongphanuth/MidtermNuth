/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Example of using Square class
        Rectangle rectangle = new Rectangle(6.0,7.0);
        Square square = new Square(5.0);
        System.out.println("Area of Rec: " + rectangle.getArea());
        System.out.println("Perimeter of Rec: " + rectangle.getPerimeter());
       
        System.out.println("Area of square: " + square.getArea());
        System.out.println("Perimeter of square: " + square.getPerimeter());
    }
}