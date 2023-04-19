package lk.ijse.orm.hostelManagementSystem.bo;


import lk.ijse.orm.hostelManagementSystem.bo.impl.LoginBOImpl;
import lk.ijse.orm.hostelManagementSystem.bo.impl.RegistrationBOImpl;
import lk.ijse.orm.hostelManagementSystem.bo.impl.RoomBOImpl;
import lk.ijse.orm.hostelManagementSystem.bo.impl.StudentBOImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){
    }
    public static BOFactory getBoFactory(){
        return (boFactory==null)? boFactory=new BOFactory() : boFactory;
    }

    public enum BOTypes{
        LOGIN,STUDENT,ROOM,REGISTRATION
    }

    //Object creation logic for BO objects
    public SuperBO getBO(BOTypes types){
        switch (types){

            case LOGIN:
                return new LoginBOImpl();
            case STUDENT:
                return new StudentBOImpl();
            case ROOM:
                return new RoomBOImpl();
            case REGISTRATION:
                return new RegistrationBOImpl();

            default:
                return null;
        }
    }
}
