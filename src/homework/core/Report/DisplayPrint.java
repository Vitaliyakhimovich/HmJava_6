package homework.core.Report;

import homework.core.User;

public class DisplayPrint implements Displayable {
    private final User user;

    public DisplayPrint(User user) {
        this.user = user;
    }

    @Override
    public void display() {
        System.out.println("Report for user: " + user.getName());
    }
}
