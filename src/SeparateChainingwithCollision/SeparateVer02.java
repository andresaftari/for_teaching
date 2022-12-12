package SeparateChainingwithCollision;

import java.util.LinkedList;

public class SeparateVer02 {
    private static final String[] array = new String[13];
    private final int arraySize = array.length;

    public static void main(String[] args) {
        SeparateVer02 separate = new SeparateVer02();
        String[] elementToAdd = {"3", "27", "41", "13", "6", "51", "9", "45", "21", "14", "8"};

        separate.seperateFunction(elementToAdd, array);
    }

    private void seperateFunction(String[] element, String[] theArray) {
        LinkedList<String> linkedList = new LinkedList<>();

        for (String elementVal : element) {
            int arrayIndex = elementVal.hashCode() % 13;
            if (theArray[arrayIndex] != null) {
                linkedList.add(theArray[arrayIndex]);
            }

            linkedList.add(elementVal);
            String allElementVal = linkedList.toString();

            allElementVal = allElementVal.replaceAll("\\[", "").replaceAll("]", "")
                    .replaceAll(",", "");

            theArray[arrayIndex] = allElementVal;
            linkedList.clear();
        }

        int index = 0;
        for (String value : theArray) {
            System.out.println(index + " : " + value);
            index++;
        }
    }
}
