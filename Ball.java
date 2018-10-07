package ru.mirea;

public class Ball {
    private int radius;
    private String color;
    private String firm;

    public Ball(int r, String c, String f){
        radius = r;
        color = c;
        firm = f;
    }

    public Ball(int r, String c){
        radius = r;
        color = c;
        firm = "firm";
    }

    public Ball(int r){
        radius = r;
        color = "red";
        firm = "firm";
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor(String color) {
        return color;
    }

    public String getFirm(String firm) {
        return firm;
    }

    public String toString() {
        return "Radius: " + this.radius + " Color: " + this.color +  " Firm: " + this.firm;
    }

    public void into() {
        System.out.println("Radius: " + getRadius() + " Color: " + getColor(color) + " Firm: " + getFirm(firm));
    }
}
