class Main
{
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
        Main student = new Main();
        student.firstName="Jack";
        student.lastName="Sparrow";
        student.age=20;
        System.out.println("Name of student is "+student.firstName+" "+student.lastName);
        System.out.println("Age is "+ student.age);
    }
}
