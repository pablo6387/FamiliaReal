package com.mycompany.familiareal;

import java.time.LocalDate;

public class FamiliaReal {

    public static void main(String[] args) {
        Miembro ancestro;
        Miembro m1 = new Miembro(LocalDate.of(1865,3,6), "George V","Mary of Teck",2);
        Miembro m2 = new Miembro(LocalDate.of(1894,2,18), "Edward VIII","",0);
        Miembro m3 = new Miembro(LocalDate.of(1895,2,26), "George VI","Elizabeth Bowes-Lyon",2);
        Miembro m4 = new Miembro(LocalDate.of(1926,7,18), "Elizabeth II","Philip Duke of Edinburgh",2);
        Miembro m5 = new Miembro(LocalDate.of(1930,7,18), "Princess Margaret","Antony Amstrong Jones",0);
        Miembro m6 = new Miembro(LocalDate.of(1948,7,18), "Prince Charles","Princess Diana",2);
        Miembro m7 = new Miembro(LocalDate.of(1950,7,18), "Princess Anne","Mark Phillips",0);        
        Miembro m8 = new Miembro(LocalDate.of(1982,7,18), "Prince William","Catherine",2);
        Miembro m9 = new Miembro(LocalDate.of(1984,7,18), "Prince Henry","Meghan",0);
        Miembro m10 = new Miembro(LocalDate.of(2013,7,18), "Prince George","",0);
        Miembro m11 = new Miembro(LocalDate.of(2015,7,18), "Princess Charlotte","",0);
                
        
        
        ArbolGenealogico windsor =new ArbolGenealogico();
        
        windsor.insertar(m1);
        windsor.insertar(m2);
        windsor.insertar(m3);
        windsor.insertar(m4);
        windsor.insertar(m5);
        windsor.insertar(m6);
        windsor.insertar(m7);
        windsor.insertar(m8);
        windsor.insertar(m9);
        windsor.insertar(m10);
        windsor.insertar(m11);
        
        
        ancestro=windsor.buscarAntecesor(m10);
        
        System.out.println(ancestro.getNombre());
    }
}
