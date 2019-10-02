package com.pradeep.general;

public class SwitchCase {
    public static void main(String[] args) {
        int score = 70;
        switch (score) {
            case 70:
                System.out.println("Great score!");
            case 50:
                System.out.println("Pass score");
            default:
                System.out.println("Unknown score");
        }
    }
}
