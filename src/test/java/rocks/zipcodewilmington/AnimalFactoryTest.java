package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        AnimalFactory animalFactory = new AnimalFactory();
        String expectedName = "dumbo";
        Date expectedBirthDate = new Date(11/30/23);

        Dog dog = animalFactory.createDog(expectedName, expectedBirthDate);

        Assert.assertEquals(expectedName, dog.getName());
        Assert.assertEquals(expectedBirthDate, dog.getBirthDate());


    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateCat() {
        AnimalFactory af = new AnimalFactory();
        String exName = "Butters";
        Date exDate = new Date(07/29/2011);

        Cat cat = af.createCat(exName, exDate);

        Assert.assertEquals(exName, cat.getName());
        Assert.assertEquals(exDate, cat.getBirthDate());


    }
}
