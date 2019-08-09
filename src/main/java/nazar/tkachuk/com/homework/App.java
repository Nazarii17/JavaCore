package nazar.tkachuk.com.homework;

import java.util.Scanner;

// Changed the case. For me was much more interesting to learn basic structure + I used the lower/upper case.
// Literally now it doesn't matter what you're gonna enter. If there's a correct month, the APP will show you a season + temperature.
// You'll get a result to display. The main feature - you'll see a month from capital letter, no matter what you'll
// enter if month is correct.

public class App {
    public enum Season {
        WINTER("Cold"), SPRING("Warm"), SUMMER("Hot"), AUTUMN("Warm"),
        UNKNOWN("Doesn't have");

        private String weather;

        Season(String weather) {
            this.weather = weather;
        }

        public String getWeather() {
            return weather;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Season season;

        System.out.println("To start enter \"GO\"\nTo finish enter \"END\"");
        String anyChoice = input.nextLine().toLowerCase();
        while (anyChoice.equals("go")) {

            System.out.println("Enter the month, please");
            String month = input.next().toLowerCase();

            switch (month) {

                case "december":
                case "january":
                case "february":
                    season = Season.WINTER;
                    break;
                case "marth":
                case "april":
                case "may":
                    season = Season.SPRING;
                    break;
                case "june":
                case "jule":
                case "august":
                    season = Season.SUMMER;
                    break;
                case "september":
                case "october":
                case "november":
                    season = Season.AUTUMN;
                    break;
                default:
                    System.out.println("There isn't month like this.");
                    season = Season.UNKNOWN;
            }
            System.out.println("You entered " + month.substring(0, 1).toUpperCase() + month.substring(1));
            System.out.println("The season is " + season.toString().toLowerCase());
            System.out.println("The weather is " + season.getWeather().toLowerCase());

            System.out.println("\nTo start enter \"GO\"\nTo finish enter \"END\"");
            anyChoice = input.next().toLowerCase();
        }
    }
}
