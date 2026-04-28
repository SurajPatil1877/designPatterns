package solid.dip.solution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserControllerSolution {
    private Database db;


    public void saveUser(String user) {
        db.saveUser(user);
    }
}
