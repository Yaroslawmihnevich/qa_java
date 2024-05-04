package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

public class LionTest {
    @Mock
    Feline feline = new Feline();

    @Test
    public void setMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void setFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testException() throws Exception {
        Throwable ex = Assert.assertThrows(
                new Exception("Используйте допустимые значения пола животного - самец или самка").getClass(),
                ()->{Lion lion = new Lion("abcd", feline);}
        );
    }
    public void EatMeat() throws Exception {
        Assert.assertEquals((new Lion("Самец", feline)).getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
    @Test
    public void Kittens() throws Exception {
        int kittens = (new Lion("Самец", feline)).getKittens();
        Assert.assertEquals(1, kittens);
    }
}
