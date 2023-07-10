package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        Integer expectedWeight = Integer.MAX_VALUE;
        Double expectedHeight = Double.MAX_VALUE;
        Boolean expectedGender = true;
        String expectedState = "";
        Integer expectedZipcode = Integer.MAX_VALUE;


        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Integer actualWeight = person.getWeight();
        Double actualHeight = person.getHeight();
        Boolean actualGender = person.getGender();
        String actualState = person.getState();
        Integer actualZipcode = person.getZipcode();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedHeight,actualHeight);
        Assert.assertEquals(expectedGender,actualGender);
        Assert.assertEquals(expectedState,actualState);
        Assert.assertEquals(expectedZipcode,actualZipcode);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 100;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithWeight() {
        // Given
        Integer expected = 120;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";



        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testConstructorWithWeightAndHeight() {
        // Given
        Integer expectedWeight = 120;
        Double expectedHeight = 54.5;


        // When
        Person person = new Person(expectedWeight, expectedHeight);

        // Then
        Integer actualWeight = person.getWeight();
        Double actualHeight = person.getHeight();

        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedHeight, actualHeight);
    }
    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Integer expected = 120;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }
}
