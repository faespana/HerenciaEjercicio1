package animalapp;

import animalapp.entities.Animal;
import animalapp.entities.Caballo;
import animalapp.entities.Gato;
import animalapp.entities.Perro;
import java.util.ArrayList;

public class AnimalAPP {

    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList();

        Animal dog1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        dog1.Alimentarse();

        Animal dog2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        dog2.Alimentarse();

        Animal cat = new Gato("Pelusa", "Galletas", 15, "Siamés");
        cat.Alimentarse();

        Animal horse = new Caballo("Spark", "Pasto", 25, "Fino");
        horse.Alimentarse();

        animales.add(dog1);
        animales.add(dog2);
        animales.add(cat);
        animales.add(horse);

        System.out.println("");

        for (Animal aux : animales) {

            if (aux instanceof Caballo) {
                Caballo object = (Caballo) aux;
                System.out.println("Soy un caballo");
                continue;

            }

            if (aux instanceof Gato) {
                Gato object = (Gato) aux;
                System.out.println("Soy un gato");
                continue;

            }
            
            if (aux instanceof Perro) {
                Perro object = (Perro) aux;
                System.out.println("Soy un perro");
            }
        }
    }

}
