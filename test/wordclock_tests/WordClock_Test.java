package wordclock_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

import wordclock.WordClock;

public class WordClock_Test {

    private WordClock testObject;

    @BeforeAll
    public static void Setup(){

    }

    @BeforeEach
    public void SetUp_Each(){
        testObject = new WordClock();
    }

    @Test
    public void Call_TimeToWordsWithTime_ReturnsWordList(){
        Date date = new Date(2018, 12, 10, 13, 36);
        List<String> expected = new ArrayList<>(){{
            add("Es");
            add("Isch");
            add("Füf");
            add("Ab");
            add("Haubi");
            add("Zwöi");
        }};

        assertEquals(expected, testObject.TimeToWords(date));
    }
}
