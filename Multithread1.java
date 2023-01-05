class MultithreadingDemo extends Thread
{
    public void run()
    {
        try
        {
           //Displaying the thread that is running
            System.out.println("Thread "+ Thread.currentThread().getId()+" is running"+"\n");
        }
        catch (Exception e)
        {
            //Throwing an exception
            System.out.println("Exception is Caught");
        }
    }
}
//Main class
public class Multithread1
{
    public static void main(String[] args)
    {
        int n=8; //Number of threads
        for (int i=0; i<n; i++)
        {
            MultithreadingDemo Multi = new MultithreadingDemo();
            Multi.start();
        }
    }
}