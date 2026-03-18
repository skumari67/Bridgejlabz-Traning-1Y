package level2;


class Student {
    String name;
    int roll;
    int marks;

    String grade() {
        if (marks >= 80) return "A";
        else if (marks >= 60) return "B";
        else if (marks >= 40) return "C";
        else return "Fail";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sanjana";
        s.roll = 10;
        s.marks = 75;
        s.display();
    }
}