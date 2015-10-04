package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user1; // User (1, Sergio, Morato)

    private User user2; // User (2, Raquel, Díaz González)

    @Before
    public void before() {
        user1 = new User(1, "Sergio", "Morato");
        user2 = new User(2, "Raquel", "Díaz González");
    }

    @Test
    public void getNumber() {
        int name1 = user1.getNumber();
        int name2 = user2.getNumber();
        assertEquals(1, name1);
        assertEquals(2, name2);
    }

    @Test
    public void getNameTest() {
        String name1 = user1.getName();
        String name2 = user2.getName();
        assertEquals("Sergio", name1);
        assertEquals("Raquel", name2);
    }

    @Test
    public void getFamilyNameTest() {
        String familyName1 = user1.getFamilyName();
        String familyName2 = user2.getFamilyName();
        assertEquals("Morato", familyName1);
        assertEquals("Díaz gonzález", familyName2);
    }

    @Test
    public void fullNameTest() {
        String fullName1 = user1.fullName();
        String fullName2 = user2.fullName();
        assertEquals("Sergio Morato", fullName1);
        assertEquals("Raquel Díaz gonzález", fullName2);
    }

    @Test
    public void initials() {
        String initials1 = user1.initials();
        String initials2 = user2.initials();
        assertEquals("S.", initials1);
        assertEquals("R.", initials2);
    }
    
    @Test
    public void setNumberTest() {
        int newNumber = 7;
        user2.setNumber(newNumber);
        assertEquals(user2.getNumber(), newNumber);
    }
    
    @Test
    public void setNameTest() {
        String newName = "NewName";
        user2.setName(newName);
        assertEquals(user2.getName(), newName);
    }
    
    @Test
    public void setFamilyNameTest() {
        String newFamilyName = "NewFamilyName";
        user2.setFamilyName(newFamilyName);
        assertEquals(user2.getFamilyName(), newFamilyName);
    }

}
