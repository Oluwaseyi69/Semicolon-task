//package tdd;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//public class Mp3PlayerTest {
//    @Test
//    public void turnOnTest(){
//        Mp3Player sony = new Mp3Player();
//        boolean status = sony.getTurnOn();
//        assertFalse(status);
//        sony.setTurnOn(true);
//        boolean newStatus = sony.getTurnOn();
//        assertTrue(newStatus);
//    }
//    @Test
//    public void turnOffTest(){
//        Mp3Player sony = new Mp3Player();
//        sony.setTurnOn(true);
//        boolean status = sony.getTurnOn();
//        assertTrue(status);
//        sony.setTurnOn(false);
//        boolean newStatus = sony.getTurnOn();
//        assertFalse(newStatus);
//    }
//    @Test
//    public void playASong(){
//        Mp3Player myPlayer = new Mp3Player();
//        boolean status = myPlayer.getPlay();
//        assertTrue(status);
//        myPlayer.setPause();
//        boolean newStatus = myPlayer.getPlay();
//        assertTrue(newStatus);
//    }
//    @Test
//    public void pauseASong(){
//        Mp3Player myPlayer = new Mp3Player();
//        boolean status = myPlayer.getPlay();
//        assertTrue(status);
//        myPlayer.setPause();
//        boolean newStatus = myPlayer.setPause();
//        assertTrue(newStatus);
//
//    }
//    @Test
//    public void nextSong(){
//        Mp3Player myPlayer = new Mp3Player();
//        boolean status = myPlayer.getPlay();
//        assertTrue(status);
//        myPlayer.setNext(true);
//        boolean newStatus = myPlayer.getNext();
//        assertTrue(newStatus);
//    }
//    @Test
//    public void previousSong(){
//        Mp3Player myPlayer = new Mp3Player();
//        boolean status = myPlayer.getNext();
//        assertFalse(status);
//        myPlayer.setPrevious(true);
//        boolean newStatus = myPlayer.getPrevious();
//        assertTrue(newStatus);
//    }
//    @Test
//    public void increaseVolume(){
//        Mp3Player myPlayer = new Mp3Player();
//        myPlayer.setVolume(10);
//        assertEquals(10, myPlayer.getVolume());
//        myPlayer.increaseVolume();
//        assertEquals(11, myPlayer.getVolume());
//        myPlayer.increaseVolume();
//        assertEquals(12, myPlayer.getVolume());
//    }
//    @Test
//    public void decreaseVolume(){
//        Mp3Player myPlayer = new Mp3Player();
//        myPlayer.setVolume(10);
//        assertEquals(10, myPlayer.getVolume());
//        myPlayer.decreaseVolume();
//        assertEquals(9, myPlayer.getVolume());
//
//    }
//
//}
//
