import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwelveDaysOfChristmasTest {
    private static String[] verses;
    @BeforeClass
    public static void prepareData(){
        verses =
        (   "On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.\n" +
            "On the second day of Christmas my true love gave to me: two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "On the third day of Christmas my true love gave to me: three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "On the fourth day of Christmas my true love gave to me: four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "On the fifth day of Christmas my true love gave to me: five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n" +
            "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.")
        .split("\n");
    }

    @Test
    public void get_first_verse(){
        assertEquals(verses[0], TwelveDaysOfChristmas.getVerse(1));
    }

    @Test
    public void get_second_verse(){
        assertEquals(verses[1], TwelveDaysOfChristmas.getVerse(2));
    }

    @Test
    public void get_third_verse(){
        assertEquals(verses[2], TwelveDaysOfChristmas.getVerse(3));
    }

    @Ignore
    @Test
    public void get_fourth_verse(){
        assertEquals(verses[3], TwelveDaysOfChristmas.getVerse(4));
    }

    @Ignore
    @Test
    public void get_fifth_verse(){
        assertEquals(verses[4], TwelveDaysOfChristmas.getVerse(5));
    }

    @Ignore
    @Test
    public void get_sixth_verse(){
        assertEquals(verses[5], TwelveDaysOfChristmas.getVerse(6));
    }

    @Ignore
    @Test
    public void get_seventh_verse(){
        assertEquals(verses[6], TwelveDaysOfChristmas.getVerse(7));
    }

    @Ignore
    @Test
    public void get_eighth_verse(){
        assertEquals(verses[7], TwelveDaysOfChristmas.getVerse(8));
    }

    @Ignore
    @Test
    public void get_ninth_verse(){
        assertEquals(verses[8], TwelveDaysOfChristmas.getVerse(9));
    }

    @Ignore
    @Test
    public void get_tenth_verse(){
        assertEquals(verses[9], TwelveDaysOfChristmas.getVerse(10));
    }

    @Ignore
    @Test
    public void get_eleventh_verse(){
        assertEquals(verses[10], TwelveDaysOfChristmas.getVerse(11));
    }

    @Ignore
    @Test
    public void get_twelfth_verse(){
        assertEquals(verses[11], TwelveDaysOfChristmas.getVerse(12));
    }

    @Test(expected = IllegalArgumentException.class)
    public void get_incorrect_verse(){
        assertEquals("On the first day of Christmas my true love gave to me: a Partridge in a Pear Tree.", TwelveDaysOfChristmas.getVerse(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void get_verse_above_limit(){
        assertEquals("", TwelveDaysOfChristmas.getVerse(13));
    }

}