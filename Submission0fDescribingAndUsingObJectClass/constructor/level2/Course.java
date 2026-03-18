package constructor.level2;

class Course {
    String courseName;
    int duration;
    double fee;

    static String instituteName = "ABC Institute";

    void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }
}