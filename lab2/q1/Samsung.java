/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufu.poo2.lab2.q1;

/**
 *
 * @author fabiola
 */
public class Samsung implements FabricanteCelular {

    @Override
    public Celular constroiCelular(String modelo) {
        if(modelo.equals("Galaxy8")){
            return new Galaxy8();
        }
        else {
            return null;
        }
    }
    
    
}
