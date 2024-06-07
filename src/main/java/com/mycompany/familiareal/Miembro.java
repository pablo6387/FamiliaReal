
package com.mycompany.familiareal;

import java.time.LocalDate;

public class Miembro {
    private LocalDate nacimiento;
    private String nombre;
    private String conyuge;
    private int hijos;
    public Miembro izq;
    public Miembro der;

    public Miembro(LocalDate nacimiento, String nombre, String conyuge, int hijos) {
        this.nacimiento = nacimiento;
        this.nombre = nombre;
        this.conyuge = conyuge;
        this.hijos = hijos;
    }

    
    public Miembro() {
    }
    

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConyuge() {
        return conyuge;
    }

    public void setConyuge(String conyuge) {
        this.conyuge = conyuge;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }    
}

