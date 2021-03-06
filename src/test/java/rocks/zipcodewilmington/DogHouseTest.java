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
    public void testAddDog() {
        Date lunaBirthDate = new Date();
        Dog luna = AnimalFactory.createDog("Luna", lunaBirthDate);

        DogHouse.clear();
        DogHouse.add(luna);

        int expectedNumber = 1;
        int actualNumber = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testAddMultipleDogs() {
        Date lunaBirthDate = new Date();
        Dog luna = AnimalFactory.createDog("Luna", lunaBirthDate);
        Dog charming = AnimalFactory.createDog("Charming", lunaBirthDate);
        Dog entei = AnimalFactory.createDog("Entei", lunaBirthDate);
        Dog suicune = AnimalFactory.createDog("Suicune", lunaBirthDate);
        Dog raikou = AnimalFactory.createDog("Raikou", lunaBirthDate);

        DogHouse.clear();
        DogHouse.add(luna);
        DogHouse.add(charming);
        DogHouse.add(entei);
        DogHouse.add(suicune);
        DogHouse.add(raikou);

        int expectedNumber = 5;
        int actualNumber = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testRemoveDog() {
        Date lunaBirthDate = new Date();
        Dog luna = AnimalFactory.createDog("Luna", lunaBirthDate);
        Dog charming = AnimalFactory.createDog("Charming", lunaBirthDate);
        Dog entei = AnimalFactory.createDog("Entei", lunaBirthDate);
        Dog suicune = AnimalFactory.createDog("Suicune", lunaBirthDate);
        Dog raikou = AnimalFactory.createDog("Raikou", lunaBirthDate);

        DogHouse.clear();
        DogHouse.add(luna);
        DogHouse.add(charming);
        DogHouse.add(entei);
        DogHouse.add(suicune);
        DogHouse.add(raikou);
        DogHouse.remove(raikou);

        int expectedNumber = 4;
        int actualNumber = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testRemoveMultipleDogs() {
        Date lunaBirthDate = new Date();
        Dog luna = AnimalFactory.createDog("Luna", lunaBirthDate);
        Dog charming = AnimalFactory.createDog("Charming", lunaBirthDate);
        Dog entei = AnimalFactory.createDog("Entei", lunaBirthDate);
        Dog suicune = AnimalFactory.createDog("Suicune", lunaBirthDate);
        Dog raikou = AnimalFactory.createDog("Raikou", lunaBirthDate);

        DogHouse.clear();
        DogHouse.add(luna);
        DogHouse.add(charming);
        DogHouse.add(entei);
        DogHouse.add(suicune);
        DogHouse.add(raikou);
        DogHouse.remove(raikou);
        DogHouse.remove(suicune);
        DogHouse.remove(entei);

        int expectedNumber = 2;
        int actualNumber = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testRemoveDogByID() {
        String dogName = "Luna";
        Date dogBirthDate = new Date();
        Dog luna = new Dog(dogName, dogBirthDate, 69420);

        String dog2Name = "Charming";
        Date dog2BirthDate = new Date();
        Dog charming = new Dog(dog2Name, dog2BirthDate, 27);

        String dog3Name = "Winston";
        Date dog3BirthDate = new Date();
        Dog winston = new Dog(dog3Name, dog3BirthDate, 15);

        DogHouse.clear();
        DogHouse.add(luna);
        DogHouse.add(charming);
        DogHouse.add(winston);
        DogHouse.remove(27);

        int expectedNumber = 2;
        int actualNumber = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testGetDogByID() {
        String dogName = "Luna";
        Date dogBirthDate = new Date();
        Dog luna = new Dog(dogName, dogBirthDate, 69420);

        String dog2Name = "Charming";
        Date dog2BirthDate = new Date();
        Dog charming = new Dog(dog2Name, dog2BirthDate, 27);

        String dog3Name = "Winston";
        Date dog3BirthDate = new Date();
        Dog winston = new Dog(dog3Name, dog3BirthDate, 15);

        DogHouse.clear();
        DogHouse.add(luna);
        DogHouse.add(charming);
        DogHouse.add(winston);

        Dog expectedDog = luna;
        Dog actualDog = DogHouse.getDogById(69420);

        Assert.assertEquals(expectedDog, actualDog);
    }

    @Test
    public void testGetNumberOfDogsAgain() {
        Date lunaBirthDate = new Date();
        Dog luna = AnimalFactory.createDog("Luna", lunaBirthDate);
        Dog charming = AnimalFactory.createDog("Charming", lunaBirthDate);
        Dog winston = AnimalFactory.createDog("Winston", lunaBirthDate);
        Dog bao = AnimalFactory.createDog("Bao", lunaBirthDate);
        Dog nova = AnimalFactory.createDog("Nova", lunaBirthDate);
        Dog bella = AnimalFactory.createDog("bella", lunaBirthDate);
        Dog chula = AnimalFactory.createDog("Chula", lunaBirthDate);
        Dog entei = AnimalFactory.createDog("Entei", lunaBirthDate);
        Dog suicune = AnimalFactory.createDog("Suicune", lunaBirthDate);
        Dog raikou = AnimalFactory.createDog("Raikou", lunaBirthDate);

        DogHouse.clear();
        DogHouse.add(luna);
        DogHouse.add(charming);
        DogHouse.add(winston);
        DogHouse.add(bao);
        DogHouse.add(nova);
        DogHouse.add(bella);
        DogHouse.add(chula);
        DogHouse.add(entei);
        DogHouse.add(suicune);
        DogHouse.add(raikou);
        DogHouse.remove(raikou);
        DogHouse.remove(suicune);
        DogHouse.remove(entei);

        int expectedNumber = 7;
        int actualNumber = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumber, actualNumber);
    }
}
