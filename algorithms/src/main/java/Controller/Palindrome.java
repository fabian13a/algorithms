/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author fabia
 */
public class Palindrome {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog("Humano!!! escribe un palindromo");
        int longitud = texto.length();
        char[] letras = new char[longitud];
        char[] letrasInv = new char[longitud];
        int inverso = longitud;
        boolean igual = true;
        for(int i = 0; i < longitud; i++) {
                letrasInv[i] = texto.toLowerCase().charAt(inverso - 1);
                inverso--;
                letras[i] = texto.toLowerCase().charAt(i);
                if (letrasInv[i] != letras[i]) {
                    igual = false;
                    break;
                }
            }
            if (igual == false) {
                System.out.println(" no es un palindromo");
            }else{
            System.out.println(" SI es un palindromo");
        }

     }
    }