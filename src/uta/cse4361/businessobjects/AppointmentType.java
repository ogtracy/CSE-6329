/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uta.cse4361.businessobjects;

/**
 *
 * @author oguni
 */
public class AppointmentType {
    int id;
    String name;
    
    public AppointmentType(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public int getID(){
        return id;
    }
}
