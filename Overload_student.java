class Main {
    int id;
    String name;
    Main()
    { 
        // done 
    }
    Main(int i,String n)
    {
        id=i;
        name=n;
    }

    public static void main(String[] args) {
        Main s = new Main();
        System.out.println("\n No-argument constructor values :\n");
        System.out.println("Student id : "+s.id+ "\nStudent name : "+ s.name);
        Main s2 = new Main(10,"Jack");
        System.out.println("\n parametric constructor values :\n");
        System.out.println("Student id : "+s2.id+ "\nStudent name : "+ s2.name);
    }
}
