package lk.ijse.orm.hostelManagementSystem.bo;

public interface LoginBO extends SuperBO {
    boolean checkUsername(String username);
    boolean checkPassword(String username, String password);
}
