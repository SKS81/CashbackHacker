package ru.netology;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void lacking1_000() {
        int actual = service.remain(0);
        int expected = 1_000;

        assertEquals(actual, expected);
    }

    @Test
    public void lacking200() {
        int actual = service.remain(800);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void lacking100() {
        int actual = service.remain(1_900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void lacking0() {
        int actual = service.remain(2_000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}