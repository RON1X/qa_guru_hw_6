package guru.qa;

public class Main {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;
        byte aByte = 77;
        short aShort = Short.MAX_VALUE;
        int aInt = 123456789;
        long aLong = 432123456678L;
        float aFloat = 25.1f;
        double aDouble = 11.2;
        String text = "Hello World";
        char aChar = 'e';

        if (isTrue == true) {
            System.out.println("aByte + aShort = " + (aByte + aShort));
            System.out.println("aShort - aByte = " + (aShort - aByte));
        }

        if (!isTrue == false) {
            System.out.println("aLong / aInt = " + (aLong / aInt));
            System.out.println("aInt % aShort = " + (aInt % aShort));
        }
        if (isTrue != isFalse) {
            System.out.println("aInt + aDouble = " + (aInt + aDouble));
            System.out.println("aInt * aDouble = " + (aInt * aDouble));
            System.out.println("\n");
        }

        System.out.println("Переполнение: " + (byte)(aByte + 100));
        System.out.println("Переполнение: " + (short)(aShort + 1));
        System.out.println("\n");

        System.out.println("isTrue && !isFalse = " + (isTrue && !isFalse));
        System.out.println("isTrue || isFalse = " + (isTrue || isFalse));
        System.out.println("aFloat < aDouble = " + (aFloat < aDouble));
        System.out.println("\n");

        if (aByte < 88 || aLong < 0) {
            System.out.println("Условие выполнено");
        } else {
            System.out.println("Условие не выполнено");
        }
        if (aByte > aShort) {
            System.out.println(aByte + " больше чем "+ aShort);
        }
        else if (aByte < aShort) {
            System.out.println(aByte + " меньше чем "+ aShort);
        }
        System.out.println("\n");

        System.out.println("Позиция буквы " +aChar + " в слове " + text + " - " + (text.indexOf(aChar) + 1));
    }
}