package solid.dip.problem;

public class ProblemMain {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.saveUser("U1");
    }
}
