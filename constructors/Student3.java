public class Student3
{
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Student3 student = new Student3();
        student.firstName="Rishav";
        student.lastName="Parasar";
        student.age=20;
        System.out.println("Name of student is "+student.firstName+" "+student.lastName);
        System.out.println("Age is "+ student.age);
    }
}
