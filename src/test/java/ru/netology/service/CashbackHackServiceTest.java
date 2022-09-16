package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn900If100() {
        int actual = service.remain(100);
        int expected = 900;

        assertEquals(actual,expected);
    }


    @Test
    public void shouldReturn100If1900() {
        int actual = service.remain(1900);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldReturn1000If0() {
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual,expected);
    }


    @Test
    public void shouldReturn0If1000() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual,expected);
    }
}