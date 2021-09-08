/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frede
 */
public class Persona {
    
    private String Cedula;
    private int Edad;
    private String Nombre;
    
    public Persona (String cedula, int edad, String nombre){
        
        this.Cedula = cedula;
        this.Edad = edad;
        this.Nombre = nombre;
    }
    
    public String getCedula(){
        
        return this.Cedula;
    }
    
    public int getEdad (){
        
        return this.Edad;
    }
    
    public String getNombre(){
        
        return this.Nombre;
    }
    
    
    
}
