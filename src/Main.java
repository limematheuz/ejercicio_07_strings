import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] arrayPreguntas = preguntas.obtenerPreguntas();
        String[] arrayRespuestas = respuestas.obtenerSoluciones();
        String[] arrayOpciones = respuestas.obtenerOpciones();

//        System.out.println("");
//        int test = sc.nextInt();

        System.out.println("Para contestar a las preguntas usa:  a / b / c / d: ");

        for (int i = 0; i < arrayPreguntas.length; i++){
            System.out.println( "\n" + i + " - " + arrayPreguntas[i] + "\n");
            System.out.println(arrayOpciones[i] + "\n");
            System.out.print("Tu respuesta: ");
            String respuesta = sc.nextLine();

            if(!respuesta.equals("a") && !respuesta.equals("b") && !respuesta.equals("c") && !respuesta.equals("d")){
                System.out.println("Debes poner a / b / c / d");
                break;
            }else {
                if (respuesta.equals(arrayRespuestas[i])){
                    System.out.println("Has acertado");
                }else{
                    System.out.println("No has acertado");
                }
            }

        }
    }
}


