package com.yt100.datastructure.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    RemoveElement removeElement = new RemoveElement();

    @Test
    void removeElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrayUtils.printArray(arr);
        int i = removeElement.removeElement(arr, 1);
        ArrayUtils.printArray(arr);
        System.out.println(i);
    }

    @Test
    void removeElement1() {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7};
        ArrayUtils.printArray(arr);
        int i = removeElement.removeElement(arr, 1);
        ArrayUtils.printArray(arr);
        System.out.println(i);
    }

    @Test
    void removeElement2() {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 1, 1, 1, 1, 1, 1};
        ArrayUtils.printArray(arr);
        int i = removeElement.removeElement(arr, 1);
        ArrayUtils.printArray(arr);
        System.out.println(i);
    }

    @Test
    void removeElement3() {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        ArrayUtils.printArray(arr);
        int i = removeElement.removeElement(arr, 1);
        ArrayUtils.printArray(arr);
        System.out.println(i);
    }

    @Test
    void removeElement4() {
        int[] arr = {2,3,4,5,6,};
        ArrayUtils.printArray(arr);
        int i = removeElement.removeElement(arr, 1);
        ArrayUtils.printArray(arr);
        System.out.println(i);
    }

}