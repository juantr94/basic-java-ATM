import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    public Usuario(String name, String pass) {
        nombre=name;
        password=pass;
        user_id=user_id_global;
        user_id_global++;
        saldo= 200000;

    }


        private String nombre;
        private int user_id;
        static int user_id_global=0;
        private String password;
        private double saldo;


    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public int getUser_id() {
        return user_id;
    }

    public double getSaldo() {
        return saldo;
    }
    public void retirarDinero() {
        System.out.println("\n"+"Por favor ingrese valor a retirar");
        Scanner retiro = new Scanner(System.in);
        double valor = retiro.nextDouble();


        if (valor <= saldo){
            System.out.println( "\n" + "Ha retirado "+ valor + "$ pesos");
            saldo= saldo - valor;
            System.out.println("Su saldo actual es:"  + saldo + "$ pesos.");
        } else System.out.println("\n" + "El valor ingresado excede su saldo");

    }

    public void consignar(){
        System.out.println("\n"+"Por favor ingrese valor a consignar");
        Scanner cons = new Scanner(System.in);
        double valor = cons.nextDouble();
        saldo= saldo + valor;
        System.out.println("Ha consignado " + valor + "$ pesos, su saldo actual es: " + saldo + "$ pesos.");
    }

    public void cambioClave(){
    System.out.println("\n"+"Por favor ingrese su nueva contraseña");
    Scanner cons = new Scanner(System.in);
    String newPass = cons.nextLine();
    password=newPass;
    System.out.println("Ha cambiado exitosamente su clave.");


    }

    static ArrayList<Usuario> usuarioList = new ArrayList<Usuario>();

    public static void addUser(String name, String pass){

        usuarioList.add(new Usuario(name, pass));
    }








}
