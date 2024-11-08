public class Ejercicio2 {
    public static void main (String[] args) {
        int numero = 5;
        if (esPrimo(numero)){
            System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }
        
    }

    public static boolean esPrimo (int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
            return true;
    }
}