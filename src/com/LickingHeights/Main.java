package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    public static void drakeEquation(){
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */

int N;
int rStar;
double f_p;
int numberOfExoplanets;
double f_l;
double f_i;
double f_c;
int L;

Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the rStar value");
rStar = keyboard.nextInt();
System.out.println("Enter the f_p value (fraction of those stars that have planets)");
f_p = keyboard.nextDouble();
System.out.println("Enter the Number of Exo Planets(Number of planets able to support life");
numberOfExoplanets = keyboard.nextInt();
System.out.println("Enter the f_l value(fraction of exoplanets where life evolves");
f_l = keyboard.nextDouble();
System.out.println("Enter the f_i value(fraction of life that develops intelligence)");
f_i = keyboard.nextDouble();
System.out.println("Enter the f_c value(fraction that develops detectable communications)");
f_c = keyboard.nextDouble();
System.out.println("Enter the L value(Longevity for communication");
L = keyboard.nextInt();



N = rStar * f_p * numberOfExoplanets * f_l * f_i * f_c *L;

System.out.println("The number of intelligent species that are out there \n" +
        "that can communicate with us is");



    }

}
