class CIRCLE
{
    int x=0,y=0;
    float radius;
    public void display()
    {
        System.out.println("coordinate of the centre is : ("+ x +","+ y+")");
        System.out.println("Radius of the circle is : " + radius );
    }
}

class Main
{
    public static void main(String[] args) {
        CIRCLE c1 = new CIRCLE();
        c1.x= 5;
        c1.y= 7;
        c1.radius= 5.5f;
        c1.display();
    }
}
