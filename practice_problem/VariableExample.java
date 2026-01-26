class VariableExample
{
int id = 10;
String name ="sanjana";
int rollNo = 30;
static int age  = 20; //static variable
void display()// method
{
String status =" Active"; // local variable
System.out.println("Status:" + status); // print statement
} 
public static void main(String args[]) // main method
{
VariableExample var = new VariableExample();
var.display();// non static method so we have to create object
var.rollNo = 30 ;// instance variable access using object

System.out.println(age);// static variable access without object

}
}
