package lk.ijse.orm.hostelManagementSystem.bo.impl;

import lk.ijse.orm.hostelManagementSystem.bo.LoginBO;
import lk.ijse.orm.hostelManagementSystem.bo.SuperBO;
import lk.ijse.orm.hostelManagementSystem.dto.LoginDTO;

public class LoginBOImpl implements LoginBO {

    UserDAO userDAO = (UserDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.USER);

    LoginDTO loginDTO = new LoginDTO();

    @Override
    public boolean checkUsername(String username) {
        loginDTO.setUsername(username);
        return false;
    }

    @Override
    public boolean checkPassword(String username,String password) {

        return false;
    }
}
