/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Estructuras.Lista;
import java.util.Scanner;



/**
 * @author FELIPE
 */
public class Vista {
    public static void main(String[] args) {
        Lista l =  new Lista();
        Lista l2 =  new Lista();
        l.insertarAlFinal(3);
        l.insertarAlFinal(4);
        l.insertarAlFinal(5);
        l.insertarAlFinal(11);
        
        l2 = l.duplicar();
        
        l.eliminar(12);
        
        l.eliminarTodo();
    }
}
