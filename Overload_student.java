public class Overload_student {
    int id;
    String name;
    Overload_student()
    {
        System.out.println("This is no-argument constructor");
    }
    Overload_student(int i,String n)
    {
        id=i;
        name=n;
    }

    public static void main(String[] args) {
        Overload_student s = new Overload_student();
        System.out.println("\n No-argument constructor values :\n");
        System.out.println("Student id : "+s.id+ "\nStudent name : "+ s.name);
        Overload_student s2 = new Overload_student(10,"Rishav");
        System.out.println("\n parametric constructor values :\n");
        System.out.println("Student id : "+s2.id+ "\nStudent name : "+ s2.name);
    }
}
