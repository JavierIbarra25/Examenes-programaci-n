public class Ejercicio4 {
    public static void main(String[] args){
        int costeCita = costeConsulta(2);
        System.out.println(costeCita);
    }

    public static int costeConsulta(int cita){
        int coste;

        if (cita>= 1 && cita <= 2){
            coste = 200;
            return coste;
        }
        else if (cita > 2 && cita <= 5){
            coste = 150;
            return coste;
        }
        else if (cita > 5){
            coste = 100;
            return coste;
        }
        return 0;
    }
}