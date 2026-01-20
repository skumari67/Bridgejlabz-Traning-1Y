public class student {

   
    int id;
    String name;
    int age;

    
    void displayDetails() {
        String status = "Active";   // local variable
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("status: " + status);
    }

   
    public static void main(String[] args) {

        
        student s1 = new student();
        s1.displayDetails();
    }
}
