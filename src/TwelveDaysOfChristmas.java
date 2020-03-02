public class TwelveDaysOfChristmas {
    public static String getVerse(int i) {
        if(i < 1 || i > 12){
            throw new IllegalArgumentException("Elves are angry that you don't remember this song.");
        }
        return "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.";
    }
}
