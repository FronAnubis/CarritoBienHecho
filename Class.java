/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

//el arreglo tiene largo N definido de forma aleatoria al inicio del programa, con valores que van entre 1 y 20 productos.
//el precio de los productos viene dado por su posición en el arreglo, partiendo en la celda [0] con $500 y con incrementos de 
//$150 por celda, es decir, producto de la celda [1] cuestan $650, celda [2] $800, etc.
//Desarrolle un método que permita agregar la cantidad de cada producto del carrito, lo cual deberá hacer de forma aleatoria
//asumiendo que pueden haber entre 0 y 15 productos por celda. Considere que debe entregar el arreglo como parámetro de entrada.


import java.util.Random;

public class Class {

    public static void main(String[] args) {
        int[] carrito = carrito();
        mostrarCarrito(carrito);
        mostrarValor(carrito);
    }

    private static int[] carrito() {
        //Crea cuantos tipos de productos hay en el carrito
        Random random = new Random();
        int numeroRandom = random.nextInt(20);
        int[] carrito = new int[numeroRandom];

        //Dice cuantos productos hay de cada tipo
        for (int i = 0; i < carrito.length; i++) {
            carrito[i] = random.nextInt(15)+1;
        }

        return carrito;
    }

    private static void mostrarCarrito(int[] arr) {
        int suma=0;
        for (int i = 0; i < arr.length; i++) {
                System.out.print("[" + arr[i] + "]");
                suma+=arr[i] ;
        }
        System.out.println("");
        String mensaje;
        mensaje = "El carrito contiene "+suma+" productos";
        System.out.println(mensaje);
    }
    
    private static void mostrarValor(int[] arr){
        int precioCelda = 500;
        //int acumulador=0;
        int productoNum =0;
        int valorTotal=0;
        int sumaProductos=0;
        for (int i = 0; i < arr.length; i++) {
            productoNum= i+1;
            sumaProductos= arr[i]*precioCelda;
                precioCelda += 150;
                valorTotal+=sumaProductos; 
                System.out.println(productoNum+"° producto");
                System.out.println("Cantidad de productos: "+arr[i]);
                System.out.println("Subtotal: "+sumaProductos);
                //System.out.println("ValorTotal: "+valorTotal);
                //System.out.println("Precio Celda: "+precioCelda);
                System.out.println("");
        }
        System.out.println("ValorTotal: "+valorTotal);
    }
}