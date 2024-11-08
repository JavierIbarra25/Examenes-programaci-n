public class Ejercicio1 {
    public static void main(String[] args) {
        int sumaTotal = SumaImpares(3, 7);
        System.out.println("La suma de los impares es " + sumaTotal);
    }

    public static int SumaImpares(int a, int b) {
        int suma = 0;

        // Asegúrate de que a sea menor que b
        if (a > b) {
            return suma; // Retorna 0 si el rango es inválido
        }

        // Iterar desde a hasta b
        for (int i = a; i <= b; i++) {
            // Verificar si el número es impar
            if (i % 2 != 0) {
                suma += i; // Sumar el número impar
            }
        }
        return suma; // Retornar la suma de los impares
    }
}