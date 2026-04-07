/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadesala2;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class AtividadeSala2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);

        int numr;
        System.out.print("Tamanho: ");
        numr = entrada.nextInt();

        int[] x = new int[numr];
        int[] y = new int[numr];
        int[] z = new int[numr * 2];

        int k = 0;
        for (int i = 0; i < numr; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = entrada.nextInt();
        }
        for (int i = 0; i < numr; i++) {
            System.out.print("y[" + i + "]: ");
            y[i] = entrada.nextInt();
        }
        for (int i = 0; i < numr; i++) {
            z[k] = x[i];
            k++;
        }
        for (int i = 0; i < numr; i++) {
            boolean repetido = false;

            for (int j = 0; j < k; j++) {
                if (y[i] == z[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                z[k] = y[i];
                k++;
            }
        }
        System.out.println("Uniao:");
        for (int i = 0; i < k; i++) {
            System.out.print(z[i] + " ");
        }
    }
    
}
