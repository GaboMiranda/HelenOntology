/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helenontology;

/**
 *
 * @author andres
 */
public class proyecto {
    private String id;
    private String name;
    private String is_a;

    public proyecto() {
        id = "";
        name = "";
        is_a = "";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIs_a() {
        return is_a;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIs_a(String is_a) {
        this.is_a = is_a;
    }
    
    
    
}
