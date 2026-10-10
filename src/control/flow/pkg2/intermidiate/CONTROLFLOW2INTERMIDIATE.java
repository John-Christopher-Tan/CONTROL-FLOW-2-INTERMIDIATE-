/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control.flow.pkg2.intermidiate;


public class CONTROLFLOW2INTERMIDIATE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {10, -5, 20, -1, 15};
        int total = 0;
        int i = 0;

        while (numbers[i] != -1) {
            total += numbers[i];
            i++;
        }

        System.out.println("Final Total: " + total);
    }
    
}
