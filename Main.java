package ru.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Ball ball_1 = new Ball(0, " ", " ");
        System.out.println("Enter radius Ball: ");
        ball_1.setRadius(in.nextInt());
        System.out.println("Enter color Ball: ");
        ball_1.setColor(in.next());
        System.out.println("Enter firm Ball: ");
        ball_1.setFirm(in.next());

        Ball ball_2 = new Ball(0, " ");
        System.out.println("Enter radius Ball: ");
        ball_2.setRadius(in.nextInt());
        System.out.println("Enter color Ball: ");
        ball_2.setColor(in.next());

        Ball ball_3 = new Ball(0);
        System.out.println("Enter radius Ball: ");
        ball_3.setRadius(in.nextInt());

        ball_1.into();
        ball_2.into();
        ball_3.into();
    }
}
