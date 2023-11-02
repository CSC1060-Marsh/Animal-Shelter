public abstract class Dog implements AdoptableAnimal {
    //This adds a protected string of name.
    protected final String name;
    //This adds a protected string of description.
    protected final String description;
    //This adds a protected double of adoptionFee.
    protected final double adoptionFee;

    //This adds a constructor for the dog information.
    public Dog(String name, String description, double adoptionFee) {
        //This defines the name.
        this.name = name;
        //This defines the description.
        this.description = description;
        //This defines the adoption fee.
        this.adoptionFee = adoptionFee;
    }

    //This adds an abstract method to get the breed name.
    public abstract String getBreedName();
}
