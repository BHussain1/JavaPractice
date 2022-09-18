import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Car car = new Car();
        Bicycle bike = new Bicycle();
        Vehicle vehicle = new Vehicle();

        System.out.println("The car's speed is "+ car.speed);
        car.go();
        System.out.println("The bike's speed is " + bike.speed);
        bike.go();
        System.out.println("The car has this many wheels = " +car.wheels);
        //Show Override
        System.out.println("The bike has this many wheels = " + bike.wheels);
        car.go();
        bike.go();


        //private
//      System.out.println(car.gears);
//        vehicle.totalGears();

        //protected
        System.out.println(car.color);
        System.out.println(bike.color);

        //static: attributes and methods belong to the class; a single copy of the attribute or method is created and shared
        //the class owns the method or variable
        System.out.println(Vehicle.wheels);
        System.out.println(bike.wheels);

        Friends friend1 = new Friends();
        Friends friend2 = new Friends();

//        System.out.println("The class friends has friends = " + Friends.numOfFriends);
        System.out.println("The object friend1 has friends = " + friend1.numOfFriends);

        /*
        Widening casting: Happens automatically when passing a smaller type to a larger type:

        byte -> short -> char -> int -> long -> float -> double

        Narrow Casting: Narrowing casting must be done manually by placing the type in parentheses in front of the value:

        double myDouble = 9.78d;
        int myInt = (int) myDouble;
         */

        //Converting a smaller data type to larger data type
        int x = 6;
        double y = x;
        System.out.println(y);

        //Converting a larger data type to a smaller data type
        double a = 5.0;
        int b = (int) a;
        System.out.println(b);

        //autoboxing: converting a primitive data type to a reference data type or wrapper class
        //wrapper classes contain useful methods, can be used with collections like ArrayList
        Boolean c = true;
        System.out.println(c.equals(false));

        //unboxing
        if (c == true){
            System.out.println("True");
        }

        //ArrayList: a resizable array which can only store reference data types
        ArrayList<Integer> sort = new ArrayList<Integer>(10);
        sort.add(1);
        sort.add(2);
        sort.add(3);
        sort.add(4);

        String[] arr = {"Mike", "Jonah", "Lucy", "Pam"};

        //simple for loop
        for(int i=0; i<4; i++){
            sort.get(i);
            System.out.println(arr[i]);
        }

        //for-each loop
        for(Integer i: sort){
            System.out.println(i);
        }

        //Write a for each loop to get the names from a string array
        for(String s: arr){
            System.out.println(s);
        }




    }
}
