package solid.dip.solution;

public class PostgresDB implements Database {

    @Override
    public void saveUser(String user) {
        System.out.println("User - " + user + " user save in Postgres DB");
    }
}
