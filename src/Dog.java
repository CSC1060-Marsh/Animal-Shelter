public abstract class Dog implements AdoptableAnimal {
    protected final String name;
    protected final String description;
    protected final double adoptionFee;
    public Dog(String name, String description, double adoptionFee) {
        this.name = name;
        this.description = description;
        this.adoptionFee = adoptionFee;
    }

    public abstract String getBreedName();
}
