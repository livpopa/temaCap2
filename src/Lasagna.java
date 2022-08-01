public class Lasagna {



    //1. Define the expected oven time in minutes
    public static int expectedMinutesInOven() {
        return 40;
    }
    //2. Calculate the remaining oven time in minutes
    public static int remainingMinutesInOven(int minutes) {
        Lasagna lasagna = new Lasagna();
        int remainingMinutes = lasagna.expectedMinutesInOven() - minutes;
        return (remainingMinutes);

    }
    //3. Calculate the preparation time in minutes
    public static int preparationTimeInMinutes(int layers) {
        return (layers * 2);
    }
    //4. Calculate the total working time in minutes
    public static int totalTimeInMinutes(int layers, int minutesInOven) {
        return((layers*2) + minutesInOven);
    }
}
