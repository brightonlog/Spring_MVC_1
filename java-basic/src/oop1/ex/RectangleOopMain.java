package oop1.ex;

import org.w3c.dom.css.Rect;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("area = " + area);

        int permieter = rectangle.calculatePerimeter();
        System.out.println("permieter = " + permieter);

        boolean square = rectangle.isRectangle();
        System.out.println("square = " + square);
    }
}
