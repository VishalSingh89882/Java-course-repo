package Arrays;

public class FindChad {

    public static void main(String[] args) {
        String[] array = {"Bob","Jone","Jack","Ryan","Chad"};
        boolean  chadFound = false;

        for (int i=0; i<array.length; i++)
        {
            if (array[i].equals("Chad"))
            {
                chadFound = true;
            }
        }
        if (chadFound)
        {
            System.out.println("Chad is found");
        }
        else
        {
            System.out.println("Chad is not found ");
        }
    }
}
