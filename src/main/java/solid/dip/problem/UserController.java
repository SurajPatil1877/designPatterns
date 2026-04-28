package solid.dip.problem;


public class UserController {
    private OracleDB db;

    public UserController() {
        this.db = new OracleDB();
    }


    public void saveUser(String user) {
        db.saveUser(user);
    }

}
