package Estructuras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CARLOS MARIO
 */
class NodoLista {

    NodoLista sig;
    private int clave;

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getClave() {
        return clave;
    }

    public NodoLista(int dato) {
        this.clave = dato;
        this.sig = null;
    }
}
