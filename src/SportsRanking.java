/*
   Sports Ranking:

    Objective: Maintain a leaderboard of top 5 sports teams and display the top team.

    Steps:

    Declare a 1D array to hold the names of 5 teams.
    Populate the array with names based on their ranking.
    To find the top-ranked team, access the element at index 0.
    Print the name of the top-ranked team.
*/
public class SportsRanking {
    public static void main(String[] args) {

        String[] teams = new String[5];

        teams[0] = "Team A";
        teams[1] = "Team B";
        teams[2] = "Team C";
        teams[3] = "Team D";
        teams[4] = "Team E";

        String topRankedTeam = teams[0];
        String secondRankedTeam = teams[1];

        System.out.println("the top-ranked teams " + topRankedTeam + secondRankedTeam);
        System.out.println("the top-ranked team is: " + topRankedTeam + "\n " + "The second ranked team is: " + secondRankedTeam);

    }
}
