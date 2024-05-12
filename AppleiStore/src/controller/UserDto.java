
package controller;

import models.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDto {
    public static List<User>get(String qry){
        List<User> users = new ArrayList<>();
        try{
            ResultSet rslt = Common.get(qry);
            while (rslt.next()){

                User user = new User();
                user.setId(rslt.getInt("id"));
                user.setName(rslt.getString("user_name"));
                user.setPassword(rslt.getString("password"));
                user.setUserType(UserTypeDto.getById(rslt.getInt("usertype_id")));
                users.add(user);
                //System.out.println(qry);
            }
        }catch (SQLException e){
            System.out.println("Can't get result as"+e.getMessage());
        }
        return  users;
    }
    
    public static String save(User user) {
        String msg = "1";
        System.out.println(user);
        String qry = "insert into user( user_name,password,usertype_id) values( '" + user.getName() + "','" + user.getPassword() + "','"  + user.getUserType().getId()  + "');";
        msg = Common.modify(qry);
        return msg;
    }
    
    public static List<User> getAll() {
        String qry = "select*from user";
        List list = get(qry);
        return list;
    }
    public static String update(User user){
        String msg ="1";
        String sql = "UPDATE user set user_name='"+user.getName()+"',password='"+user.getPassword()+"',usertype_id='"+user.getUserType().getId()+"'WHERE id="+user.getId();
        msg = Common.modify(sql);
        return msg;

    }
    public static String delete(User user){
        String msg ="1";
        String sql = "Delete From user WHERE id=" +user.getId();
        msg = Common.modify(sql);
        return msg;
    }
}
