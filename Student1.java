public class Student1
{
    String firstName;
    String lastName;
    int age;
    //Student Constructor
    public  Student1()
    {
        firstName="Rishav";
        lastName="Parasar";
        age=20;
    }

    public static void main(String[] args)
    {
        Student1 Student = new Student1();
        System.out.println("name of the student is "+Student.firstName+" "+ Student.lastName);
        System.out.println("Age is " + Student.age);
    }
}
