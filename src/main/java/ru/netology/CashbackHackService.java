package ru.netology;

public class CashbackHackService {
    private final int boundary = 1_000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}