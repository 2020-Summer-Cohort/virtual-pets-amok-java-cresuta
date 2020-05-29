package pets_amok;

import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    @Test
    public void createVirtualPet() {
        VirtualPet underTest = new VirtualPet("Mya", "a lovable golden retreiver");
    }

//    @Test
//    public void getName(){
//        VirtualPet underTest = new VirtualPet("Mya", "a lovable golden retreiver");
//        String result = underTest.getName();
//    }
}
