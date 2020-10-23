package org.springframework.samples.petclinic.customers.model;
<<<<<<< HEAD
​import static org.junit.jupiter.api.Assertions.assertEquals;
​import org.junit.jupiter.api.Test;
import java.util.Date;
​public class PetTest {
​    @Test
=======
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Date;
public class PetTest {
    @Test
>>>>>>> 9580bb511c4af9132f12b5c7573fb55418255408
    public void testGetName(){
        //Arrange
        Pet pet = new Pet();
        //Act
        pet.setName("Fluffy");
        //Assert
        assertEquals("Fluffy", pet.getName());
    }
    @Test
    public void testGetOwner(){
        //Arrange
        Pet pet = new Pet();
        Owner owner = new Owner();
        owner.setFirstName("Call");
        //Act
        pet.setOwner(owner);
        //Assert
        assertEquals("Call", pet.getOwner().getFirstName());
    }
    @Test
    public void testBirthDate(){
        //Arrange
        Pet pet = new Pet();
        Date bd = new Date();
        //Act
        pet.setBirthDate(bd);
        //Assert
        assertEquals(bd,pet.getBirthDate());
    }
}
