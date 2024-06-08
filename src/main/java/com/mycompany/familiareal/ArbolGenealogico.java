package com.mycompany.familiareal;

import java.time.LocalDate;

public class ArbolGenealogico {
    Miembro raiz;

    public ArbolGenealogico() {
        this.raiz = null;
    }
    
    public Miembro insertarRec(Miembro actual, Miembro miembro) {
        if (actual==null){
            actual=miembro;
            return actual;
        }else if (actual.getHijos()==2){
            if (actual.der==null){
                actual.der=insertarRec(actual.der,miembro);
            }else if(actual.izq==null){
                actual.izq=insertarRec(actual.izq,miembro);
            }else if(actual.der!=null&&actual.izq!=null){
                if(actual.der.getHijos()==0){
                    actual.izq=insertarRec(actual.izq,miembro);
                }else{
                    actual.der=insertarRec(actual.der,miembro);
                }
            }
        }else if (actual.getHijos()==1){
            actual.der=insertarRec(actual.der,miembro);
        }
        
        
        return actual;
    }
    
    public void insertar(Miembro miembro) {
        raiz = insertarRec(raiz, miembro);
    }
    
        

   
    
    public Miembro buscarAntecesor(Miembro miembro){        
        Miembro root = raiz;
        Miembro ante = new Miembro();
        while (root!=null){
            if(!(root.getNacimiento().equals(miembro.getNacimiento()))){
                
                if(root.getNacimiento().isBefore(miembro.getNacimiento())){
                    if(root.getHijos()==0){
                        root=ante.der;                      
                        
                    }else{
                        System.out.println("Nombre: "+root.getNombre());
                        System.out.println("Fecha de Nacimiento: " + root.getNacimiento());
                        System.out.println("Conyugue: "+root.getConyuge());                        
                        System.out.println("       |");
                        System.out.println("       |");
                        System.out.println("       V");
                        ante = root;
                        root=root.izq;
                    }
                }else{
                    root=ante.der;
                }
                
            }else{
                break;
            }
        }
        if (root==null){
            return null;
        }else{
        return ante;}    
    }
        
        

}
