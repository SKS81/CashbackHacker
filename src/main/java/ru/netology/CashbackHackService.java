package ru.netology;

public class CashbackHackService {
    private final int boundary = 1_000;

    public int remain(int amount) {

        for (int i = boundary; i <= amount; i += boundary) {
            if (i == amount) return 0;
        }
        int x = Math.abs(-amount);
        if (x == -amount) return x + boundary;

        return boundary - amount % boundary;
    }
}