package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
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

    @Test
    public void testSetName() {
        String dogName = "Luna";
        Date dogBirthDate = new Date();
        int dogID = 1;

        Dog dog = new Dog(dogName, dogBirthDate, dogID);

        dog.setName("Charming");

        String expectedName = "Charming";
        String actualName = dog.getName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testBirthDate() {
        String dogName = "Luna";
        Date dogBirthDate = new Date();
        int dogID = 2;

        Dog dog = new Dog(dogName, dogBirthDate, dogID);

        Date newDogBirthDate = new Date();

        Date expectedBirthDate = newDogBirthDate;
        Date actualBirthDate = dog.getBirthDate();

        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void testSpeak() {
        String dogName = "Luna";
        Date dogBirthDate = new Date();
        int dogID = 3;

        Dog dog = new Dog(dogName, dogBirthDate, dogID);

        String expectedSpeak = "bark!";
        String actualSpeak = dog.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);
    }

    @Test
    public void testEat() {
        String dogName = "Luna";
        Date dogBirthDate = new Date();
        int dogID = 4;

        Dog dog = new Dog(dogName, dogBirthDate, dogID);
        Food dogFood = new Food("Pedigree");

        dog.eat(dogFood);

        int expectedMeals = 1;
        int actualMeals = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expectedMeals, actualMeals);
    }

    @Test
    public void testFatDogEat() {
        String dogName = "Luna";
        Date dogBirthDate = new Date();
        int dogID = 5;

        Dog dog = new Dog(dogName, dogBirthDate, dogID);
        Food dogFood1 = new Food("Spicy Chicken");
        Food dogFood2 = new Food("Cheeseburgers");
        Food dogFood3 = new Food("Pedigree");

        dog.eat(dogFood1);
        dog.eat(dogFood2);
        dog.eat(dogFood3);
        dog.eat(dogFood1);
        dog.eat(dogFood1);
        dog.eat(dogFood3);
        dog.eat(dogFood3);

        int expectedMeals = 7;
        int actualMeals = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expectedMeals, actualMeals);
    }

    @Test
    public void testGetID() {
        String dogName = "Luna";
        Date dogBirthDate = new Date();
        int dogID = 6;

        Dog dog = new Dog(dogName, dogBirthDate, dogID);

        int expectedID = 6;
        int actualID = dog.getId();

        Assert.assertEquals(expectedID, actualID);
    }

    @Test
    public void testAnimalInterface() {
        String dogName = "Luna";
        Date dogBirthDate = new Date();
        int dogID = 7;

        Dog dog = new Dog(dogName, dogBirthDate, dogID);

        boolean expectedInterface = true;
        boolean actualInterface = dog instanceof Animal;

        Assert.assertEquals(expectedInterface, actualInterface);
    }

    @Test
    public void testMammalInheritance() {
        String dogName = "Luna";
        Date dogBirthDate = new Date();
        int dogID = 8;

        Dog dog = new Dog(dogName, dogBirthDate, dogID);

        boolean expectedInheritance = true;
        boolean actualInheritance = dog instanceof Mammal;

        Assert.assertEquals(expectedInheritance, actualInheritance);
    }
}
