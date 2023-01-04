package ru.netology;

public class CashbackHackService {
    private final int boundary = 1_000;

    public int remain(int amount) {
        for (int i = 0; i <= amount; i += 1_000) {
            if (i == amount && i != 0) return 0;
        }
        return boundary - amount % boundary;
    }
}