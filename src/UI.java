import java.util.Scanner;


public class UI {
    public static int autenticar() {
        System.out.println("\n Por favor, ingrese nombre de usuario: ");
        Scanner user = new Scanner(System.in);
        String nombreUsuario = user.nextLine();

        int index=-1;
        for (Usuario usx : Usuario.usuarioList) {
            int contador=0;
            if (nombreUsuario.equals(usx.getNombre())){
            index=contador;
            }
            contador++;

        }
        return index;
    }
     public static boolean autPass(int indice){
         System.out.println("\n Por favor, ingrese contraseña: ");
         Scanner pass = new Scanner(System.in);
         String password=pass.nextLine();

         boolean verificar;
         if (password.equals(Usuario.usuarioList.get(indice).getPassword())){
             verificar = true;
         } else {
             verificar=false;
         }
        return verificar;
     }


}
