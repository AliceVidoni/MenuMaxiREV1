/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author ciro
 */
public class Menu implements Serializable{
    
    private Map<String, List<Piatto>> menu;

    public Menu() {
        menu = new TreeMap<>();
    }

    public Collection<Piatto> getPiatti(String categoria) {
        return menu.get(categoria);
    }

    public Collection<String> getCategorie() {
        return menu.keySet();
    }
    
}
