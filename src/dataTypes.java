public class dataTypes {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+ myMinIntValue);
        System.out.println("Integer Maximum Value = "+ myMaxIntValue);
        System.out.println("Busted Max Value = "+ myMaxIntValue+1);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = "+ myMinByteValue);
        System.out.println("Byte Minimum Value = "+ myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = "+ myMinShortValue);
        System.out.println("Short Minimum Value = "+ myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("MY Long Value = " + myLongValue);
        System.out.println("Long Minimum Value = "+ myMinLongValue);
        System.out.println("Long Minimum Value = "+ myMaxLongValue);


        float myFloatMinNumber = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value ="+ myFloatMinNumber);
        System.out.println("Float Max Value ="+ myFloatMaxValue);

        double myDoubleMinNumber = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value ="+ myDoubleMinNumber);
        System.out.println("Double Max Value ="+ myDoubleMaxValue);



    }
}
