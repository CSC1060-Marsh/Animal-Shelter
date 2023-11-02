public class Main {
    public static void main(String[] args) {
        AdoptableAnimal[] animals = new AdoptableAnimal[] {
                new Cat("Sunny", "He's an amazing cat, excellent.", 200.52),
                new Cat("Patches", "Old", 150.23),
                new Schnauzer("Zeno", "Funny", 200.23),
                new GermanShepherd("NotArchie", "Not a pig", 203.55)
        };

        for (AdoptableAnimal animal : animals) {
            String animalType;
            if (animal instanceof Cat) {
                animalType = "cat";
            } else {
                animalType = "dog";
            }
            System.out.println("Welcome home your new " + animalType
                    + "\nTheir name is " + animal.getName()
                    + "\nTheir adoption fee is $" + animal.getPrice()
                    + "\nOur staff describes your new pet: " + animal.getDescription());

            if (animal instanceof Dog) {
                System.out.println("Your new dog's breed is " + ((Dog) animal).getBreedName());
            }
            System.out.println();
        }
    }
}