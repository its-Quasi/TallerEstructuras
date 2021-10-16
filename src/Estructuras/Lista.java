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
public class Lista {

    NodoLista inicio;
    String nombre;

    public Lista() {
        inicio = null;
        nombre = null;
    }

    public boolean isEmpty() {
        return this.inicio == null;
    }

    public void insertarAlPrincipio(int dato) {
        NodoLista aux;
        aux = new NodoLista(dato);
        aux.sig = this.inicio;
        this.inicio = aux;
    }

    //Iterativa
    public void mostrarLista() {
        if (this.isEmpty()) {
            System.out.println("Lista vacía");
        } else {
            NodoLista cursor;
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

    public void mostrar(NodoLista nodoLista) {
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
            NodoLista aux = this.inicio;
            this.inicio = this.inicio.sig;
            aux = null;
            //Para los demás nodos?
        }
    }

    public NodoLista sacarPrimero() {
        if (!this.isEmpty()) {
            NodoLista aux = inicio;
            this.inicio = this.inicio.sig;
            aux.sig = null;
            //Para los demás nodos?
            return aux;
        } else {
            System.out.println("Lista vacia");
            return null;
        }
    }

    //Recursivo
    public void insertarAlFinal(int dato) {
        this.inicio = this.insertarAlFinal(this.inicio, dato);
    }

    public NodoLista insertarAlFinal(NodoLista nodoLista, int dato) {
        NodoLista resul = nodoLista;
        if (nodoLista == null) {
            resul = new NodoLista(dato);
        } else {
            nodoLista.sig = this.insertarAlFinal(nodoLista.sig, dato);
        }
        return resul;
    }
    
    
    //1er Punto
    public void insertarPosicion(int pos, int dato){
        if(pos<0){
            System.out.println("La posicion no valida");
            return;
        }
        if(pos == 0)this.insertarAlPrincipio(dato);
        NodoLista aux = null;
        NodoLista n = this.inicio;
        int indice = 0;
        while(indice != pos){
            aux = n;
            n = n.sig;
            indice++;
        }
        NodoLista aInsertar = new NodoLista(dato); // Este es el nodo 10 del tablero
        aInsertar.sig = n;
        aux.sig = aInsertar;
    }
    
    //2do Punto
    public void eliminar(int dato){//(5) 
        NodoLista a = null;
        NodoLista n = this.inicio;
        if(n.getClave() == dato){//Este caso es para cuando el nodo a eliminar es el primer nodo
            this.inicio = n.sig;
            return ;
        }
        
        /**Si el nodo a eliminar no es el primero pues itero a n buscando a 'dato'*/
        while(n != null && n.getClave() != dato){
            a = n;
            n = n.sig;
        }
        if(n!=null){//Si n es diferente de null significa que el dato a eliminar fue encontrado en la lista
            a.sig = n.sig;
            n.sig = null;
        }
        else{
            //Si n es nulo entonces el dato no fue encontrado
            System.out.println("El dato " + dato + " no fue encontrado");
        }
        
    }
    
    //3er Punto
    public int size(){
        int contador = 0;
        NodoLista m = this.inicio;
        while( m != null){
            m = m.sig;
            contador++;
        }
        return contador;
    }
    
    //Punto 4
    public void eliminarTodo(){
        //3 -> 4 -> 5 -> 11 -> null
        //Si inicio es diferente de null se eliminara el primer nodo en cada iteracion
        while(this.inicio != null){
            //llamo a eliminar y le paso como parametro el dato a eliminar, en este caso el dato de inicio =D
            eliminar(this.inicio.getClave());
            
        }
        
    }
    
    //Punto 5
    public Lista duplicar(){
        Lista duplicate = new Lista();//<--
        NodoLista n = this.inicio;
        while(n != null){
            duplicate.insertarAlFinal(n.getClave());
            n = n.sig;
        }
        return duplicate;
    }
}
