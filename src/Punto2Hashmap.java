import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Punto2Hashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Contar vocales y consonantes dada una palabra------");
        System.out.print("Ingrese una palabra: ");
        String text = scanner.nextLine();
        Map<String, Integer> result = countVowelsAndConsonants(text);
        System.out.println("======Resultados======");
        System.out.println("Vocales: " + result.get("vocales"));
        System.out.println("Consonantes: " + result.get("consonantes"));
    }

    public static Map<String, Integer> countVowelsAndConsonants(String text) {
        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("vocales", 0); // 'v' represent vowels
        countMap.put("consonantes", 0); // 'c' representa Consonants

        text = text.toLowerCase(); // Convertir el texto a minúsculas para simplificar el conteo

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    countMap.put("vocales", countMap.get("vocales") + 1);
                } else {
                    countMap.put("consonantes", countMap.get("consonantes") + 1);
                }
            }
        }

        return countMap;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
