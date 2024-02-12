/*8. An election is contested by 5 candidates. The candidates are numbered 1-5 and the voting
is done by marking the candidate number on the ballot paper. Write a program to read the

ballots and count the votes casts for each candidate using an array variable count. In case,
a number read is outside the range 1 – 5, the ballot should be considered as a ‘spoilt ballot’
and the program should also count the number of spoilt ballot.*/



package assignment2;

import java.util.Scanner;

public class ElectionVoteCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] count = new int[6]; // Index 0 is unused, 1-5 for candidates

        System.out.println("Enter the votes (1-5) or -1 to exit:");
        
        int vote;
        int spoiltBallots = 0;
        
        while (true) {
            vote = scanner.nextInt();
            if (vote == -1) {
                break; // Exit loop when -1 is entered
            }
            
            if (vote >= 1 && vote <= 5) {
                count[vote]++; // Count valid votes for each candidate
            } else {
                spoiltBallots++; // Count spoilt ballots
            }
        }
        
        System.out.println("Vote Counts:");
        for (int candidate = 1; candidate <= 5; candidate++) {
            System.out.println("Candidate " + candidate + ": " + count[candidate]);
        }
        
        System.out.println("Spoilt Ballots: " + spoiltBallots);
        
        scanner.close();
    }
}

/*OUTPUT

Enter the votes (1-5) or -1 to exit:
4
6
9
4
6
-1
Vote Counts:
Candidate 1: 0
Candidate 2: 0
Candidate 3: 0
Candidate 4: 2
Candidate 5: 0
Spoilt Ballots: 3
*/