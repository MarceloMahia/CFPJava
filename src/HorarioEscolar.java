import java.util.Scanner;

public class HorarioEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definimos el horario de la semana
        String[][] horario = {
                {"Matemáticas", "Ciencias", "Historia", "Educación Física", "Arte"}, // Lunes
                {"Inglés", "Matemáticas", "Biología", "Química", "Historia"},         // Martes
                {"Geografía", "Inglés", "Física", "Ciencias Sociales", "Educación Física"}, // Miércoles
                {"Literatura", "Matemáticas", "Historia", "Ciencias", "Música"},      // Jueves
                {"Computación", "Biología", "Química", "Matemáticas", "Educación Física"}   // Viernes
        };

        System.out.print("Introduce un día de la semana (Lunes, Martes, Miércoles, Jueves, Viernes): ");
        String dia = scanner.nextLine().trim().toLowerCase();

        String asignaturaPrimeraHora = "";

        switch (dia) {
            case "lunes":
                asignaturaPrimeraHora = horario[0][0];
                break;
            case "martes":
                asignaturaPrimeraHora = horario[1][0];
                break;
            case "miércoles":
            case "miercoles": // Añadimos esta opción por si el usuario omite la tilde
                asignaturaPrimeraHora = horario[2][0];
                break;
            case "jueves":
                asignaturaPrimeraHora = horario[3][0];
                break;
            case "viernes":
                asignaturaPrimeraHora = horario[4][0];
                break;
            default:
                System.out.println("Día inválido. Por favor, introduce un día de la semana válido.");
                return;
        }

        System.out.println("A primera hora el " + dia + " tienes: " + asignaturaPrimeraHora);
    }
}
