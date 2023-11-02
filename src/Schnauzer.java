public class Schnauzer extends Dog{

    public Schnauzer(String name, String description, double adoptionFee) {
        super(name, description, adoptionFee);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return adoptionFee;
    }

    @Override
    public String getBreedName() {
        return "Schnauzer";
    }
}
