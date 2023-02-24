import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean staph = false;

        do {
            System.out.println("\n Bienvenido, elija una de las siguientes opciones; " + "\n");
            System.out.println("1. Crear usuario");
            System.out.println("2. Ver su saldo");
            System.out.println("3. Hacer consignación");
            System.out.println("4. Retirar dinero");
            System.out.println("5. Cambiar su contraseña");
            System.out.println("6. Salir" + "\n");

            Scanner op = new Scanner(System.in);
            int opcion = op.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\n Por favor, ingrese nombre de usuario: ");
                    Scanner usr = new Scanner(System.in);
                    String user=usr.nextLine();
                    System.out.println("\n Por favor, ingrese contraseña: ");
                    Scanner pass = new Scanner(System.in);
                    String password=pass.nextLine();
                    Usuario.addUser(user, password);
                    System.out.println("\n Usuario creado exitosamente");

                    break;
                case 2: {
                    int indx = UI.autenticar();
                    if (indx != -1) {
                        System.out.print("\n" + "Su saldo es: " );
                        System.out.println(Usuario.usuarioList.get(indx).getSaldo());
                    } else System.out.println("Usuario no encontrado");

                    break;}
                case 3: {
                    int indx = UI.autenticar();
                    if (indx != -1) {
                        if (UI.autPass(indx)) {
                            Usuario.usuarioList.get(indx).consignar();
                        } else System.out.println("Contraseña incorrecta");
                    } else System.out.println("Usuario no encontrado");
                    break;}
                case 4: {
                    int indx = UI.autenticar();
                    if (indx != -1) {
                        if (UI.autPass(indx)) {
                            Usuario.usuarioList.get(indx).retirarDinero();
                        } else System.out.println("Contraseña incorrecta");
                    } else System.out.println("Usuario no encontrado");
                    break;}
                case 5: {
                    int indx = UI.autenticar();
                    if (indx != -1) {
                        if (UI.autPass(indx)) {
                            Usuario.usuarioList.get(indx).cambioClave();
                        } else System.out.println("Contraseña incorrecta");
                    } else System.out.println("Usuario no encontrado");
                    break;}
                case 6:
                    staph=true;
                    break;
                default:
                    System.out.println("\n"+"Valor no admitido"+"\n");


            }
        }while (!staph);
    }
}