public class Ejercicio3{

    public static void main(String[] args) {
        int numeroFinal = invertirNumero(4578);
        System.out.println("La suma de los impares es " + numeroFinal);
    }

    public static int invertirNumero(int n){
        int numeroInvertido = 0;
        int multiplicador = 1;
        int contador = 0;
        int aux = n;

        // Paso 1: Contar los dígitos del número para definir el tamaño del array
        while (aux > 0) {
            aux = aux / 10;
            contador++;
        }

        int [] lista = new int[contador];
        contador = 0;

        while(n > 10){//Vamos añadiendo los restos a un array 574 / 10
            lista[contador] = n % 10;                      //   4   57 / 10
            n = n / 10;                                    //        7   5   cogemos el primer resto, segundo...
            contador++;                                    //                y por ultimo el resultado de la division y te queda invertido
        }
        lista[contador] = n;//Una vez n sea menor a 10 guardamos el resultado de la division

        for(int i = 0; i < lista.length; i++){//Recorremos el array y ya tendra los numeros invertidos

            for(int j = contador; j > 0; j--){//Con el contador sabemos cuantos digitos tiene el numero, si tiene 4 se multiplicara por 1000, si tiene 3 por 100...
                multiplicador *= 10;
            }
            numeroInvertido += (lista[i] * multiplicador);//para el 574 se sumara 4*100 = 400 + 7*10 = 470 + 5*1 = 475
            multiplicador = 1;//reseteamos multiplicador
            contador--;//y reducimos los 0's
        }

        return numeroInvertido;//devolvemos el numero invertido
    }
}