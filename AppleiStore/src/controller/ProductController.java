
package controller;

import models.Product;
import java.util.Hashtable;
import java.util.List;

public class ProductController {
    
    public static List<Product> get(Hashtable<String, Object> ht){
        List<Product> products = null;
        if(ht == null){
            products = ProductDto.getAll();
            System.out.println(products);
        }else {
            
}
        return products;
    }
    
    public static String post(Product product) {

        String msg = "";
        String err = "";

        if (err.isEmpty()) {

            String dbmsg = ProductDto.save(product);
            if (dbmsg.equals("1"))
                msg = "1";
            else
                msg = "DB error : \n" + dbmsg;

        } else {
            msg = "Data Errors : \n" + err;
        }

        return msg;

    }
    


public static String put(Product product){
        String msg = "";
        String err = "";

        if (err.isEmpty()) {

            String dbmsg = ProductDto.update(product);
            if (dbmsg.equals("1"))
                msg = "1";
            else
                msg = "DB error : \n" + dbmsg;

        } else {
            msg = "Data Errors : \n" + err;
        }

        return msg;
    }

    public static String delete(Product product){
        String msg = "";
        String err = "";
        if (err.isEmpty()) {

            String dbmsg = ProductDto.delete(product);
            if (dbmsg.equals("1"))
                msg = "1";
            else
                msg = "DB error : \n" + dbmsg;

        } else {
            msg = "Data Errors : \n" + err;
        }

        return msg;
    }
        
}

