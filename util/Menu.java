package projects.competitionApp.util;

public enum Menu {

    REGISTER(1, "Register Contestants"),
    START(2, "Game is staring"),
    LOGOUT(3, "User exits"),
    EXIT(4, "Exit system");

    private int number;
    private String message;

    Menu(int number, String message) {
        this.number = number;
        this.message = message;
    }

    @Override
    public String toString() {
        return number + " " + message;
    }
}
