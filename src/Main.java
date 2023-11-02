public class Main {
    public static void main(String[] args) {
        //This makes a new array of adoptable animals.
        AdoptableAnimal[] animals = new AdoptableAnimal[]{
                //This adds a cat to the array.
                new Cat("Sunny", "He's an amazing cat, excellent.", 200.52),
                //This adds a cat to the array.
                new Cat("Patches", "Old", 150.23),
                //This adds a schnauzer to the array.
                new Schnauzer("Zeno", "Funny", 200.23),
                //This adds a German shepherd to the array.
                new GermanShepherd("NotArchie", "Not a pig", 203.55)
        };

        //This starts a for loop to give each animal their breed in a string and then print it out.
        for (AdoptableAnimal animal : animals) {
            //This adds a string called animalType.
            String animalType;
            //This does the following if the animal is a cat.
            if (animal instanceof Cat) {
                //This defines animalType as cat.
                animalType = "cat";
                //This does the following if the animal is not a cat.
            } else {
                //This defines animalType as dog.
                animalType = "dog";
            }
            //This prints out the adoption information.
            System.out.println("Welcome home your new " + animalType
                    + "\nTheir name is " + animal.getName()
                    + "\nTheir adoption fee is $" + animal.getPrice()
                    + "\nOur staff describes your new pet: " + animal.getDescription());
            //This does the following if the animal is a dog.
            if (animal instanceof Dog) {
                //This prints out the dog's breed.
                System.out.println("Your new dog's breed is " + ((Dog) animal).getBreedName());
            }
            //This adds a blank line to make it easy for the reader to distinguish between animals.
            System.out.println();
        }
    }
}