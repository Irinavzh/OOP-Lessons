package dog;

public class User {

    private String emailUser;
    private String passwordUser;
    private String firstNameUser;
    private String lastNameUser;
    private String cellPhoneUser;

    public User(String emailUser, String passwordUser, String firstNameUser, String lastNameUser, String cellPhoneUser) {
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;
        this.firstNameUser = firstNameUser;
        this.lastNameUser = lastNameUser;
        this.cellPhoneUser = cellPhoneUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public String getFirstNameUser() {
        return firstNameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public String getCellPhoneUser() {
        return cellPhoneUser;
    }

}
