public class TwelveDaysOfChristmas {
    private static String[] days = {
            "first", "second", "third", "fourth", "fifth", "sixth", "seventh",
            "eighth", "ninth", "tenth", "eleventh", "Twelfth"
    };
    private static String[] gifts = {
            "a Partridge in a Pear Tree.", "two Turtle Doves",
            "three French Hens", "four Calling Birds",
            "five Golden rings", "six Geese-a-Laying",
            "seven Swans-a-Swimming", "eight Maids-a-Milking",
            "nine Ladies Dancing", "ten Lords-a-Leaping",
            "eleven Pipers Piping", "twelve Drummers Drumming",
            "and a Partridge in a Pear Tree.", "two Turtle Doves"
    };

    public static String getVerse(int verseNr) {
        if(verseNr < 1 || verseNr > 12){
            throw new IllegalArgumentException("Elves are angry that you don't remember this song.");
        }
        int i = verseNr - 1;
        StringBuilder verse = new StringBuilder(String.format("On the %s day of Christmas my true love gave to me:", days[i]));
        for (int j = i; j >= 0; j--){
            verse.append(" ");
            verse.append(gifts[i == 1 && j < 2 ? j + 12 : j] + (j == 0 || j==12 ? "" : ",") );

        }
        return verse.toString();
    }
}
