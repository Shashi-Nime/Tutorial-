
package controller;

import java.util.List;
import models.UserType;
public class UserTypeController {
    public static List<UserType> get(){

        List<UserType> usertype = null;
        usertype = UserTypeDto.getAll();

        return usertype;

}
}
