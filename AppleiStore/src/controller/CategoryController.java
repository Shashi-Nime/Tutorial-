
package controller;

import models.Category;

import java.util.List;

public class CategoryController {
     public static List<Category> get(){

        List<Category> category = null;
        category = CategoryDto.getAll();

        return category;

}
}