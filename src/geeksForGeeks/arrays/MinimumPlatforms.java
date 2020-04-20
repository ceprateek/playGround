package geeksForGeeks.arrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MinimumPlatforms {
    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int j = 0; j < input; j++) {
            int size = sc.nextInt();
            int arrival[] = new int[size];
            for (int i = 0; i < size; i++) {
                arrival[i] = sc.nextInt();

            }
            int depart[] = new int[size];
            for (int i = 0; i < size; i++) {
                depart[i] = sc.nextInt();

            }
            minPlatforms(arrival,depart);
        }
    }

    public static void minPlatforms(int[] arrival, int[] departure){
        TreeMap<Integer,Integer> sortedEventList = new TreeMap<>();
        for (int i=0;i<arrival.length;i++){
            sortedEventList.put(arrival[i],1);
        }
        for (int i=0;i<departure.length;i++){
            sortedEventList.put(departure[i],-1);
        }
        int maxPlatforms = 0;
        int platforms = 0;
        for (Map.Entry<Integer,Integer> event : sortedEventList.entrySet()){
            platforms = platforms + event.getValue();
            maxPlatforms = Math.max(platforms,maxPlatforms);
        }
        System.out.println(maxPlatforms);
    }
}
