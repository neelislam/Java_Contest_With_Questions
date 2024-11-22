/*The Computer Science and Engineering (CSE) department at Leading University stands out as a beacon of excellence, known for its exceptional performance in academics and extracurricular activities. The strong bond between students and teachers has fostered an environment conducive to success in various domains, including academic studies, research, programming contests, sports, and so on. Notably, the department has been excelling in research, which has positively impacted the university's reputation worldwide. Headed by Rumel M S Rahman Sir, the department is committed to nurturing a culture of research and innovation among its students and faculty members. Following this idea, Sir Rumel wants to create a place for students who want to do research. To find out how many students are interested, the department will ask everyone in a survey.

Your task is to help the department count how many students are interested in joining the research platform.

Input Format

The input consists of: - An integer N (1 ≤ N ≤ 10^5) representing the total number of students in the CSE department. - N integers separated by spaces, each indicating the preference of a student regarding joining the research platform. The i-th integer (0 ≤ i < N) is equal to 1 if the i-th student is interested in joining the research platform, and 0 otherwise.

Constraints

1<= N <= 5000
Output Format

A single integer representing the count of students interested in joining the research platform.
Sample Input 0

5
1 0 1 1 0
Sample Output 0

3*/





import java.util.Scanner;
public class ResearchInterest {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int N = scanf.nextInt();
        int interested = 0;
        for (int i=0;i< N; i++) {
            int match= scanf.nextInt();
            if (match ==1) {
                interested++;
            }
        }
        System.out.println(interested);}
}
