package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
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
    @Test
    public void testSetBirthDate() {
        // Given
        Dog dog  = new Dog(null, null, null);
        Date expected = new Date(2011, Calendar.JUNE, 27);

        // When
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        // Given
        Dog dog = new Dog(null, null, null);
        Food food = new Food();

        // When
        int expected = dog.getNumberOfMealsEaten();
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected + 1, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        // Given
        int expected = 6789;
        Dog dog  = new Dog(null, null, expected);

        // When
        int actual = dog.getId();

        //then
        Assert.assertEquals(expected, actual);


    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        Dog dog = new Dog(null, null, null);


        Assert.assertTrue(dog instanceof Animal);


    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance() {
        Dog dog = new Dog(null, null, null);


        Assert.assertTrue(dog instanceof Mammal);


    }

}
