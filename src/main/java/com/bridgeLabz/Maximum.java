package com.bridgeLabz;

public class Maximum<E extends Comparable> {

    E[] inputArray;
    public Maximum(E[] inputArray) {
        this.inputArray = inputArray;
    }

    public E findMaximum() {
        E result = findMaximum(inputArray);
        return result;
    }
    public static <E extends Comparable> E findMaximum(E[] inputArray) {
        E max = inputArray[0];
        for (E element : inputArray) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

}