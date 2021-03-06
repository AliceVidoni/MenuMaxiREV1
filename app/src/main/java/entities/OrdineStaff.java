/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ciro
 */
public class OrdineStaff implements Serializable {
   private static final long serialVersionUID = 1L;
    
   private int id;
   private String tavolo;
   private List<PiattoEffettivo> piatti;
   private Integer totaleCent;

    public OrdineStaff(String tavolo, List<PiattoEffettivo> piatti, Integer TotaleCent) {
        this.tavolo = tavolo;
        this.piatti = piatti;
        this.totaleCent = TotaleCent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTavolo() {
        return tavolo;
    }

    public void setTavolo(String tavolo) {
        this.tavolo = tavolo;
    }

    public List<PiattoEffettivo> getPiatti() {
        return piatti;
    }

    public void setPiatti(List<PiattoEffettivo> piatti) {
        this.piatti = piatti;
    }
    
    public void addPiatti(List<PiattoEffettivo> piatti) {
        this.piatti.addAll(piatti);
    }

    public Integer getTotaleCent() {
        return totaleCent;
    }

    public void setTotaleCent(Integer totaleCent) {
        this.totaleCent = totaleCent;
    }
    
    public void addTotaleCent(Integer totaleCent) {
        this.totaleCent += totaleCent;
    }
    
    public String getPrezzoString() {
        String price = Integer.toString(this.totaleCent);
        int size = price.length();
        switch (size) {
            case 1:
                return "0,0" + price;
            case 2:
                return "0," + price;
            default:
                return price.substring(0, size-2)+","+price.substring(size-2);
        }
    }
   
}
