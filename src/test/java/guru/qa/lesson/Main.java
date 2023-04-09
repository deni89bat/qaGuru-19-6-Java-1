package guru.qa.lesson;

import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        //Примитивные типы данных - 8шт.

        //1.Целочисленные типы данных
        byte varByte = 10;      //  8bit    -128 ... 127                                                2^(bits-1) 2^7
        short varShort = 10;    //  16bit   -32768 ... 32767                                                       2^15
        int varInt = 10;        //*  32bit   -2 147 483 648 ... 2 147 483 647                                       2^31
        long varLong = 10;      //  64bit   -9 223 372 036 854 775 808 ... 9 223 372 036 854 775 807               2^63

        //2. Числа с плавающей точкой
        float varFloat = 1.88F; //  32bit
        double varDouble = 1.88;//*  64bit

        //3. символьный тип
        char varChar = 'b';
        //4. логический тип *
        boolean varBoolean = true;


        // Ссылочные типы(объектные типы) - бесконечное кол-во классов
        //
        String s = "Hello"; // является классом

        Phone pixel = new Phone();



                System.out.println(varFloat);
        System.out.println("дабл" + varDouble);
    }
}
