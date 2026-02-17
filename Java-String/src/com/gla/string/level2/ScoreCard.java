package com.gla.string.level2;
public class ScoreCard {

    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                marks[i][j] = (int)(Math.random() * 100);

        return marks;
    }

    public static String grade(double percent) {
        if (percent >= 90) return "A";
        if (percent >= 75) return "B";
        if (percent >= 60) return "C";
        if (percent >= 40) return "D";
        return "F";
    }

    public static void main(String[] args) {
        int[][] marks = generateMarks(5);

        System.out.println("P\tC\tM\t%\tGrade");

        for (int[] m : marks) {
            int total = m[0] + m[1] + m[2];
            double percent = total / 3.0;

            System.out.println(m[0] + "\t" + m[1] + "\t" + m[2] +
                    "\t" + Math.round(percent * 100) / 100.0 +
                    "\t" + grade(percent));
        }
    }
}
