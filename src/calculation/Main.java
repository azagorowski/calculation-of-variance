package calculation;

// [EN] Calculation of variance from a set of numbers.
// [PL] Obliczenia wariancji dla zestawu liczb.

public class Main {
    public static void main(String args[]) {

        // Elementy tablicy (przykladowe liczby):
        double[] array = {1.1,2.2,3.5,5.0,4.7,5.5,8.3,9.5,9.6,10.0,11.0};

        double sum = 0.0;
        double average = 0.0;
        double sumOfDifferences = 0.0;
        int N = array.length;
        double variance;

        // Suma elementów w tablicy
        for (int i = 0; i < N; i++) {
            sum+=array[i];
        }

        // Obliczanie średniej
        average = sum/N;

        // Suma kwadratów różnic oraz średniej
        for (int i = 0; i < N; i++) {
            sumOfDifferences+=(array[i]-average)*(array[i]-average);
        }

        // Obliczanie wariancji
        variance = sumOfDifferences/(N-1);

        // Wyniki
        System.out.println("[EN]");
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);
        System.out.println("Suma of differences: "+sumOfDifferences);
        System.out.println("Variance: "+variance);
        System.out.println(" ");
        System.out.println("[PL]");
        System.out.println("Suma: "+sum);
        System.out.println("Średnia: "+average);
        System.out.println("Suma różnic: "+sumOfDifferences);
        System.out.println("Wariancja: "+variance);
    }

    // Based on Java exercises (PAW AGH postgraduate studies).
}