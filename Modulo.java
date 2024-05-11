/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author flaviorgs
 */
public class Modulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tecl = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite um número inteiro (ou 'sair' para encerrar): ");
                String input = tecl.next();
                
                if (input.equalsIgnoreCase("sair")) {
                    System.out.println("Programa encerrado.");
                    break;
                }

                int numero = Integer.parseInt(input); 
                System.out.println("O módulo do número digitado é: " + Math.abs(numero));
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número inteiro válido.");
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite um número inteiro válido.");
            }
        }
        tecl.close();
    }
    
}
