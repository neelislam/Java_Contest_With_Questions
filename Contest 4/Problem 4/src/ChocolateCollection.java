/*
Tamjid is a chocolate enthusiast who loves to collect various types of delicious chocolates throughout the year. However, he has a unique rule for storing them in his container: he only wants to keep one piece of each type of chocolate to ensure he has a diverse collection. Unfortunately, Tamjid sometimes mistakenly adds more than one piece of a certain type of chocolate to his container.

Your task is to help Tamjid remove the duplicate chocolates from his container so that he can achieve his goal of having one piece of each type of chocolate.

Input Format

The first line contains an integer n, representing the number of chocolates in Tamjid's container.
The following n lines each contain a string representing the name of a chocolate.
Constraints

1 <= n <= 10^5
Output Format

The output should consist of two lines: - The first line should display the count of duplicate chocolates in Amin's container. - The second line should display the number of unique collections remaining in Amin's container after removing duplicates.

Sample Input 0

5
KitKat
Snickers
Treat
KitKat
Mars
Sample Output 0

1
4 */
import java.util.HashSet;
import java.util.Scanner;

public class ChocolateCollection {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        scanf.nextLine();
        HashSet<String> uniqueStuff = new HashSet<>();
        int duplicate =0;
        for (int i =0; i<n; i++){
            String chocolate = scanf.nextLine();
            if (!uniqueStuff.add(chocolate)){
                duplicate++;
            }
        }
        System.out.println(duplicate);
        System.out.println(uniqueStuff.size());

    }
}
