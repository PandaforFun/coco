class Main
{
    String name;
    int age;
    int salary;
    public static void main(String[] args)
    {
        Main pr1 = new Main();//object creation
        pr1.name= "Jack Sparrow";
        pr1.age=19;
        pr1.salary=35000;
        System.out.println("Name of the person is "+pr1.name);
        System.out.println("Age of the person is "+pr1.age);
        System.out.println("salary of the person is "+pr1.salary);
    }
}
