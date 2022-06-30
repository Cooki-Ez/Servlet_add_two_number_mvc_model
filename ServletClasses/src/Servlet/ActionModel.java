package Servlet;

public class ActionModel {
    int firstFromUser;
    int secondFromUser;

    public ActionModel(int firstFromUserN, int secondFromUserN) {
        firstFromUser = firstFromUserN;
        secondFromUser = secondFromUserN;
    }

    public ActionModel() {

    }

    int getResult(){
        return firstFromUser + secondFromUser;
    }

}
