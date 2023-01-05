class Main
{
    int id;
    String name;
    //creating a parameterized Constructor
    Main(int i, String n)
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
        Main s1 = new Main(111,"Jack");
        Main s2 = new Main(112,"Sparrow");
        s1.display();
        s2.display();
    }
}
