/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo2.lab2.q1;

/**
 *
 * @author fabiola
 */
public class Main {
    
    
    public static void main(String ... args){
        
        FabricanteCelularSingleton singleton = new FabricanteCelularSingleton();
        FabricanteCelular fabricanteSamsung = singleton.getInstance("samsung");
        
        Celular galaxy8 = fabricanteSamsung.constroiCelular("Galaxy8");
        galaxy8.tiraFoto();
        
    }
    
}
