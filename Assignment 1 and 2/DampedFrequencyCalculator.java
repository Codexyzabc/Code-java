/*6. For a certain electrical circuit with an inductance L and resistance R, the damped natural
frequency is given by:

Frequency = √ [( 1 / LC ) – ( R2
/4C2 )]

It is desired to study the variations of the frequency with C (capacitance). Write a
program to calculate the frequency of difference values of C starting 0.01 to 0.1 in steps
of 0.01.*/




package assignment2;

public class DampedFrequencyCalculator {
    public static void main(String[] args) {
        double minC = 0.01;
        double maxC = 0.1;
        double step = 0.01;

        System.out.println("C\t\tFrequency");

        for (double c = minC; c <= maxC; c += step) {
            double frequency = calculateFrequency(c);
            System.out.printf("%.2f\t\t%.6f%n", c, frequency);
        }
    }

    public static double calculateFrequency(double capacitance) {
        double inductance = 0.15; // We can change the value of inductance L if needed
        double resistance = 0.25; // we can change the value of resistance R if needed

        double frequency = Math.sqrt((1.0 / (inductance * capacitance)) - ((resistance * resistance) / (4.0 * capacitance * capacitance)));

        return frequency;
    }
}

/*OUTPUT
 * 
 * C		Frequency
0.01		22.592403
0.02		17.154324
0.03		14.312970
0.04		12.526015
0.05		11.273124
0.06		10.332997
0.07		9.594234
0.08		8.993994
0.09		8.493825
0.10		8.068715
*/
