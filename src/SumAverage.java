public class SumAverage {

    public static int sum(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double average(int lowerBound, int upperBound) {
        int count = 0;
        int sum = 0;
        int i = lowerBound;
        while (i <= upperBound) {
            sum += i;
            i++;
            count++;
        }
        double average = 0.0;
        if (count > 0) {
            average = (double) sum / count;
        }
        return average;
    }

    public static double average(int[] numbers) {
        int sum = 0;
        int i = 0;
        do {
            sum += numbers[i];
            i++;
        } while (i < numbers.length);
        return (double) sum / numbers.length;
    }
}