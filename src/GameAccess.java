/*
/*
    Online Game Access

    Objective: Check if a user can access a specific level in an online game.

    A user wants to access a special level in a game.
    The requirements are that the user must either be a VIP member or have played the game for
    more than 100 hours.

    The user provides their details:

    boolean isVIP = false;
    int gameHoursPlayed = 105;

    (Both values can be changed for testing)

    Determine if the user can access the special level.
    if VIP member or hoursPlayed is greater than 100
    Print out if the user has access or not.
*/


public class GameAccess {
    public static void main(String[] args) {
        boolean isVIP = false;
        int gameHoursPlayed = 105;

        if (isVIP || gameHoursPlayed > 100) {
            System.out.println("The user has access.");
        } else {
            System.out.println("The user does not have access");
        }
    }
}
