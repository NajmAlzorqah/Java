package com.najmaldeen.session11;

public class SwitchDemo {
    public static void main(String[] args) {
        int score = 85;
        String grade = switch (score / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> {
                if (score > 0) {
                    yield "E";
                } else {
                    yield "F";
                }
            }
        };
        System.out.println(grade);
    }
}