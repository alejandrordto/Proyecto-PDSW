
package com.BoomECI.entidades;

import java.util.List;

public class Materia {
    
    private String nemonico;
    private String nombre;
    private int creditos;
    List<String> prerequisitos;
    List<String> corequisitos;
    
    
    public Materia(){}

    public Materia(String nemonico, String nombre, int creditos, List<String> prerequisitos, List<String> corequisitos ){
        this.nemonico = nemonico;
        this.nombre = nombre;
        this.creditos = creditos;
        this.prerequisitos = prerequisitos;
        this.corequisitos = corequisitos;
    }
    public Materia(String nemonico, String nombre, int creditos){
        this.nemonico = nemonico;
        this.nombre = nombre;
        this.creditos = creditos;
    }
    public Materia (String nemonico){
        this.nemonico=nemonico;
    }
    
    
    public String getNemonico() {
        return nemonico;
    }

    public void setNemonico(String nemonico) {
        this.nemonico = nemonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public List<String> getPrerequisitos() {
        return prerequisitos;
    }

    public void setPrerequisitos(List<String> prerequisitos) {
        this.prerequisitos = prerequisitos;
    }

    public List<String> getCorequisitos() {
        return corequisitos;
    }

    public void setCorequisitos(List<String> corequisitos) {
        this.corequisitos = corequisitos;
    }
    public Boolean equals (Materia par) {
        if(this.nemonico.equals(par.getNemonico())){            
            return true;
        }
        return false;
    }
    
    


    
}
