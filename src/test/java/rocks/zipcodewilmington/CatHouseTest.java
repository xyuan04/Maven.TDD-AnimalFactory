package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAddCat() {
        Date nikitaBirthDate = new Date();
        Cat nikita = AnimalFactory.createCat("Nikita", nikitaBirthDate);

        CatHouse.clear();
        CatHouse.add(nikita);

        int expectedNumber = 1;
        int actualNumber = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testAddMultipleCats() {
        Date nikitaBirthDate = new Date();
        Cat nikita = AnimalFactory.createCat("Nikita", nikitaBirthDate);
        Cat bubbles = AnimalFactory.createCat("Bubbles", nikitaBirthDate);
        Cat redxiii = AnimalFactory.createCat("Red XIII", nikitaBirthDate);
        Cat simba = AnimalFactory.createCat("Simba", nikitaBirthDate);
        Cat salem = AnimalFactory.createCat("Salem", nikitaBirthDate);

        CatHouse.clear();
        CatHouse.add(nikita);
        CatHouse.add(bubbles);
        CatHouse.add(redxiii);
        CatHouse.add(simba);
        CatHouse.add(salem);

        int expectedNumber = 5;
        int actualNumber = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testRemoveCat() {
        Date nikitaBirthDate = new Date();
        Cat nikita = AnimalFactory.createCat("Nikita", nikitaBirthDate);
        Cat bubbles = AnimalFactory.createCat("Bubbles", nikitaBirthDate);
        Cat redxiii = AnimalFactory.createCat("Red XIII", nikitaBirthDate);
        Cat simba = AnimalFactory.createCat("Simba", nikitaBirthDate);
        Cat salem = AnimalFactory.createCat("Salem", nikitaBirthDate);

        CatHouse.clear();
        CatHouse.add(nikita);
        CatHouse.add(bubbles);
        CatHouse.add(redxiii);
        CatHouse.add(simba);
        CatHouse.add(salem);
        CatHouse.remove(bubbles);

        int expectedNumber = 4;
        int actualNumber = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testRemoveMultipleCats() {
        Date nikitaBirthDate = new Date();
        Cat nikita = AnimalFactory.createCat("Nikita", nikitaBirthDate);
        Cat bubbles = AnimalFactory.createCat("Bubbles", nikitaBirthDate);
        Cat redxiii = AnimalFactory.createCat("Red XIII", nikitaBirthDate);
        Cat simba = AnimalFactory.createCat("Simba", nikitaBirthDate);
        Cat salem = AnimalFactory.createCat("Salem", nikitaBirthDate);

        CatHouse.clear();
        CatHouse.add(nikita);
        CatHouse.add(bubbles);
        CatHouse.add(redxiii);
        CatHouse.add(simba);
        CatHouse.add(salem);
        CatHouse.remove(bubbles);
        CatHouse.remove(salem);
        CatHouse.remove(simba);

        int expectedNumber = 2;
        int actualNumber = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testRemoveCatByID() {
        String catName = "Nikita";
        Date catBirthDate = new Date();
        Cat nikita = new Cat(catName, catBirthDate, 69420);

        String cat2Name = "Red XII";
        Date cat2BirthDate = new Date();
        Cat redxiii = new Cat(cat2Name, cat2BirthDate, 13);

        String cat3Name = "Bubbles";
        Date cat3BirthDate = new Date();
        Cat bubbles = new Cat(cat3Name, cat3BirthDate, 99);

        CatHouse.clear();
        CatHouse.add(nikita);
        CatHouse.add(redxiii);
        CatHouse.add(bubbles);
        CatHouse.remove(99);

        int expectedNumber = 2;
        int actualNumber = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void testGetCatByID() {
        String catName = "Nikita";
        Date catBirthDate = new Date();
        Cat nikita = new Cat(catName, catBirthDate, 69420);

        String cat2Name = "Red XII";
        Date cat2BirthDate = new Date();
        Cat redxiii = new Cat(cat2Name, cat2BirthDate, 13);

        String cat3Name = "Bubbles";
        Date cat3BirthDate = new Date();
        Cat bubbles = new Cat(cat3Name, cat3BirthDate, 99);

        CatHouse.clear();
        CatHouse.add(nikita);
        CatHouse.add(redxiii);
        CatHouse.add(bubbles);

        Cat expectedCat = nikita;
        Cat actualCat = CatHouse.getCatById(69420);

        Assert.assertEquals(expectedCat, actualCat);
    }

    @Test
    public void testGetNumberOfCats() {
        Date nikitaBirthDate = new Date();
        Cat nikita = AnimalFactory.createCat("Nikita", nikitaBirthDate);
        Cat bubbles = AnimalFactory.createCat("Bubbles", nikitaBirthDate);
        Cat redxiii = AnimalFactory.createCat("Red XIII", nikitaBirthDate);
        Cat simba = AnimalFactory.createCat("Simba", nikitaBirthDate);
        Cat salem = AnimalFactory.createCat("Salem", nikitaBirthDate);
        Cat steve = AnimalFactory.createCat("Steve", nikitaBirthDate);
        Cat curry = AnimalFactory.createCat("Curry", nikitaBirthDate);
        Cat kitty = AnimalFactory.createCat("Kitty", nikitaBirthDate);
        Cat helen = AnimalFactory.createCat("helen", nikitaBirthDate);
        Cat meow = AnimalFactory.createCat("Meow", nikitaBirthDate);

        CatHouse.clear();
        CatHouse.add(nikita);
        CatHouse.add(bubbles);
        CatHouse.add(redxiii);
        CatHouse.add(simba);
        CatHouse.add(steve);
        CatHouse.add(curry);
        CatHouse.add(kitty);
        CatHouse.add(helen);
        CatHouse.add(meow);
        CatHouse.add(salem);
        CatHouse.remove(bubbles);
        CatHouse.remove(salem);
        CatHouse.remove(simba);

        int expectedNumber = 7;
        int actualNumber = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumber, actualNumber);
    }

}
