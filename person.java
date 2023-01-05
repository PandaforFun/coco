public class person
{
    String name;
    int age;
    int salary;
}
class practical_2
{
    public static void main(String[] args)
    {
        person pr1 = new person();//object creation
        pr1.name= "Rishav Parasar";
        pr1.age=19;
        pr1.salary=35000;
        System.out.println("Name of the person is "+pr1.name);
        System.out.println("Age of the person is "+pr1.age);
        System.out.println("salary of the person is "+pr1.salary);
    }
}
