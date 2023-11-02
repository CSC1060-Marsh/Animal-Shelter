public class Schnauzer extends Dog{
    //This adds a constructor for name, description, and adoption fee.
    public Schnauzer(String name, String description, double adoptionFee) {
        //This loads in the name, description, and adoption fee from dog.
        super(name, description, adoptionFee);
    }

    //This returns the name to the getName string in AdoptableAnimal.
    @Override
    public String getName() {return name;}

    //this returns the description to the getDescription string in AdoptableAnimal.
    @Override
    public String getDescription() {return description;}

    //This returns the adoption fee to the getPrice double in AdoptableAnimal.
    @Override
    public double getPrice() {
        return adoptionFee;
    }

    //This returns Schnauzer to the getBreedName method in the dog class.
    @Override
    public String getBreedName() {
        return "Schnauzer";
    }
}
