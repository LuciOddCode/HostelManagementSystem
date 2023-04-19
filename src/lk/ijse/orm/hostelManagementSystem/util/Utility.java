package lk.ijse.orm.hostelManagementSystem.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Utility {



    public static Properties getProperties() {
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader
                    .getSystemClassLoader()
                    .getResourceAsStream("hibernate.properties"));
        } catch (IOException e) {
            System.out.println("Property file not found!");
            e.printStackTrace();
        }
        return properties;
    }


}
