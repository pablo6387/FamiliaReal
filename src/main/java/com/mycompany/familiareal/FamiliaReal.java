package com.mycompany.familiareal;

import java.time.LocalDate;
import java.util.Scanner;

public class FamiliaReal {

    public static void main(String[] args) {

        Miembro georgeV = new Miembro(LocalDate.of(1865,6,3), "George V","Mary of Teck",2);
        Miembro edwardVIII = new Miembro(LocalDate.of(1894,6,24), "Edward VIII","",0);
        Miembro georgeVI = new Miembro(LocalDate.of(1895,12,14), "George VI","Elizabeth Bowes-Lyon",2);
        Miembro elizabethII = new Miembro(LocalDate.of(1926,4,21), "Elizabeth II","Philip Duke of Edinburgh",2);
        Miembro princessMargaret = new Miembro(LocalDate.of(1930,8,21), "Princess Margaret","Antony Amstrong Jones",0);
        Miembro princeCharles = new Miembro(LocalDate.of(1948,11,14), "Prince Charles","Princess Diana",2);
        Miembro princessAnne = new Miembro(LocalDate.of(1950,8,15), "Princess Anne","Mark Phillips",0);        
        Miembro princeWilliam = new Miembro(LocalDate.of(1982,6,21), "Prince William","Catherine",2);
        Miembro princeHenry = new Miembro(LocalDate.of(1984,9,15), "Prince Henry","Meghan",0);
        Miembro princeGeorge = new Miembro(LocalDate.of(2013,7,22), "Prince George","",0);
        Miembro princessCharlotte = new Miembro(LocalDate.of(2015,5,2), "Princess Charlotte","",0);

        int op;
        Scanner entry = new Scanner(System.in);
        ArbolGenealogico windsor =new ArbolGenealogico();
        String texto;
        
        do{
            System.out.println("Arbol Genealogico: La Casa de Windsor");
            System.out.println("");
            System.out.println("");
        
            System.out.println("Elija una opcion: (1,2,3)");
            System.out.println("");
            System.out.println("1 - Cargar miembros");
            System.out.println("2 - Buscar antecedores");
            System.out.println("3 - Salir");
            op = entry.nextInt();
            System.out.print("\n\n\n\n");
                switch(op){
                    case 1:
                        entry.nextLine();
                        windsor.insertar(georgeV);
                        windsor.insertar(edwardVIII);
                        windsor.insertar(georgeVI);
                        windsor.insertar(elizabethII);
                        windsor.insertar(princessMargaret);
                        windsor.insertar(princeCharles);
                        windsor.insertar(princessAnne);
                        windsor.insertar(princeWilliam);
                        windsor.insertar(princeHenry);
                        windsor.insertar(princeGeorge);
                        windsor.insertar(princessCharlotte);
                        System.out.println("Arbol Cargado");
                        break;
                    case 2:
                        entry.nextLine();
                        System.out.println("Elija a un miembro de la Familia Real");
                        System.out.println("");
                        System.out.println("1 - George V");
                        System.out.println("2 - Edward VIII");
                        System.out.println("3 - George VI");
                        System.out.println("4 - Elizabeth II");
                        System.out.println("5 - Princess Margaret");
                        System.out.println("6 - Prince Charles");
                        System.out.println("7 - Princess Anne");
                        System.out.println("8 - Prince William");
                        System.out.println("9 - Prince Henry");
                        System.out.println("10 - Prince George");
                        System.out.println("11 - Princess Charlotte");
                        op = entry.nextInt();
                        switch(op){
                            case 1:
                                windsor.buscarAntecesor(georgeV);
                                break;
                            case 2:
                                windsor.buscarAntecesor(edwardVIII);
                                System.out.println("Nombre: "+edwardVIII.getNombre());
                                System.out.println("Fecha de Nacimiento: " + edwardVIII.getNacimiento());
                                System.out.println("Conyugue: "+edwardVIII.getConyuge()); 
                                break;
                            case 3:
                                windsor.buscarAntecesor(georgeVI);
                                System.out.println("Nombre: "+georgeVI.getNombre());
                                System.out.println("Fecha de Nacimiento: " + georgeVI.getNacimiento());
                                System.out.println("Conyugue: "+georgeVI.getConyuge());
                                break;
                            case 4:
                                windsor.buscarAntecesor(elizabethII);
                                System.out.println("Nombre: "+elizabethII.getNombre());
                                System.out.println("Fecha de Nacimiento: " + elizabethII.getNacimiento());
                                System.out.println("Conyugue: "+elizabethII.getConyuge());
                                break;
                            case 5:
                                windsor.buscarAntecesor(princessMargaret);
                                System.out.println("Nombre: "+princessMargaret.getNombre());
                                System.out.println("Fecha de Nacimiento: " + princessMargaret.getNacimiento());
                                System.out.println("Conyugue: "+princessMargaret.getConyuge());
                                break;
                            case 6:
                                windsor.buscarAntecesor(princeCharles);
                                System.out.println("Nombre: "+princeCharles.getNombre());
                                System.out.println("Fecha de Nacimiento: " + princeCharles.getNacimiento());
                                System.out.println("Conyugue: "+princeCharles.getConyuge());
                                break;
                            case 7:
                                windsor.buscarAntecesor(princessAnne);
                                System.out.println("Nombre: "+princessAnne.getNombre());
                                System.out.println("Fecha de Nacimiento: " + princessAnne.getNacimiento());
                                System.out.println("Conyugue: "+princessAnne.getConyuge());
                                break;
                            case 8:
                                windsor.buscarAntecesor(princeWilliam);
                                System.out.println("Nombre: "+princeWilliam.getNombre());
                                System.out.println("Fecha de Nacimiento: " + princeWilliam.getNacimiento());
                                System.out.println("Conyugue: "+princeWilliam.getConyuge());
                                break;
                            case 9:
                                windsor.buscarAntecesor(princeHenry);
                                System.out.println("Nombre: "+princeHenry.getNombre());
                                System.out.println("Fecha de Nacimiento: " + princeHenry.getNacimiento());
                                System.out.println("Conyugue: "+princeHenry.getConyuge());
                                break;
                            case 10:
                                windsor.buscarAntecesor(princeGeorge);
                                System.out.println("Nombre: "+princeGeorge.getNombre());
                                System.out.println("Fecha de Nacimiento: " + princeGeorge.getNacimiento());
                                System.out.println("Conyugue: "+princeGeorge.getConyuge());
                                break;
                            case 11:
                                windsor.buscarAntecesor(princessCharlotte);
                                System.out.println("Nombre: "+princessCharlotte.getNombre());
                                System.out.println("Fecha de Nacimiento: " + princessCharlotte.getNacimiento());
                                System.out.println("Conyugue: "+princessCharlotte.getConyuge());
                                break;
                                
                            default:
                                break;
                        
                        }
                        op=4;
                        break;
                    default:
                       break; 
                }
                
                System.out.println("");
                System.out.println("");
        }while(op!=3);
    }
}
