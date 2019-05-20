package hiit;

public class CalorieCalculator {

    public static void main(String[] args) {
        deeptiCalories();
        prateekCalculator();
    }

    public static void deeptiCalories(){
        int age = 32;
        int heartRate = 120;
        int weight = 201;
        int timeInMins = 43;
        double calories = ((0.074 * age) + (0.4472 * heartRate) - (0.05741 * weight) - 20.4022) * timeInMins/4.184;
        System.out.println("Deepti Burned: " +  calories);
    }

    public static void prateekCalculator(){
        int age = 34;
        int heartRate = 160;
        int weight = 193;
        int timeInMins = 43;
        double calories =  ((0.2017 * age) + (0.6309 * heartRate) - (0.09036 * weight) - 55.0969) * timeInMins / 4.184;
        System.out.println("Prateek Burned: " +  calories);
    }
}
