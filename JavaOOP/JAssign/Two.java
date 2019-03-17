

public class Two {

    public static int a = 4;
    public static int b = 0;

    public static String Hello(String str) throws OneException{
        
        return str;

    }
    public static void main(String[] args)  {

        Hello("Hello");
        try {
            System.out.println("Starting try block!");
            System.out.println(a/b);
        } catch (OneException e) {
            //TODO: handle exception
            System.out.println("Entering the catch block!");
            System.out.println(e.getMessage());
            
        } catch (Exception e){
            System.out.println("Now in next catch block.");
        }

        finally{
            System.out.println("Goodbye everyone!");
        }
        

    }
}