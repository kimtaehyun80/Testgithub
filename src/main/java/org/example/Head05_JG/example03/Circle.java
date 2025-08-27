package org.example.Head05_JG.example03;

// 도형 구현 클래스
public class Circle implements Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea() {  //인터펭스 shape
        return Math.PI * radius * radius; }
    //파이*반지름^2=원넓이
}