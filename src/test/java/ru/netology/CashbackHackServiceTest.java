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

    @org.junit.Test
    public void lacking0_Test() {
        org.junit.Assert.assertEquals(0, service.remain(1_000));
    }

    @org.junit.Test
    public void lacking500_Test() {
        org.junit.Assert.assertEquals(500, service.remain(500));
    }

    @org.junit.Test
    public void lacking1000_Test() {
        org.junit.Assert.assertEquals(1_000, service.remain(0));
    }

    @org.junit.jupiter.api.Test
    public void lacking0_TestJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(7_000));
    }

    @org.junit.jupiter.api.Test
    public void lacking150_TestJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(150, service.remain(3_850));
    }
}