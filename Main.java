import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> tareas = new ArrayList<>();
    static String MENU = "\n\n    /---MENÚ---\\    \n" +
        "   1. Agregar tareas.\n" +
        "   2. Eliminar tarea.\n" +
        "   3. Lista tareas.\n" +
        "   4. Salir.\n" +
        "Elige una opción: ";
    public static void main(String[] args) throws Exception {
        mainMenu();
    }

    public static void mainMenu(){
        Scanner input = new Scanner(System.in);
        System.out.print(MENU);
        int opt = input.nextInt();
        input.nextLine();
        
        switch(opt){
            case 1 -> {
                boolean stop = false;
                while(!stop){
                    System.out.print("Introduce el nombre de la tarea (q para terminar): ");
                    String tarea = input.nextLine();
                    if(tarea.equals("q")){
                        stop = true;
                        mainMenu();
                    }
                    else{
                        agregarTarea(tarea);
                        System.out.println("Tarea agregada.");
                    }
                }
            }
            case 2 -> {
                System.out.print("Introduce el índice de la tarea a eliminar: ");
                int t = input.nextInt();
                input.nextLine();
                eliminarTarea(t);
            }
            case 3 -> listarTareas();
            case 4 -> end();
        }
    }

    //tarea listar










    //tarea eliminar
  









    

    //Tarea agregar 









    
    public static void end(){
        System.out.println("Sesión finalizada");
    }
}