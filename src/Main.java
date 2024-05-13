import Aeropuerto.Aeropuerto;
import Avion.*;


import java.util.Scanner;

public class Main {
    public static void main(String [] args)
    {

        menu();



    }
    public static void menu()
    {
        Aeropuerto aeropuerto= new Aeropuerto("Felix","Santa fe ",3);

        Scanner entrada= new Scanner(System.in);
        int opcion;
        do {
            String cadena = """
                    Bienvenido. Elija una opcion
                    \t[1]Cargar avion
                    \t[2]Ver aviones aeropuerto
                    \t[3]Ver hangares
                    \t[4]Ver total de aviones
                    \t[5]Ver cantidad de aviones en hangar
                    \t[0]Salir
                    """;
            System.out.println(cadena);
            opcion=entrada.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    cargarAviones(entrada,aeropuerto);
                    break;
                }
                case 2:
                {
                    System.out.println(aeropuerto.listar());
                    break;
                }
                case 3:
                {
                    System.out.println(aeropuerto.verHangares());
                    break;
                }
                case 4:
                {
                    System.out.println("En el aeropuerto hay "+ aeropuerto.cantidadAviones()+ " aviones");
                    break;
                }
                case 5:
                {
                    System.out.println("Lista de hangares : " + aeropuerto.verHangares());
                    System.out.println("Ingrese el nombre del hangar : ");
                    entrada.nextLine(); // Consumir el salto de línea pendiente
                    String nombre = entrada.nextLine();
                    System.out.println("En el hangar " + nombre + " hay " + aeropuerto.cantidadAvionesEnHangar(nombre));
                    break;
                }
                case 0:
                    break;
            }

        }while(opcion!=0);
    }

    public static void cargarAviones(Scanner entrada,Aeropuerto aeropuerto)
    {
        int opcion;
        do {
            String cadena = """
                Ingrese el tipo de avion 
                \t[1]Comercial
                \t[2]Privado
                \t[3]De carga
                \t[4]Militar
                \t[0]Salir
                """;
            System.out.println(cadena);
            opcion= entrada.nextInt();
            switch (opcion)
            {
                case 1:
                {
                    cargaAvionComercial(entrada,aeropuerto);
                    break;
                }
                case 2:
                {
                    cargarAvionPrivado(entrada,aeropuerto);
                    break;
                }
                case 3:
                {
                    cargarAvionCarga(entrada,aeropuerto);
                    break;
                }
                case 4:
                {
                    cargarAvionMilitar(entrada,aeropuerto);
                    break;
                }
                case 5:
                {
                    break;
                }
            }
        }while(opcion!=0);

    }
    public  static void cargaAvionComercial(Scanner entrada,Aeropuerto aeropuerto)
    {
        entrada.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese nombre del hangar:");
        String nombreHangar = entrada.nextLine();

        System.out.println("Ingrese nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese marca:");
        String marca = entrada.nextLine();
        System.out.println("Ingrese cantidad combustible:");
        float combustible = entrada.nextFloat();
        entrada.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Tipo de motor:");
        String motor = entrada.nextLine();
        System.out.println("Cantidad de asientos:");
        int cantidad = entrada.nextInt();
        System.out.println("Cantidad azafatas:");
        int cantidadAzafatas = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea pendiente

        Avion avion = new Comercial(nombre, marca, combustible, motor, cantidad, cantidadAzafatas);
        String mensaje =aeropuerto.agregarAvion(nombreHangar, avion);
        System.out.println(mensaje);
    }

    public static void cargarAvionPrivado(Scanner entrada, Aeropuerto aeropuerto) {
        entrada.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese nombre del hangar:");
        String nombreHangar = entrada.nextLine();

        System.out.println("Ingrese nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese marca:");
        String marca = entrada.nextLine();
        System.out.println("Ingrese cantidad combustible:");
        float combustible = entrada.nextFloat();
        entrada.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Tipo de motor:");
        String motor = entrada.nextLine();
        System.out.println("Cantidad de asientos:");
        int cantidad = entrada.nextInt();
        System.out.println("¿Tiene jacuzzi? (true/false):");
        boolean tieneJacuzzi = entrada.nextBoolean();

        Avion avion = new Privado(nombre, marca, combustible, motor, cantidad, tieneJacuzzi);

        // Agregar el avión al hangar correspondiente
        String mensaje =aeropuerto.agregarAvion(nombreHangar, avion);
        System.out.println(mensaje);
    }

    public static void cargarAvionCarga(Scanner entrada, Aeropuerto aeropuerto) {
        entrada.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese nombre del hangar:");
        String nombreHangar = entrada.nextLine();

        System.out.println("Ingrese nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese marca:");
        String marca = entrada.nextLine();
        System.out.println("Ingrese cantidad combustible:");
        float combustible = entrada.nextFloat();
        entrada.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Tipo de motor:");
        String motor = entrada.nextLine();
        System.out.println("Cantidad de asientos:");
        int cantidad = entrada.nextInt();
        System.out.println("Cantidad de kg:");
        int cantidadKg = entrada.nextInt();

        Avion avion = new DeCarga(nombre, marca, combustible, motor, cantidad, cantidadKg);

        // Agregar el avión al hangar correspondiente
        String mensaje =aeropuerto.agregarAvion(nombreHangar, avion);
        System.out.println(mensaje);
    }

    public static void cargarAvionMilitar(Scanner entrada, Aeropuerto aeropuerto) {
        entrada.nextLine();
        System.out.println("Ingrese nombre del hangar:");
        String nombreHangar = entrada.nextLine();

        System.out.println("Ingrese nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese marca:");
        String marca = entrada.nextLine();
        System.out.println("Ingrese cantidad combustible:");
        float combustible = entrada.nextFloat();
        entrada.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Tipo de motor:");
        String motor = entrada.nextLine();
        System.out.println("Cantidad de asientos:");
        int cantidad = entrada.nextInt();
        entrada.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese sistema de armas (AireAire/AireTierra):");
        String arma= entrada.nextLine();
        System.out.println("Ingrese cantidad de balas:");
        int cantidadBalas = entrada.nextInt();

        Avion avion = new Militar(nombre, marca, combustible, motor, cantidad, arma, cantidadBalas);

        // Agregar el avión al hangar correspondiente
        String mensaje =aeropuerto.agregarAvion(nombreHangar, avion);
        System.out.println(mensaje);
    }
}
