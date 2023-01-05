class Main
{
    static int count=0;
    Main()
    {
        count++;
    }
    public static void main(String[] args) {
        Main o1 = new Main();
        Main o2 = new Main();
        Main o3 = new Main();
        Main o4 = new Main();
        System.out.println("Total number of objects declared are : " + count );
    }
}
