package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */


public class CatHouseTest {

    @Before
    public void init() {
        CatHouse testCatHouse = new CatHouse();
    }
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        // given
        String name = "FluffyPoofyMcpoferson";
        Date bday = new Date();
        Integer defaultId = 1;
        Cat expected = new Cat(name,bday,defaultId);
        Integer id = expected.getId();


        // when
        CatHouse.add(expected);
        Cat actual = CatHouse.getCatById(id);

        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeCatTest2(){
        Cat catToBeAdded = new Cat(null, null, 0);
        CatHouse.add(catToBeAdded);
        Integer id = catToBeAdded.getId();

        // when
        CatHouse.remove(id);
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);
    }


    // TODO - Create tests for `void remove(Integer id)`




    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByCatTest() {
        // given
        Cat catToBeAdded = new Cat(null, null, 0);
        CatHouse.add(catToBeAdded);
        Integer id = catToBeAdded.getId();

        // when
        CatHouse.remove(catToBeAdded);
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        // given there is a cat to be added
        Cat cat = new Cat();

        // given that I count number of cats before add
        int numberOfCatsBeforeAdd = CatHouse.getNumberOfCats();

        // given that I add one cat, my expected should be numberOfCatsBeforeAdd + 1
        int expected = numberOfCatsBeforeAdd + 1;

        // given that I have added a cat
        CatHouse.add(cat);

        // when I get the number of cats after the add
        int actual = CatHouse.getNumberOfCats();

        // then
        Assert.assertEquals(expected, actual);

    }
}
