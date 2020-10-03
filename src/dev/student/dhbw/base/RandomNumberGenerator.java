package dev.student.dhbw.base;

import java.util.Random;


public class RandomNumberGenerator
{

    private RandomNumberGenerator()
    {
    }

    /**
     * This method generates a random number between certain bounds including those
     * boundries. Every input for a minimum and maximum number is allowed. Even
     * negative and/or positive numbers, but the minimum number should be lower than
     * the maximum number.
     * 
     * @param minimum
     *            The minimum number which should be occuring.
     * @param maximum
     *            The maximum number which should be occuring.
     * @return Returns a random number between those bounds.
     */
    public static int generateRandomNumberInRange(int minimum, int maximum)
    {
        Random rand = new Random();

        return rand.nextInt((maximum - minimum) + 1) + minimum;
    }

    /**
     * This method generates a random number between certain bounds including those
     * boundries. Every input for a minimum and maximum number is allowed. Even
     * negative and/or positive numbers, but the minimum number should be lower than
     * the maximum number.
     * 
     * @param minimum
     *            The minimum number which should be occuring.
     * @param maximum
     *            The maximum number which should be occuring.
     * @return Returns a random number between those bounds.
     */
    public static double generateRandomNumberInRange(double minimum, double maximum)
    {
        Random rand = new Random();

        return minimum + (maximum - minimum) * rand.nextDouble();
    }

    /**
     * This method generates a random number between certain bounds including those
     * boundries. Every input for a minimum and maximum number is allowed. Even
     * negative and/or positive numbers, but the minimum number should be lower than
     * the maximum number.
     * 
     * @param minimum
     *            The minimum number which should be occuring.
     * @param maximum
     *            The maximum number which should be occuring.
     * @return Returns a random number between those bounds.
     */
    public static double generateRandomNumberInRange(float minimum, float maximum)
    {
        Random rand = new Random();

        return minimum + (maximum - minimum) * rand.nextFloat();
    }

    /**
     * This method generates a random number between certain bounds including those
     * boundries. Every input for a minimum and maximum number is allowed. Even
     * negative and/or positive numbers, but the minimum number should be lower than
     * the maximum number.
     * 
     * @param minimum
     *            The minimum number which should be occuring.
     * @param maximum
     *            The maximum number which should be occuring.
     * @return Returns a random number between those bounds.
     */
    public static double generateRandomNumberInRange(long minimum, long maximum)
    {
        Random rand = new Random();

        return minimum + (maximum - minimum) * rand.nextLong();
    }

    /**
     * This method generates a random boolean value.
     * 
     * @return Returns a random boolean value.
     */
    public static boolean generateRandomBoolean()
    {
        Random rand = new Random();

        return rand.nextBoolean();
    }

}
