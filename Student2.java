public class Student2
{
    int id;
    String name;
    //creating a parameterized Constructor
    Student2(int i, String n)
    {
        id=i;
        name=n;
    }
    //method to display the values
    void display()
    {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2(111,"Rishav");
        Student2 s2 = new Student2(112,"Parasar");
        s1.display();
        s2.display();
    }
}
