package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    Dog dog = new Dog(null, null, null);
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)

        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }



    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        String expected = "bark!";

        // when
        String actual = dog.speak();

        // then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // given
        Date expected = new Date();

        // when
        dog.setBirthDate(expected);

        // then
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        // given
        Food food = new Food();
        int initialMealsEaten = dog.getNumberOfMealsEaten();
        int expected = initialMealsEaten + 1;


        // when
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void implementTest() {
        // given
        Dog myDog = new Dog(null,null,null);
        // when
        boolean outcome = myDog instanceof Animal;

        // then
        Assert.assertTrue(outcome);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceTest() {
        // given
        Dog myDog = new Dog(null,null,null);

        // when
        boolean outcome = myDog instanceof Mammal;

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Wooferson";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        // When (a cat is constructed)
        Dog myDog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = myDog.getName();
        Date retrievedBirthDate = myDog.getBirthDate();
        Integer retrievedId = myDog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName); //
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void getIdTest(){
        String givenName = "Sparky";
        Date givenBirthDate = new Date();
        Integer givenId = 11;
        Dog myDog = new Dog(givenName,givenBirthDate,givenId);

        Integer retrievedId = myDog.getId();

        Assert.assertEquals(givenId,retrievedId);

    }

}



