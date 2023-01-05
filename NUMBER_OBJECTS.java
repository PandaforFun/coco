public class NUMBER_OBJECTS
{
    static int count=0;
    NUMBER_OBJECTS()
    {
        count++;
    }
    public static void main(String[] args) {
        NUMBER_OBJECTS o1 = new NUMBER_OBJECTS();
        NUMBER_OBJECTS o2 = new NUMBER_OBJECTS();
        NUMBER_OBJECTS o3 = new NUMBER_OBJECTS();
        NUMBER_OBJECTS o4 = new NUMBER_OBJECTS();
        System.out.println("Total number of objects declared are : " + count );
    }
}

