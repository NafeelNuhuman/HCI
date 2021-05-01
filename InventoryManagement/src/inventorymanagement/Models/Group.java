/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement.Models;

import inventorymanagement.Controllers.HomeController;
import java.util.List;

/**
 *
 * @author User
 */
public class Group {
    
    private String name;
    private List<Item> List;

    public Group(String name, List<Item> List) {
        this.name = name;
        this.List = List;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getList() {
        return List;
    }

    public void setList(List<Item> List) {
        this.List = List;
    }

    
        
}
