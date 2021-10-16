package Estructuras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author CARLOS MARIO
 */
public class ListaDoble {

    NodoListaDoble inicio;
    String nombre;

    public ListaDoble() {
        inicio = null;
        nombre = null;
    }

    public boolean isEmpty() {
        return this.inicio == null;
    }

    public void insertarAlPrincipio(int dato) {
        NodoListaDoble aux;
        aux = new NodoListaDoble(dato);
        aux.sig = this.inicio;
        if (!this.isEmpty()) {
            this.inicio.ant = aux;
        }
        this.inicio = aux;
    }

    //Iterativa
    public void mostrarLista() {
        if (this.isEmpty()) {
            System.out.println("Lista vacía");
        } else {
            NodoListaDoble cursor;
            int i = 0;
            cursor = this.inicio;
            while (cursor != null) {
                System.out.println("Nodo: " + i + ", Dato:" + cursor.getClave());
                cursor = cursor.sig;
                i++;
            }
        }
    }

    //Recursiva
    public void mostrar() {
        mostrar(this.inicio);
    }

    public void mostrar(NodoListaDoble nodoLista) {
        if (nodoLista == null) {
            System.out.println("Fin");
        } else {
            System.out.println("Dato:" + nodoLista.getClave());
            mostrar(nodoLista.sig);
        }
    }

    public void eliminarPrimero() {
        if (this.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            NodoListaDoble aux = this.inicio;
            this.inicio = this.inicio.sig;
            this.inicio.ant = null;
            aux = null;
            //Para los demás nodos?
        }
    }

    public NodoListaDoble sacarPrimero() {
        if (!this.isEmpty()) {
            NodoListaDoble aux = inicio;
            this.inicio = this.inicio.sig;
            aux.sig = null;
            //Para los demás nodos?
            return aux;
        } else {
            System.out.println("Lista vacia");
            return null;
        }
    }

//Iterativa
    public void insertarAlFinalIterativo(int dato) {
        if (this.isEmpty()) {
            System.out.println("Lista vacía");
        } else {
            NodoListaDoble cursor;
            cursor = this.inicio;
            while (cursor.sig != null) {
                cursor = cursor.sig;
            }
            NodoListaDoble aux = new NodoListaDoble(dato);
            cursor.sig = aux;
            aux.ant = cursor;
        }   
    }
    }
