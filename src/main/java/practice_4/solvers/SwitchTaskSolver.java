package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        System.out.println(dayOfWeek(7));
        System.out.println(dayOfWeek(8));

        System.out.println(describeSeason(Season.WINTER));
        System.out.println(describeSeason(Season.SUMMER));
        System.out.println(describeSeason(Season.AUTUMN));
        System.out.println(describeSeason(Season.SPRING));
    }
    public static String dayOfWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Unknown day";
        }
        return dayOfWeek;
    }

    public static String describeSeason(Season season) {
        String description = "";
        switch (season) {
            case WINTER -> description = "Winter, cold, snowy";
            case SUMMER -> description = "Summer, hot";
            case AUTUMN -> description = "Autumn, rain";
            case SPRING -> description = "Spring, blossom";
        }
        return description;
    }
}
