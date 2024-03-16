package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testNewDog(){
        String exName = "Spot";
        Date exDate = new Date(06/20/11);
        Integer exId = 911;
        Dog dog = new Dog(exName,exDate,exId);

        String actual = dog.getName();
        Date actual2 = dog.getBirthDate();
        Integer actual3 = dog.getId();

        Assert.assertEquals(exName, actual);
        Assert.assertEquals(exDate, actual2);
        Assert.assertEquals(exId, actual3);

    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
