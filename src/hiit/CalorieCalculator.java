package hiit;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CalorieCalculator {

    public static void main(String[] args) {
        deeptiCalories();
        prateekCalculator();
        //downloadImages();
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
        int heartRate = 145;
        int weight = 193;
        int timeInMins = 46;
        double calories =  ((0.2017 * age) + (0.6309 * heartRate) - (0.09036 * weight) - 55.0969) * timeInMins / 4.184;
        System.out.println("Prateek Burned: " +  calories);
    }

    public static void downloadImages(){
        int start = 62;
        int end = 85;

        while (start<=end) {
            String imageUrl = "https://az415828.vo.msecnd.net/pictures/11/609/11609217/lowres/5015038"+start+".jpg";
            try (InputStream in = new URL(imageUrl).openStream()) {
                Files.copy(in, Paths.get("/Users/prategar/Downloads/pic-session/"+start+".jpg"));
                start++;
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
