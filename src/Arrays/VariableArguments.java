package Arrays;

public class VariableArguments {
    public static void main(String[] args) {

        calculateSum();
        calculateSum(3,7);
        calculateSum(4,7,8,9);
        calculateSum(new int[]{3,5,7,8});

    }

    public static void calculateSum(int ...a)
    {
        int sum = 0;
        for (int i=0; i<a.length; i++)
        {
            sum += a[i];
        }

        System.out.println("The total sum is : " + sum);
    }
}
