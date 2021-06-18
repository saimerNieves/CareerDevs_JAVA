package com.company;

public class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here

        double tip =  (meal_cost /100) * tip_percent;
        double tax =  ((double)tax_percent/100) * meal_cost;
        double total_cost = Math.round(meal_cost + tip + tax);

        System.out.println((int)total_cost);
    }

}
