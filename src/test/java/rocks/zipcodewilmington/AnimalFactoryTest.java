package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        Date lunaBirthDate = new Date();
        Date charmingBirthDate = new Date();

        Dog luna = AnimalFactory.createDog("Luna", lunaBirthDate);
        Dog charming = AnimalFactory.createDog("Charming", charmingBirthDate);

        String expectedLunaName = "Luna";
        String expectedCharmingName = "Charming";
        String actualLunaName = luna.getName();
        String actualCharmingName = charming.getName();

        Date expectedLunaBirthDate = lunaBirthDate;
        Date expectedCharmingBirthDate = charmingBirthDate;
        Date actualLunaBirthDate = luna.getBirthDate();
        Date actualCharmingBirthDate = charming.getBirthDate();

        Assert.assertEquals(expectedLunaName, actualLunaName);
        Assert.assertEquals(expectedLunaBirthDate, actualLunaBirthDate);
        Assert.assertEquals(expectedCharmingName, actualCharmingName);
        Assert.assertEquals(expectedCharmingBirthDate, actualCharmingBirthDate);
    }

    @Test
    public void testCreateCat() {
        Date nikitaBirthDate = new Date();

        Cat nikita = AnimalFactory.createCat("Nikita", nikitaBirthDate);

        String expectedName = "Nikita";
        String actualName = nikita.getName();

        Date expectedBirthDate = nikitaBirthDate;
        Date actualBirthDate = nikita.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }
}
