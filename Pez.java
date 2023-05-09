public class Pez extends Animal {
    public String tipoAnimal;
    public Pez(String nombreAnimal,
               int edadAnimal,
               int duenioAnimalDni,
               String duenioAnimalNombre,
               String duenioAnimalDireccion,
               String sexoAnimal,
               int pesoGramos, String tipoAnimal) {
        super(nombreAnimal,
                edadAnimal,
                duenioAnimalDni,
                duenioAnimalNombre,
                duenioAnimalDireccion,
                sexoAnimal,
                pesoGramos);
        this.tipoAnimal = tipoAnimal;
    }
}