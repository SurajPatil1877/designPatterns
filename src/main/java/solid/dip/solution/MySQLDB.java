package solid.dip.solution;

public class MySQLDB implements Database {
    @Override
    public void saveUser(String user) {
        System.out.println("User -" + user + " saved in My SQL DB");
    }
}
