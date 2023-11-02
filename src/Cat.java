public class Cat implements AdoptableAnimal {
    //This defines a name string.
    private final String name;
    //This defines a description string.
    private final String description;
    //This defines an adoption fee double.
    private final double adoptionFee;

    //This adds a constructor to define the above variables.
    public Cat(String name, String description, double adoptionFee) {
        //This defines the name.
        this.name = name;
        //This defines the description.
        this.description = description;
        //This defines the adoption fee.
        this.adoptionFee = adoptionFee;
    }

    //This returns name to the getName string in AdoptableAnimal.
    @Override
    public String getName() {
        return name;
    }

    //This returns description to the getDescription string in AdoptableAnimal.
    @Override
    public String getDescription() {
        return description;
    }

    //This returns adoptionFee to the getPrice double in AdoptableAnimal.
    @Override
    public double getPrice() {
        return adoptionFee;
    }
}
