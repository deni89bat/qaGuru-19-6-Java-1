package guru.qa.lesson;

public class Main {
    public static void main (String[] args) {
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
        String s = "Hello"; // является классом
        Phone pixel = new Phone();

        //операторы
        //1. присвоение = ( присваивает то что справа в переменную слева)
        String s1 = "Hello";
        //2. Арифметические +; -; *; /(деление в джаве целочисленое 7/2=3; %(остаток от деления 7/3=1)
        //3. Операторы сравнения >; <; >=; <=; ==; !=;   всегда результат в виде boolean
        //4. Логические операторы - позволяют комбинировать несколько значений типа boolean     &; &&; |; ||; !
         int age = 33;
         String sex = "male";
         boolean canDrinkAlc = age > 18 && sex.equals("male");
        //5. instanceof
        boolean isString = sex instanceof String;
        //6. тернарный оператор ? - аналог if else
        boolean canDrinkAlc2 = sex.equals("male") ? true : false;
        String processor = "m1";
        int coreCount = processor.equals("m1") ? 2 : 4; // если проц м1 то у него два ядра, иначе 4



        System.out.println(varFloat);
        System.out.println("дабл" + varDouble);
    }
}