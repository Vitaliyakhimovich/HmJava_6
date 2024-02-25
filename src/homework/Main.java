package homework;

import homework.core.Report.DisplayPrint;
import homework.core.User;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");

        DisplayPrint print = new DisplayPrint(user);
        print.display();
        user.save();
    }
}