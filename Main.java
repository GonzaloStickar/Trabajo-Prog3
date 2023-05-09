import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean finalizar = false;
        List<Map<String,Animal>> animales = new ArrayList<>();

        while (!finalizar) {
            System.out.println();
            System.out.println("1) Ingresar animal");
            System.out.println("2) Retirar animal");
            System.out.println("3) Cantidad animales");
            System.out.println("4) Listar animales");
            System.out.println("5) Saludar");
            System.out.println("0) Salir");

            try {
                System.out.print("Elija una de las opciones: ");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 -> animales.add(opcion1());
                    case 2 -> {
                        while (true) {
                            if (animales.size()==0) {
                                System.out.println("No hay ningun animal para eliminar.");
                                break;
                            }
                            else {
                                try {
                                    int posicionEliminarAnimal;
                                    System.out.print("Ingrese una posicion a eliminar: ");
                                    posicionEliminarAnimal = scanner.nextInt();
                                    animales.remove(posicionEliminarAnimal);
                                    break;
                                } catch (IndexOutOfBoundsException e) {
                                    System.out.println("-----------ERROR------------");
                                    System.out.println("Insertar una posición valida.");
                                    System.out.println("-----------ERROR------------");
                                    System.out.println();
                                }
                            }
                        }
                    }
                    case 3 -> {
                        if (animales.size() == 1) {
                            System.out.println("Hay " + animales.size() + " animal en la guardería.");
                        } else {
                            System.out.println("Hay " + animales.size() + " animales en la guardería.");
                        }
                    }
                    case 4 -> opcion4(animales);
                    case 5 -> opcion5(animales);
                    case 0 -> finalizar = true;
                    default -> System.out.println("Elija un número entre 1 y 5, 0 para salir.");
                }
            } catch (InputMismatchException e) {
                System.out.println("-----------ERROR------------");
                System.out.println("Ingresar solamente un número");
                System.out.println("-----------ERROR------------");
                scanner.next();
            }
        }
    }
    public static Map<String,Animal> opcion1 () {
        Scanner scanner = new Scanner(System.in);

        Map<String,Animal> datosAnimal = new HashMap<>();

        int opcionOpcion1;
        while (true) {
            try {
                System.out.println("1) Nuevo Perro");
                System.out.println("2) Nuevo Gato");
                System.out.println("3) Nuevo Hamster");
                System.out.println("4) Nuevo Pez");
                System.out.println();
                System.out.print("Elija una opcion: ");
                int opcionOpcion1Ingresada = scanner.nextInt();
                scanner.nextLine();
                if ((opcionOpcion1Ingresada>0 && opcionOpcion1Ingresada<5)) {
                    opcionOpcion1 = opcionOpcion1Ingresada;
                    break;
                }
                else {
                    System.out.println("Solo puede ingresar un número entre 1 y 4.");
                }
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
        }

        //Datos del animal
        String nombreAnimal;
        while (true) {
            try {
                //System.out.println(scanner.next());
                System.out.print("Ingrese el nombre del animal: ");
                String nombreIngresado = scanner.nextLine();
                if (nombreIngresado.matches("^[a-zA-Z]+$")) {
                    nombreAnimal=nombreIngresado;
                    break;
                }
                else {
                    System.out.println("Error, ingrese un nombre adecuado.");
                }
            } catch (IllegalArgumentException e) {
                scanner.nextLine();
            }
        }

        int edadAnimal = 0;
        while (edadAnimal==0) {
            try {
                System.out.print("Ingrese la edad: ");
                int edadIngresada = scanner.nextInt();
                if (edadIngresada>0 && edadIngresada<50) {
                    edadAnimal=edadIngresada;
                }
                else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese una edad válida.");
                scanner.nextLine();
            }
        }

        int duenioAnimalDni = 0;
        while (duenioAnimalDni==0) {
            try {
                System.out.print("Ingrese el DNI del dueño: ");
                int dniIngresado = scanner.nextInt();
                if (dniIngresado>0 && dniIngresado<99999999) {
                    scanner.nextLine();
                    duenioAnimalDni=dniIngresado;
                }
                else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un DNI válido.");
                scanner.nextLine();
            }
        }

        String duenioAnimalNombre = "";
        while (duenioAnimalNombre.equals("")) {
            try {
                System.out.print("Ingrese el nombre del dueño: ");
                String duenioAnimalNombreIngresado = scanner.nextLine();
                if (duenioAnimalNombreIngresado.matches("[a-zA-Z]+")) {
                    duenioAnimalNombre=duenioAnimalNombreIngresado;
                }
                else {
                    System.out.println("Error, ingrese un nombre adecuado.");
                }
            } catch (IllegalArgumentException e) {
                scanner.nextLine();
            }
        }

        String duenioAnimalDireccion = "";
        while (duenioAnimalDireccion.equals("")) {
            try {
                System.out.print("Ingrese la dirección del dueño: ");
                String duenioAnimalDireccionIngresado = scanner.nextLine();
                if (duenioAnimalDireccionIngresado.matches("[a-zA-Z0-9 ]+")) {
                    duenioAnimalDireccion=duenioAnimalDireccionIngresado;
                }
                else {
                    System.out.println("Error, ingrese una dirección correcta.");
                }
            } catch (IllegalArgumentException e) {
                scanner.nextLine();
            }
        }

        String sexoAnimal = "";
        while (sexoAnimal.equals("")) {
            try {
                System.out.print("Ingrese el sexo del animal: ");
                String sexoAnimalIngresado = scanner.nextLine();
                if (sexoAnimalIngresado.matches("[a-zA-Z]+")) {
                    sexoAnimal=sexoAnimalIngresado;
                }
                else {
                    System.out.println("Error, ingrese un sexo del animal correctamente.");
                }
            } catch (IllegalArgumentException e) {
                scanner.nextLine();
            }
        }

        int pesoGramos = 0;
        while (pesoGramos==0) {
            try {
                System.out.print("Ingrese el peso (en Gramos) del animal: ");
                int pesoIngresado = scanner.nextInt();
                scanner.nextLine();
                if (pesoIngresado>0 && pesoIngresado<110000) {
                    pesoGramos = pesoIngresado;
                } else {
                    System.out.println("Ingrese un peso válido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un peso válido.");
                scanner.nextLine();
            }
        }

        switch (opcionOpcion1) {
            case 1 -> {
                String razaOTipoAnimal = "";
                while (razaOTipoAnimal.equals("")) {
                    try {
                        System.out.print("Ingrese la raza del Perro: ");
                        String razaOTipoAnimalIngresado = scanner.nextLine();
                        if (razaOTipoAnimalIngresado.matches("[a-zA-Z]+")) {
                            razaOTipoAnimal=razaOTipoAnimalIngresado;
                        }
                        else {
                            System.out.println("Error, ingrese una raza adecuada.");
                        }
                    } catch (IllegalArgumentException e) {
                        scanner.nextLine();
                    }
                }

                Perro nuevoPerro = new Perro(nombreAnimal, edadAnimal, duenioAnimalDni, duenioAnimalNombre, duenioAnimalDireccion, sexoAnimal, pesoGramos, razaOTipoAnimal);
                datosAnimal.put("Perro", nuevoPerro);
            }
            case 2 -> {
                Animal nuevoGato = new Animal(nombreAnimal, edadAnimal, duenioAnimalDni, duenioAnimalNombre, duenioAnimalDireccion, sexoAnimal, pesoGramos);
                datosAnimal.put("Gato", nuevoGato);
            }
            case 3 -> {
                Animal nuevoHamster = new Animal(nombreAnimal, edadAnimal, duenioAnimalDni, duenioAnimalNombre, duenioAnimalDireccion, sexoAnimal, pesoGramos);
                datosAnimal.put("Hamster", nuevoHamster);
            }
            case 4 -> {
                String razaOTipoAnimal = "";
                boolean ingresoOpcion = false;
                while (!ingresoOpcion) {
                    System.out.println("1) Tipo de Agua Fría");
                    System.out.println("1) Tipo de Agua Tropical");

                    System.out.println("De que tipo de agua es? 1) ó 2)? ");
                    int opcion = scanner.nextInt();

                    if (opcion == 1 || opcion == 2) {
                        if (opcion == 1) {
                            razaOTipoAnimal = "Fría";
                        }
                        else {
                            razaOTipoAnimal = "Tropical";
                        }
                        ingresoOpcion = true;
                    }
                }
                Pez nuevoPez = new Pez(nombreAnimal, edadAnimal, duenioAnimalDni, duenioAnimalNombre, duenioAnimalDireccion, sexoAnimal, pesoGramos, razaOTipoAnimal);
                datosAnimal.put("Pez", nuevoPez);
            }
            //default -> System.out.print("Elija una opción: ");
        }
        return datosAnimal;
    }
    public static void opcion4 (List<Map<String,Animal>> animales) {
        if (animales.size()==0) {
            System.out.println("No hay ningún animal.");
        }
        else {
            int posicion=0;
            for (Map<String, Animal> animalX : animales) {
                posicion++;
                System.out.println("-------------------------------");
                for (Animal datoAnimal : animalX.values()) {
                    System.out.println("Nombre: " + datoAnimal.nombreAnimal);
                    System.out.println("Edad: " + datoAnimal.edadAnimal);
                    System.out.println("Nombre Dueño: " + datoAnimal.duenioAnimalNombre);
                    System.out.println("DNI del dueño: " + datoAnimal.duenioAnimalDni);
                    System.out.println("Dirección: " + datoAnimal.duenioAnimalDireccion);
                    System.out.println("Sexo: " + datoAnimal.sexoAnimal);
                    System.out.println("Peso (Gramos): " + datoAnimal.pesoGramos);

                    if (datoAnimal instanceof Perro) {
                        System.out.println("Raza: " + ((Perro) datoAnimal).razaAnimal);
                    } else if (datoAnimal instanceof Pez) {
                        System.out.println("Tipo: " + ((Pez) datoAnimal).tipoAnimal);
                    }
                    System.out.println("Posición en la lista: " + posicion);
                }
                System.out.println("-------------------------------");
            }
        }
    }
    public static void opcion5 (List<Map<String,Animal>> animales) {
        if (animales.size()==0) {
            System.out.println("No hay ningun animal que pueda saludar.");
        }
        else {
            for (Map<String, Animal> animalX : animales) {
                int i=0;
                for (Animal datoAnimal : animalX.values()) {
                    System.out.println("Hola me llamo "+datoAnimal.nombreAnimal+" y Soy un "+animalX.keySet().toArray()[i]);
                    i++;
                }
            }
        }
    }
}