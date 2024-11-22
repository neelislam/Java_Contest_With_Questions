/*Sneha is not only a diligent student but also a talented singer. Singing brings her immense joy, and she loves to indulge in it regularly. Each morning, Sneha picks up several tokens from a container, which determines how many songs she will sing that day. She always seeks out interesting activities to engage in.

However, the container holding the tokens contains numbers from 1 to 9, and Sneha has a dislike for the number 3. If she happens to pick a token with the number 3, she refrains from singing on that particular day. Your task is to help Sneha remove all tokens with the number 3 from the container so that she can sing songs every day without any hindrance.

Input Format

The input consists of a single line containing space-separated integers representing the tokens in the container.
Constraints

The number of tokens can be 1 to 100,000.

Output Format

Output a single line containing the remaining tokens in the container after removing all tokens with the number 3.
Sample Input 0

3 1 2 3 4 5 3 6 7 8 3 9
Sample Output 0

1 2 4 5 6 7 8 9
Sample Input 1

3 1 2 3 4 5 3 6 7 8 3 9 3 2 2 3 1 3 4 9 9 8
Sample Output 1

1 2 4 5 6 7 8 9 2 2 1 4 9 9 8*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SnehaSongs {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        String input = scanf.nextLine();
        String[] tokens = input.split(" ");
        List<Integer> not_dislike = new ArrayList<>();
        for (String token : tokens) {
            int number = Integer.parseInt(token);
            if (number != 3) {
                not_dislike.add(number);
            }
        }
        for (int i = 0; i < not_dislike.size(); i++) {
            System.out.print(not_dislike.get(i));
            if (i < not_dislike.size() - 1) {
                System.out.print(" ");
            }
        }

    }
}
