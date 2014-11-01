/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isg;

import java.util.ArrayList;


/**
 *
 * @author T107
 */
public class GeneradorCalificaciones {
    
   private ArrayList<evaluacion> GeneradorCalificaciones(){
        ArrayList<evaluacion> a = new ArrayList<>();
            a.add(new evaluacion("Petra", (float) 5.8));
            a.add(new evaluacion("Jose", (float) 7.4));
            a.add(new evaluacion("Roberta", (float) 8.6));
            return a;
}
    
}
