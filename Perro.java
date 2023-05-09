public class Perro extends Animal {
    public String razaAnimal;

    public Perro(String nombreAnimal,
                 int edadAnimal,
                 int duenioAnimalDni,
                 String duenioAnimalNombre,
                 String duenioAnimalDireccion,
                 String sexoAnimal,
                 int pesoGramos, String razaOTipoAnimal) {
        super(nombreAnimal,
                edadAnimal,
                duenioAnimalDni,
                duenioAnimalNombre,
                duenioAnimalDireccion,
                sexoAnimal,
                pesoGramos);
        this.razaAnimal = razaOTipoAnimal;
    }
}