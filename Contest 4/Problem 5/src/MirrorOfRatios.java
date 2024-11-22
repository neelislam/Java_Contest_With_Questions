/*Nadim and Dekcolnu, two gifted Hogwarts students, are summoned by Professor Victor on a mission that could shift the balance of magic forever. In the depths of the Room of Requirement, they have discovered an ancient magical artifact: the Mirror of Ratios. This mirror, a relic from the founders of Hogwarts, has the power to reveal hidden truths but only to those who find the perfect Harmonic Fraction, a fraction that resonates precisely with a mystical target value T, known only to Professor Victor.

The Mirror of Ratios reveals two enchanted parchments:

One parchment lists numerators that only Nadim can read.
The other parchment lists denominators that only Dekcolnu can decipher.
Together, they must find a fraction formed by combining one numerator and one denominator that aligns as closely as possible with the magical target T. The right fraction will reveal the Mirror’s secrets, while a wrong attempt risks shattering its magic forever. The task is further complicated by the mirror’s enchantment: a simple trial of all possible combinations is impossible, as it would take far too long in the vast Room of Requirement.

The fate of Hogwarts’s knowledge lies in Nadim and Dekcolnu’s hands. Success will grant them access to the Mirror’s hidden wisdom, but failure means the Room of Requirement… its secrets will vanish, lost to Hogwarts forever.

Input Format

The first line of the input contains three values:

n — the number of numerators.
d — the number of denominators.
T — the target value, a floating-point number.
The second line contains n space-separated integers a1, a2, …, an – the list of numerators.

The third line contains d space-separated integers b1, b2, …, bd – the list of denominators.

Constraints

(1 ≤ n ≤ 10^6)
(1 ≤ d ≤ 10^6)
(0 ≤ T ≤ 1)
(1 ≤ ai ≤ 10^9)
(1 ≤ bi ≤ 10^9)
Output Format
Output the fraction closest to T, formatted as:
“numerator/denominator”
Where the numerator is from Nadim’s list and the denominator is from Dekcolnu’s list. If multiple fractions have the same distance to T, return the fraction with the smallest numerator. If there is still a tie, return the fraction with the smallest denominator among those.

Sample Input 0

4 4 0.42
1 3 5 7
7 11 13 15
Sample Output 0

3/7*/
import java.util.Scanner;

public class MirrorOfRatios {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        // Read the number of numerators, denominators, and the target value T
        int n = scanf.nextInt();
        int d = scanf.nextInt();
        double T = scanf.nextDouble();

        // Read the numerators
        int[] numerators = new int[n];
        for (int i = 0; i < n; i++) {
            numerators[i] = scanf.nextInt();
        }

        // Read the denominators
        int[] denominators = new int[d];
        for (int i = 0; i < d; i++) {
            denominators[i] = scanf.nextInt();
        }

        // Variables to track the best fraction
        int bestNumerator = 0;
        int bestDenominator = 1; // Initialize with any valid denominator
        double minDifference = Double.MAX_VALUE;

        // Iterate over all combinations of numerators and denominators
        for (int num : numerators) {
            for (int denom : denominators) {
                double fraction = (double) num / denom;
                double difference = Math.abs(fraction - T);

                // Update if a closer fraction is found or if it meets the tie-breaking rules
                if (difference < minDifference ||
                        (difference == minDifference && (num < bestNumerator ||
                                (num == bestNumerator && denom < bestDenominator)))) {
                    bestNumerator = num;
                    bestDenominator = denom;
                    minDifference = difference;
                }
            }
        }

        // Output the closest fraction
        System.out.println(bestNumerator + "/" + bestDenominator);

        scanf.close();
    }
}
