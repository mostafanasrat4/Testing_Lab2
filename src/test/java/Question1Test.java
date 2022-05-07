import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;


public class Question1Test {

    Question1 obj = new Question1();
    ArrayList<Integer> array = new ArrayList<Integer>();
    Random rand = new Random();

    @Nested
    class Even{

        @Test
        public void EvenTest1(){
            assertEquals(obj.isEven(0),true);
        }

        @Test
        public void EvenTest2(){
            assertEquals(obj.isEven(-1),false);
        }

        @Test
        public void EvenTest3(){
            assertEquals(obj.isEven(-16),true);
        }

        @Test
        public void EvenTest4(){
            assertEquals(obj.isEven(99),false);
        }

        @Test
        public void EvenTest5(){
            assertEquals(obj.isEven(15125156),true);
        }

        @Test
        public void EvenTest6(){
            assertEquals(obj.isEven(48468869),false);
        }
    }

    @Nested
    class Odd{

        @Test
        public void OddTest1(){
            assertEquals(obj.isOdd(0),false);
        }

        @Test
        public void OddTest2(){
            assertEquals(obj.isOdd(-10),false);
        }

        @Test
        public void OddTest3(){
            assertEquals(obj.isOdd(15),true);
        }

        @Test
        public void OddTest4(){
            assertEquals(obj.isOdd(68),false);
        }

        @Test
        public void OddTest5(){
            assertEquals(obj.isOdd(64545358),false);
        }
    }




    @Nested
    class Maximum{
        @AfterEach
        public void after(){
            array.clear();
        }

        @Test
        public void EmptyArray(){
            assertEquals(obj.max(array), null);
        }

        @Test
        public void MaxTest1(){
            array.add(45);
            assertEquals(obj.max(array),45);
        }

        @Test
        public void MaxTest2(){
            for(int i = 1; i < 100; i++){
                array.add(rand.nextInt());
            }
            assertEquals(obj.max(array), Collections.max(array));
        }

        @Test
        public void MaxTest3(){
            for(int i = -500; i <= 500; i+=10){
                array.add(i);
            }
            assertEquals(obj.max(array), 500);
        }


    }

    @Nested
    class Minimum{
        @AfterEach
        public void after(){
            array.clear();
        }

        @Test
        public void EmptyArray(){
            assertEquals(obj.min(array), null);
        }

        @Test
        public void MinTest1(){
            array.add(45);
            assertEquals(obj.min(array),45);
        }

        @Test
        public void MinTest2(){
            for(int i = 1; i < 100; i++){
                array.add(rand.nextInt());
            }
            assertEquals(obj.min(array), Collections.min(array));
        }

        @Test
        public void MinTest3(){
            for(int i = -500; i <= 500; i+=10){
                array.add(i);
            }
            assertEquals(obj.min(array), -500);
        }


    }
}