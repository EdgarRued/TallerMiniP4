import java.util.LinkedList;
import java.util.Scanner;

public class Punto3Linkedlist {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('a');
        list.add('b');
        list.add('r');
        list.add('a');
        list.add('c');
        list.add('a');
        list.add('d');
        list.add('a');
        list.add('b');
        list.add('r');
        list.add('a');
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("======CONTAR OCURRENCIAS DE UNA LETRA======");
        System.out.println("Palabra a estudiar: abracadabra ");
        System.out.print("Ingrese la letra a evaluar: ");
        char letter = scanner.next().charAt(0);
        System.out.println();
        System.out.println("--------------------------------------------");
        
        int firstPosition = findFirstOccurrence(list, letter);
        int lastPosition = findLastOccurrence(list, letter);

        System.out.println("Primera ocurrencia de '" + letter + "': " + firstPosition);
        System.out.println("Última ocurrencia de '" + letter + "': " + lastPosition);
    }

    public static int findFirstOccurrence(LinkedList<Character> list, char letter) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == letter) {
                return i;
            }
        }
        return -1; // Retorna -1 si la letra no se encuentra en la lista
    }

    public static int findLastOccurrence(LinkedList<Character> list, char letter) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == letter) {
                return i;
            }
        }
        return -1; // Retorna -1 si la letra no se encuentra en la lista
    }
}