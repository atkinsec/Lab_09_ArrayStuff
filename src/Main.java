import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);


        int[] dataPoints = new int[100];
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++)
            dataPoints[i] = rnd.nextInt(100) + 1;

        for (int i = 0; i < dataPoints.length; i++)
            System.out.print(dataPoints[i] + " | ");

        for (int i = 0; i < dataPoints.length; i++)
            sum += dataPoints[i];

        int avg = sum / dataPoints.length;

        System.out.println("\nThe sum for the array is " + sum);
        System.out.println("The average for the array is " + getAverageInt(dataPoints));

        int num = SafeInput.getRangedInt(in,"Enter a Number", 1, 100);

        boolean found = false;
        int timesFound = 0;

        for (int t = 0; t < dataPoints.length; t++)
        {
            if (dataPoints[t] == num)
            {
                timesFound++;
                found = true;
            }

        }
        System.out.println("Finished the search! Your number was found " + timesFound + " times.");

        if (!found)
            System.out.println("Could not find the target" + num + "in the array.");

        found = false;
        timesFound = 0;

        int target = SafeInput.getRangedInt(in,"Enter a Number", 1, 100);
        for (int t = 0; t < dataPoints.length; t++)
        {
            if (dataPoints[t] == target)
            {
                System.out.println("Found at array index " + t);
                found = true;
                break;
            }

        }
        System.out.println("Finished the search!");
        if (!found)
            System.out.println("Could not find the target" + num + "in the array.");

        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int j=0; j < dataPoints.length; j++)
        {
            if(dataPoints[j] < min)
                min = dataPoints[j];
            if(dataPoints[j] > max)
                max = dataPoints[j];
        }
        System.out.println("The minimum of the dataset is " + min);
        System.out.println("The maximum of the dataset is " + max);



    }
    public static double getAverageInt(int dataPoints[])
    {
        double sum = 0.0;
        double avg = 0;

        for (int i=0; i < dataPoints.length; i++)
            sum += dataPoints[i];

        avg = sum / dataPoints.length;
        return avg;
    }

}