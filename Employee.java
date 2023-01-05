public class Employee
{
    int id;
    String name;
    float salary;
    Employee(int id,String name,float salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+salary+"\n");
    }
}
class TestThis
{
    public static void main(String[] args) {
        Employee emp1= new Employee(111,"Rishav",5000.25f);
        Employee emp2= new Employee(112,"Parasar",5000.24f);
        emp1.display();
        emp2.display();
    }
}
