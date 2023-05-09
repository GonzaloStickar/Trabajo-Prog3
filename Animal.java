public class Animal {
    protected String nombreAnimal;
    protected int edadAnimal;
    protected int duenioAnimalDni;
    protected String duenioAnimalNombre;
    protected String duenioAnimalDireccion;
    protected String sexoAnimal;
    protected int pesoGramos;
    public Animal(String nombreAnimal, int edadAnimal, int duenioAnimalDni, String duenioAnimalNombre, String duenioAnimalDireccion, String sexoAnimal, int pesoGramos) {
        this.nombreAnimal = nombreAnimal;
        this.edadAnimal = edadAnimal;
        this.duenioAnimalDni = duenioAnimalDni;
        this.duenioAnimalNombre = duenioAnimalNombre;
        this.duenioAnimalDireccion = duenioAnimalDireccion;
        this.sexoAnimal = sexoAnimal;
        this.pesoGramos = pesoGramos;
    }
}