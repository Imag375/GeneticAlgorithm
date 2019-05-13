package ru.mirea;

import java.util.Random;

public class Chromosome {
    float x;
    float y;
    float z;

    Chromosome() {
        Random rand = new Random();
        this.x = rand.nextFloat();
        this.y = rand.nextFloat();
        this.z = rand.nextFloat();
    }

    public float getF() {
        return 1.1f * y * y + 2.2f * x * x + 2.5f * z * z - 1.3f * y * z - 2.8f * y - 1.6f * x;
    }
}
