package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void testAddDog() {
        DogHouse doghouse = new DogHouse();
        Dog dog = new Dog(null,null,null);
        int expectedDogs = doghouse.getNumberOfDogs();
        doghouse.add(dog);

        int actualDogs = doghouse.getNumberOfDogs();

        Assert.assertEquals(expectedDogs + 1, actualDogs);
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testRemoveIntegerId() {
        DogHouse doghouse = new DogHouse();
        Integer id = 9999;
        Dog dog = new Dog(null,null,id);
        doghouse.add(dog);
        int expectedDogId = doghouse.getNumberOfDogs();
        doghouse.remove(id);
        int actualDogId = doghouse.getNumberOfDogs();

        Assert.assertEquals(expectedDogId - 1, actualDogId);
        doghouse.clear();

    }

    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void testRemoveDog() {
        DogHouse doghouse = new DogHouse();
        Dog dog = new Dog(null, null, null);
        doghouse.add(dog);
        int expectedDogs = doghouse.getNumberOfDogs();
        doghouse.remove(dog);
        int actualDogs = doghouse.getNumberOfDogs();

        Assert.assertEquals(expectedDogs -1 , actualDogs );
        doghouse.clear();
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById() {
        DogHouse doghouse = new DogHouse();
        Integer id = 778394;
        Dog dog = new Dog(null,null,id);
        doghouse.add(dog);

        Assert.assertEquals(dog, doghouse.getDogById(id));
        doghouse.clear();
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @Test
    public void testGetNumberOfDogs() {
        DogHouse doghouse = new DogHouse();
        Dog dog = new Dog(null,null,null);
        int expected = DogHouse.getNumberOfDogs();

        doghouse.add(dog);

        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected + 1, actual);
        doghouse.clear();
    }

}
