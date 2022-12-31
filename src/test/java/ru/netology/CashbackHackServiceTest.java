package ru.netology;

import org.junit.Test;
import org.junit.Assert;
public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void lacking100() {
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lacking200() {
        int expected = 200;
        int actual = service.remain(2_800);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lacking0() {
        int expected = 0;
        int actual = service.remain(1_000);
        Assert.assertEquals(expected, actual);
    }
}