public class Cat implements AdoptableAnimal {
    private final String name;
    private final String description;
    private final double adoptionFee;
    public Cat(String name, String description, double adoptionFee) {
        this.name = name;
        this.description = description;
        this.adoptionFee = adoptionFee;
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
}
