package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
public class CatTest {
    Feline feline = new Feline();
    @Mock
    Cat cat = new Cat(feline);
    @Test
    public void Sound() {
        Assert.assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void EatMeat() throws Exception {
        Assert.assertEquals(cat.getFood(), List.of("Животные", "Птицы", "Рыба"));
    }
}
