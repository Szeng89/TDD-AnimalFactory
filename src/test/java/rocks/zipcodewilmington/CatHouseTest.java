package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void testAddCat() {
        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat(null, null ,null);
        int expectedHowManyCatWeHave = cathouse.getNumberOfCats(); //0
        cathouse.add(cat); //1

        int actualHowManyCatWeHave = cathouse.getNumberOfCats();

        Assert.assertEquals(expectedHowManyCatWeHave + 1, actualHowManyCatWeHave);

    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testRemoveIntegerId() {
        CatHouse cathouse = new CatHouse();
        Integer id = 6789;
        Cat cat = new Cat(null,null,id);
        cathouse.add(cat);
        int expectedHowManyCatsWeHave = cathouse.getNumberOfCats();

        cathouse.remove(id);

        int actualHowManyCatsWeHave = cathouse.getNumberOfCats();

        Assert.assertEquals(expectedHowManyCatsWeHave - 1, actualHowManyCatsWeHave);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat() {
        CatHouse cathouse = new CatHouse();
        Cat cat = new Cat(null,null,null);
        cathouse.add(cat);
        int howMany = cathouse.getNumberOfCats();

        cathouse.remove(cat);

        int actualHowMany = cathouse.getNumberOfCats();

        Assert.assertEquals(howMany - 1 ,actualHowMany);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
