package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */

public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {

        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addTest() {
        // given
        String name = "Fidoooo";
        Date bday = new Date();
        Integer defaultId = 1;
        Dog expected = new Dog(name,bday,defaultId);
        Integer id = expected.getId();
        // when
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(id);

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`



    // TODO -
    @Test
    public void removeByDogTest() {
        String name = "Soup";
        Date bday = new Date();
        Integer defaultId = 18;
        // given
        Dog dogToBeAdded = new Dog(name,bday,defaultId);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
       DogHouse.remove(dogToBeAdded);
        Dog retrievedDog =DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);
    }
    @Test
    public void removeDogById() {
        String name = "Soup";
        Date bday = new Date();
        Integer defaultId = 18;
        // given
        Dog dogToBeAdded = new Dog(name,bday,defaultId);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
        DogHouse.remove(id);
        Dog retrievedDog =DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfDogsTest() {

        Dog dog = new Dog(null, null, null);

        int numberOfDogsBeforeAdd = DogHouse.getNumberOfDogs();

        int expected = numberOfDogsBeforeAdd + 1;

        DogHouse.add(dog);


        int actual = DogHouse.getNumberOfDogs();

        // then
        Assert.assertEquals(expected, actual);
    }



    }


