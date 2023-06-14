import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Punto1Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Impresion de binarios dado un numero---------");
        System.out.print("Digite el numero a analizar...: ");      
        int n = scanner.nextInt();
        printBinaryNumbers(n);
    }

    public static void printBinaryNumbers(int n) {
        Queue<String> binaryQueue = new LinkedList<>();

        // Convertir los números a binario y agregarlos a la cola
        for (int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            binaryQueue.offer(binary);
        }

        // Imprimir los números en orden
        System.out.println("-----------impresion de binarios-------------");
        while (!binaryQueue.isEmpty()) {
            System.out.println(binaryQueue.poll());
        }
    }
}
