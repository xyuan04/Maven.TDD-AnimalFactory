package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        String catName = "Meowy";
        Date catBirthDate = new Date();
        Cat cat = new Cat(catName, catBirthDate, 1);

        cat.setName("MeowyJr");

        String expectedName = "MeowyJr";
        String actualName = cat.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetBirthDate() {
        String catName = "Meowy";
        Date catBirthDate = new Date();
        Cat cat = new Cat(catName, catBirthDate, 1);

        Date newBirthDate = new Date();
        cat.setBirthDate(newBirthDate);

        Date expectedBirthDate = newBirthDate;
        Date actualBirthDate = cat.getBirthDate();

        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void testSpeak() {
        String catName = "Meowy";
        Date catBirthDate = new Date();
        Cat cat = new Cat(catName, catBirthDate, 1);

        String expectedSpeak = "meow!";
        String actualSpeak = cat.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void testEat() {
        String catName = "Meowy";
        Date catBirthDate = new Date();
        Cat cat = new Cat(catName, catBirthDate, 1);
        Food kibbles = new Food("Kibbles");

        cat.eat(kibbles);
        int expectedMeals = 1;
        int actualMeals = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expectedMeals, actualMeals);
    }

    @Test
    public void testFatCatEat() {
        String catName = "Meowy";
        Date catBirthDate = new Date();
        Cat cat = new Cat(catName, catBirthDate, 1);
        Food kibbles = new Food("Kibbles");

        cat.eat(kibbles);
        cat.eat(kibbles);
        cat.eat(kibbles);
        cat.eat(kibbles);
        cat.eat(kibbles);
        int expectedMeals = 5;
        int actualMeals = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expectedMeals, actualMeals);
    }

    @Test
    public void testGetID() {
        String catName = "Meowy";
        Date catBirthDate = new Date();
        Cat cat = new Cat(catName, catBirthDate, 69420);

        int expectedID = 69420;
        int actualID = cat.getId();

        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void testAnimalInterface() {
        String catName = "Meowy";
        Date catBirthDate = new Date();
        Cat cat = new Cat(catName, catBirthDate, 69420);

        boolean expectedInterface = true;
        boolean actualInterface = cat instanceof Animal;

        Assert.assertEquals(expectedInterface, actualInterface);
    }

    @Test
    public void testMammalInheritance() {
        String catName = "Meowy";
        Date catBirthDate = new Date();
        Cat cat = new Cat(catName, catBirthDate, 69420);

        boolean expectedInheritance = true;
        boolean actualInheritance = cat instanceof Mammal;

        Assert.assertEquals(expectedInheritance, actualInheritance);
    }

}
