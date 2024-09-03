/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo2.lab2.q1;

/**
 *
 * @author fabiola
 */
public class FabricanteCelularSingleton {
    
    private Apple apple;
    private Samsung samsung;
    
    public FabricanteCelular getInstance(String fabricante){
        if(fabricante.equals("apple")){
            if(apple == null){
                apple = new Apple();   
            }
            return apple;
        } else
            if(samsung == null){
                samsung = new Samsung();
            }
            return samsung;
    }
    
}
