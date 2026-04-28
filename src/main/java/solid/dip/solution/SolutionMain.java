package solid.dip.solution;

public class SolutionMain {
    public static void main(String[] args) {
        Database postgresDB = new PostgresDB();
        UserControllerSolution userControllerSolution = new UserControllerSolution(postgresDB);
        userControllerSolution.saveUser("U1");


        UserControllerSolution userControllerSolution1 = new UserControllerSolution(new MySQLDB());
        userControllerSolution1.saveUser("U2");
    }
}
