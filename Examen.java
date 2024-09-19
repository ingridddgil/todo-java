import java.util.*;

public class Examen {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        int[] diasMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        System.out.println("Ingrese un número:");
        int mes = reader.nextInt();

        if (!(mes > 0 && mes < 13)) {
            System.out.println("Número invalido");
        } else {
            System.out.println(meses[mes - 1] + " tiene " + diasMes[mes - 1] + " días");
        }
        reader.close();
    }
}