public class AverageMarks {
    public static void main(String[] args) {
    String studentName = "sam";
    int maths = 94;
    int physics = 95;
    int chemistry = 96;
    int totalSubjects = 3;
    double averagemarks = (double)(maths + physics + chemistry)/ totalSubjects;
    System.out.println(studentName + "average marks in pcm is" + averagemarks );
}
}
