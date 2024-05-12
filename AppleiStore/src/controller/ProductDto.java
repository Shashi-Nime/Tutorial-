
package controller;

import models.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDto {
    public static List<Product>get(String qry){
        List<Product> persons = new ArrayList<>();
        try{
            ResultSet rslt = Common.get(qry);
            while (rslt.next()){

                Product product = new Product();
                product.setId(rslt.getInt("id"));
                product.setName(rslt.getString("name"));
                product.setPrice(rslt.getDouble("price"));
                product.setQuantity(rslt.getInt("quantity"));
                product.setCategory(CategoryDto.getById(rslt.getInt("category_id")));
                persons.add(product);
               
            }
        }catch (SQLException e){
            System.out.println("Can't get result as"+e.getMessage());
        }
        return persons;
    }
    
    public static String save(Product product) {
        String msg = "1";
        System.out.println(product);
        String qry = "insert into product( name,price,quantity,category_id) values( '" + product.getName() + "','" + product.getPrice() + "','" +product.getQuantity() + "','" + product.getCategory().getId()  + "');";
        msg = Common.modify(qry);
        //System.out.println(qry);
        return msg;
        
         
    }
    
    public static List<Product> getAll() {
        String qry = "select*from product";
        List list = get(qry);
        return list;
    }
    public static String update(Product product){
        String msg ="1";
        String sql = "UPDATE product set name='"+product.getName()+"',price='"+product.getPrice()+"',quantity='"+product.getQuantity()+"',category_id='"+product.getCategory().getId()+"'WHERE id="+product.getId();
       
        msg = Common.modify(sql);
        return msg;

    }
    public static String delete(Product product){
        String msg ="1";
        String sql = "Delete From product WHERE id=" +product.getId();
        msg = Common.modify(sql);
        return msg;
    }

}
