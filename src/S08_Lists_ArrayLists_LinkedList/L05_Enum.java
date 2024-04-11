package S08_Lists_ArrayLists_LinkedList;

import java.util.Random;

public class L05_Enum {

    public static void main(String[] args) {
        DaysOfTheWeek weekDay = DaysOfTheWeek.THURSDAY;
        System.out.println(weekDay);
        System.out.println(weekDay.ordinal());

        for (int i = 0; i < 10; i++) {

            DaysOfTheWeek day = getRandomDay();
            System.out.printf("Name is %s, Ordinal Value = %d%n", day.name(), day.ordinal());

        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            DaysOfTheWeek day = getRandomDay();
//            System.out.printf("Name is %s, Ordinal Value = %d%n", day.name(), day.ordinal());
            switchDayOfWeek(day);

        }

        System.out.println();

        for (Topping topping : Topping.values()){
            System.out.println(topping.name() + " : " + topping.getPrice());
        }

    }

    public static void switchDayOfWeek(DaysOfTheWeek weekDay){
        int weekDayInt = weekDay.ordinal() + 1;

        switch (weekDay){
            case MONDAY -> System.out.println("Monday is Day " +weekDayInt);
            case TUESDAY -> System.out.println("Tuesday is Day " +weekDayInt);
            case WEDNESDAY -> System.out.println("Wednesday is Day " +weekDayInt);
//            case THURSDAY -> System.out.println("Thursday is Day " +weekDayInt);
//            case FRIDAY -> System.out.println("Friday is Day " +weekDayInt);
//            case SATURDAY -> System.out.println("Saturday is Day " +weekDayInt);
//            case SUNDAY -> System.out.println("Sunday is Day " +weekDayInt);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + " is Day " + weekDayInt );
        }

    }

    public static DaysOfTheWeek getRandomDay(){
        int randomInt = new Random().nextInt(7);
        var allDays = DaysOfTheWeek.values();

        return allDays[randomInt];
    }

}
