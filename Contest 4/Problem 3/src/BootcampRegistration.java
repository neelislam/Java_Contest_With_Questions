/*The IEEE Computer Society LU SB Chapter at the university is doing very well, known for its engaging workshops, seminars, bootcamps, research courses, and social activities. The chapter is launching a course titled "Bootcamp on Basic Programming, Data Structures, and Algorithms," which will span 2 months. This course offers practical knowledge that helps with industry jobs. Additionally, after every class, there will be a programming contest designed to clarify students' confusion and enhance their critical thinking abilities. With limited seats available, priority will be given to students who register first, following the "First Come, First Served" algorithm.

Your task is to display the names of students who cannot continue with this course. Keep in mind that the names of students who registered last should be displayed first, followed by the names of the remaining students in the order of their registration.

Input Format

The input consists of:

Two integers, N and K, separated by a space. N represents the total number of students on the registration list, while K indicates the number of students who can continue with the course.
N lines follow, each containing the name of a student. Names consist of lowercase and uppercase English letters, digits, and spaces. Each name has at most 100 characters.
Constraints

1 ≤ N ≤ 1000
1 ≤ K < N
Output Format

A list of names, one name per line, representing the students who cannot continue with the course. The names should be listed in the order of their registration, starting with the student who registered last.
Sample Input 0

7 5
Mir
Mahbub
Apon
Azhar
Kaissa
Mizan
Adnan
Sample Output 0

Adnan
Mizan
Explanation 0

In this example, there are 7 students in total, and only 3 can continue with the course. Therefore, Adnan and Mizan cannot continue with the course. Since Adnan registered last, his name appears first in the output list, followed by Mizan.

Sample Input 1

9 6
Bushra
Fardin
Abidur
Anindita
Shajidul
Ashraful
Mithila
Mahdi
Mehrab
Sample Output 1

Mehrab
Mahdi
Mithila*/
import java.util.Scanner;
import java.util.Stack;

public class BootcampRegistration {
    public static void main(String[] args) {
        Scanner scanf= new Scanner(System.in);
        int N = scanf.nextInt();
        int K = scanf.nextInt();
        scanf.nextLine();
        Stack<String> stack = new Stack<>(); //continue korte parbena jara
        String[] students = new String[N]; // shb student name
        for (int i =0; i<N; i++) {
            students[i] = scanf.nextLine();
        }
        for (int i =K; i<N; i++) {
            stack.push(students[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); //last er student ashbe first e
        }
    }
}
