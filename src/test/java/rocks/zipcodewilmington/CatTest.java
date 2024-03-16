package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName(){
        // Given
        Cat cat = new Cat(null,null,null);
        String expected = "jack";
        cat.setName(expected);

        //
        String actual = cat.getName();


        // then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        Cat cat = new Cat(null,null, null);
        String expected = "meow!";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);


    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        // Given
        Cat cat = new Cat(null, null, null);
        Date expected = new Date(2011, Calendar.JUNE, 27);

        // When
        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        // Given
        Cat cat = new Cat(null, null, null);
        Food food = new Food();

        // When
        int expected = cat.getNumberOfMealsEaten();
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expected + 1, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        // Given
        int expected = 6789;
        Cat cat = new Cat(null, null, expected);

        // When
        int actual = cat.getId();

        //then
        Assert.assertEquals(expected, actual);


    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        Cat cat = new Cat(null, null, null);


        Assert.assertTrue(cat instanceof Animal);


    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void testMammalInheritance() {
        Cat cat = new Cat(null,null,null);

        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data) EXPECTED
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat) ACTUAL
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
