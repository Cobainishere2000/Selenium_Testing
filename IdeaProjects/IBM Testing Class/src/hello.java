public class hello {
    public static void main(String arg[]){
        System.out.println("Hello World!");
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String t = "Hello World";
        System.out.println(t.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(t.toLowerCase()); // Outputs "hello world"
        System.out.println(t); //t does not change

        String tx = "This phrase uses the phrase 'phrase' a lot!";
        System.out.println(tx.indexOf("phrase")); // Outputs 5

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName); // Outputs "John Doe"

        String firstName1 = "John ";
        String lastName1 = "Doe";
        System.out.println(firstName1.concat(lastName1)); // Outputs "John Doe"

        /*
        ARRAYS
        An array is a type of variable that can store multiple values.
        Array in Java is a collection of similar type of values.
        Java has two types of arrays – single dimensional and multidimensional arrays.
        Array index starts at 0.
                                String[] carMake;
                                    or
                                    String carMake[];
         */
        String[] carMake = new String[2];
        carMake[0] = "BMW";
        carMake[1] = "AUDI";

        /*
        String[] carMake = {"BMW", "AUDI"};

        Syntax for creating an array is:
        ArrayType [] ArrayName = new ArrayType [Size of an Array];
        ArrayType : This is the type of the array. An array can store different data types like integer, string, boolean etc.
        ArrayName : Name of the array variable.
        new : new is the Java keyword to create an object of a class. It locates a block of memory large enough to contain the array.
        [Size of an Array] : This decides how big is the array is. At the time of creation, the length of the array must be specified and remains constant.

         String [] carMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};

        //This is to store the size of the Array
        int iLength = carMake.length;
        System.out.println("Length of the Array is: " + iLength);

        //This is to access the first element of an array directly with it's position
        String sBMW = carMake[0];
        System.out.println("First value of the Array is ==> " + sBMW);

        //This is to access the last element of an Array
        String sHonda = carMake[iLength-1];
        System.out.println("Last value of the Array is ==> " + sHonda);

        ENHANCED FOR LOOP
        String array[] = {"Ron", "Harry", "Hermoine"};
        //enhanced for loop
        for (String x:array) {
            System.out.println(x);
         */


    }
}
