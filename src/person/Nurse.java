package person;

import java.util.Date;

public class Nurse extends Employe {
    private boolean isHeadNurse;

    public Nurse() {
        this.isHeadNurse = false;
    }

    public Nurse(String firstName, String lastName, Date dateOfBirth, String userName, String password) {
        super(firstName, lastName, dateOfBirth, userName, password);
        this.isHeadNurse = false;
    }

    public boolean isHeadNurse() {
        return isHeadNurse;
    }

    public void setHeadNurse(boolean headNurse) {
        isHeadNurse = headNurse;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "isHeadNurse=" + isHeadNurse +
                '}';
    }
}
