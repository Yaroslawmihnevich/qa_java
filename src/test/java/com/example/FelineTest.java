package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

public class FelineTest {
    @Mock
    Feline feline = new Feline();
    @Test
    public void Family() {
        String family = feline.getFamily();
        Assert.assertEquals("Кошачьи", family);
    }
    @Test
    public void Kittens() {
        int kittens = feline.getKittens();
        Assert.assertEquals(1, kittens);
    }
    @Test
    public void KittensWithParam() {
        int countKittens = 2;
        int kittens = feline.getKittens(countKittens);
        Assert.assertEquals(countKittens, kittens);
    }
    @Test
    public void EatMeat() throws Exception {
        Assert.assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }
}
