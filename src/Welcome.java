import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Welcome {

    static void prime(int n) {
        int i;
        boolean flag = true;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }

    static void armstrong() {
        int i;
        int rem;
        int num = 0;
        int temp = 0;
        System.out.println("Armstrong numbers are:");
        for (i = 100; i < 1000; i++) {
            temp = i;
            num = 0;
            while (temp != 0) {
                rem = temp % 10;
                num = num + (rem * rem * rem);
                temp = temp / 10;
            }
            if (i == num) {
                System.out.print(num + " ");
            }
        }
    }

    int sum(int... arr) {
        //as int []arr
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    int diff(int x, int... arr) {
        //as int []arr
        int result = x;
        for (int a : arr) {
            result -= a;
        }
        return result;
    }

    static void varArgs(String name, int... arr) {
        System.out.print(name + " ");
        System.out.println(Arrays.toString(arr));
    }

    int fact1(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return n * fact1(n - 1);
    }

    int fact2(int n) {
        if (n == 1 || n == 0) {
            return n;
        } else
            return fact2(n - 1) + fact2(n - 2);
    }

    int recsum(int n) {
        if (n == 1)
            return 1;
        else return n + recsum(n - 1);
    }

    int multi(int a, int i) {
        return a * i;
    }

    void recpattern(int i, int n) {
    }

    void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    void pattern2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static double areaOfCircle(float radius) throws NegativeRadius {

        if (radius < 0) {
            throw new NegativeRadius();
        }
        double area;
        area = Math.PI * radius * radius;
        return area;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println("Exception = " + e);
        } finally {
            System.out.println("Bye");
        }
        return -1;

    }

    public static void loop(int a, int b) {
        for (; ; ) {
            try {
                int c = a / b;
                System.out.println(a + "/" + b + " = " + c);
            } catch (Exception e) {
                System.out.println("Exception:" + e);
                break;
            } finally {
                System.out.println("Byeeee");
            }
            b--;
        }
    }

    static int[] change1(int[] arr) {
        arr[1] = 99;
        return arr;


    }

    static int[][] change2(int[][] arr) {
        arr[0][1] = 99;
        return arr;
    }

    static void arrayL1(ArrayList l1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements ");
        for (; ; ) {
            int a1 = sc.nextInt();
            if (a1 == 0)
                break;
            l1.add(a1);

        }
        l1.set(0, 99);
        System.out.println("Character at position 1 is " + l1.get(1));
        System.out.println("Checking if 100 is present in the arraylist " + l1.contains(100));
        System.out.println("Before changing");
        System.out.print(l1);
        System.out.println();
        l1.remove(1);
    }

    static void arrayL2(ArrayList l2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements ");
        for (; ; ) {
            int a1 = sc.nextInt();
            if (a1 == 0)
                break;
            l2.add(a1);

        }
        System.out.println("Before changing");
        System.out.print(l2);
    }

    static boolean lsearch1(String str, char target) {
        System.out.println(Arrays.toString(str.toCharArray()));
        for (char ch : str.toCharArray()) {
            if (ch == target)
                return true;
        }
        return false;
    }

    public static int[] bsort(int[] arr) {
        boolean b;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            b = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    b = true;
                }
            }
            if (!b) {
                break;
            }
        }
        return arr;
    }

    public static int[] ssort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }

    public static void isort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }


            }

        }
    }

    public static void csort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != (i + 1)) {
                    int a = arr[i];
                    int temp = arr[a - 1];
                    arr[a - 1] = arr[i];
                    arr[i] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Welcome ob = new Welcome();
        System.out.println("1a. Fibonacci series using for loop");
        System.out.println("1b. Occurance of a number");
        System.out.println("1c. Reverse of a number");
        System.out.println("1d. Enter a number and tell if its a prime or composite number");
        System.out.println("1e. Print all 3 digit armstrong numbers ");
        System.out.println("2a. VarArgs");
        System.out.println("2b. VarArgs extended");
        System.out.println("2c. VarArgs 2");
        System.out.println("3a. Recursion -> factorial");
        System.out.println("3b. Recursion -> Fibbonaci series");
        System.out.println("3c. Recursion ->sum of 1st n natural numbers");
        System.out.println("3d. Recursion->pattern printing");
        System.out.println("3e. Recursion->sum of digits of a number");
        System.out.println("3f. Recursion->reverse a number");
        System.out.println("3g. Recursion->array sorted or not");
        System.out.println("3h. Recursion->Linear Search using Recursion");
        System.out.println("4. Multiplication table using function");
        System.out.println("5a. Pattern printing ->1");
        System.out.println("5b. Pattern printing->2");
        System.out.println("6a. Creaing new class Employee");
        System.out.println("6b. Creating new class to find area and perimeter ");
        System.out.println("7a. Game-> Rock Paper Scissors game with computer");
        System.out.println("7b. Game->Guess the number");
        System.out.println("8. creating new class cylinder with getters and setters");
        System.out.println("9. creating new class cone with  constructor overloading");
        System.out.println("10a. Inheritance 1");
        System.out.println("10b. Inheritance 2 Override");
        System.out.println("11. Abstraction-->1");
        System.out.println("12. Interface+Inheritance");
        System.out.println("13a. Thread->Extending thread class");
        System.out.println("13b. Thread->Implementing Runnable Interface");
        System.out.println("13c. Thread->Constructors");
        System.out.println("13d. Thread->Thread Priorities");
        System.out.println("13e. Thread->Thread Methods");
        System.out.println("13f.Thread->Printing good morning and welcome continuously using threads");
        System.out.println("13g.Thread->getState");
        System.out.println("14a. Try-Catch");
        System.out.println("14b. Try-Catch->Nested Try-Catch");
        System.out.println("14c. Try-Catch->Exception Types");
        System.out.println("14d. Try-Catch->Custom Exception class");
        System.out.println("14e. Try-Catch->Throw and Throws");
        System.out.println("14f. Try-Catch->Finally keyword->1");
        System.out.println("14g. Try-Catch->Finally keyword->2");
        System.out.println("15.Char->Uppercase or lowercase");
        System.out.println("16. Shadowing");
        System.out.println("17a. 1-D Array");
        System.out.println("18a. 2-D Array");
        System.out.println("19a.1-D Arraylist");
        System.out.println("19b.2-D Arraylist");
        System.out.println("20a. Linear Search ->to search char in string");
        System.out.println("21. Matrix sorted row and column wise");
        System.out.println("22. Matrix sorted");
        System.out.println("23a.Bubble Sort");
        System.out.println("23b.Selection sort");
        System.out.println("23c.Insertion sort");
        System.out.println("23d. Cycle sort");
        System.out.println("24a.String");
        System.out.println("24b.String 2");
        System.out.println("24c. String 3");
        System.out.println("24d. String Palindrome");
        System.out.println("25. String Builder");
        System.out.println("26. Binary search using Recursion");
        System.out.println("27a. Bitwise operators");
        System.out.println("27b. Bitwise Operators");
        System.out.println("27c. Bitwise Operators");
        System.out.println("27d. Bitwise Operators");
        System.out.println("27e. Bitwise Operators");
        System.out.println("27f. Bitwise Operators");
        System.out.println("27g. Bitwise Operator: To find if a number is a power of 2 or not");
        System.out.println("27h. Bitwise Operators: a^b value");
        System.out.println("choose a number");


        String choice = sc.nextLine();

        switch (choice) {
            case "1a" -> {
                System.out.println("Enter the number of Fibonacci series you want");
                int num = sc.nextInt();
                int fib1 = 0;
                int fib2 = 1;
                System.out.print(fib1 + " " + fib2 + " ");
                for (int i = 0; i < (num - 2); i++) {
                    int sum = fib1 + fib2;
                    System.out.print(sum + " ");
                    fib1 = fib2;
                    fib2 = sum;

                }
            }
            case "1b" -> {
                System.out.println("Enter a number");
                long a = sc.nextLong();
                System.out.println("Enter the occurance of a number you want to find");
                int key = sc.nextInt();
                int count = 0;
                while (a != 0) {
                    long rem = a % 10;
                    a = a / 10;
                    if (rem == key) {
                        count++;
                    }
                }
                System.out.println("Occurance of " + key + " is " + count);
            }
            case "1c" -> {
                System.out.println("Enter a nuumber");
                long a = sc.nextLong();
                long b = 0;
                while (a != 0) {
                    long rem = a % 10;
                    b = b * 10 + rem;
                    a = a / 10;
                }
                System.out.println("Reversed number is = " + b);
            }
            case "1d" -> {
                System.out.println("Enter an integer");
                int n = sc.nextInt();
                prime(n);
            }
            case "1e" -> {

                armstrong();

            }
            case "2a" -> {
                System.out.println("sum = " + ob.sum());
                System.out.println("sum of 1 and 2 = " + ob.sum(1, 2));
            }
            case "2b" -> {
                System.out.println("Diff of 2,1 = " + ob.diff(1, 2));
                System.out.println("Diff of 3, 2, 1 = " + ob.diff(1, 2, 3));
            }
            case "2c" -> {
                varArgs("Vinaya", 1, 2, 3, 4, 5);
                varArgs("Rachana", 33, 4, 5);
            }
            case "3a" -> {
                System.out.println("Enter the number to find the factorial");
                int a = sc.nextInt();
                System.out.println(ob.fact1(a));
            }
            case "3b" -> {
                System.out.println("Enter the number to find fibo series");
                int a = sc.nextInt();
                for (int i = 0; i <= a; i++)
                    System.out.print(ob.fact2(i) + " ");
            }
            case "3c" -> {
                System.out.println("enter the natural number");
                int n = sc.nextInt();
                System.out.println("sum = " + ob.recsum(n));
            }
            case "3d" -> {
                System.out.println("enter the number of rows");
                int n = sc.nextInt();
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        ob.recpattern(i, n);
                    }
                    System.out.println("");
                }
            }
            case "3e" -> {
                System.out.print("Enter an integer :");
                int n = sc.nextInt();
                int sum = 0;
                int res = digits(n);
                System.out.println("Sum of digits of " + n + " = " + res);
            }
            case "3f" -> {
                System.out.print("Enter an integer : ");
                int n = sc.nextInt();
                int i = (int) Math.log10(n) + 1;
                int res = reverse(n, i - 1);
                System.out.println("Ans = " + res);
            }
            case "3g" -> {
                System.out.println("Enter the size of an array");
                int n = sc.nextInt();
                int[] nums = new int[n];
                System.out.println("Enter the elements of an array to check if the array is sorted or not");
                for (int i = 0; i < n; i++) {
                    nums[i] = sc.nextInt();
                }
                System.out.println(sorted(nums, 0));
            }
            case "3h"->{
                System.out.println("Enter the size of an array");
                int n=sc.nextInt();
                int[] nums=new int[n];
                System.out.println("Enter the array elements");
                for(int i=0;i<n;i++)
                    nums[i]=sc.nextInt();
                System.out.println("Enter the integer to be found");
                int target=sc.nextInt();
                int res=linear(nums,target,0);
                if(res==-1)
                    System.out.println(target+" not found");
                else
                    System.out.println(target+" found at position "+ res);

            }
            case "4" -> {
                System.out.println("Enter the number of which you need to write  the multiplication table");
                int a = sc.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(a + " x " + i + " = " + ob.multi(a, i));
                }
            }
            case "5a" -> {
                System.out.println("enter the number of rows");
                int a = sc.nextInt();
                ob.pattern1(a);
            }
            case "5b" -> {
                System.out.println("enter the number of rows");
                int n = sc.nextInt();
                ob.pattern2(n);
            }
            case "6a" -> {
                Employee vinaya = new Employee();
                vinaya.name = "John";
                vinaya.salary = 12;
                vinaya.setName(vinaya.name);
                System.out.println(vinaya.getName());
                System.out.println(vinaya.getSalary());
            }
            case "6b" -> {
                Square sq = new Square();
                System.out.println("enter the side value");
                sq.side = sc.nextFloat();
                sq.setSide(sq.side);
                System.out.println("Area = " + sq.area());
                System.out.println("Perimeter = " + sq.perimter());
            }
            case "7a" -> {
                Random random = new Random();
                System.out.println("Enter '0' for 'rock','1' for 'paper' and '2' for 'scissors' of your choice");
                int user = sc.nextInt();
                label:
                {
                    if (user == 0)
                        System.out.println("User Input = Rock");
                    else if (user == 1)
                        System.out.println("User Input = Paper");
                    else if (user == 2)
                        System.out.println("User Input = Scissors");
                    else {
                        System.out.println("Wrong input,,Try again");
                        while (true) {
                            if (user != 0 || user != 1 || user != 2)
                                user = sc.nextInt();
                            break label;
                        }
                    }
                }
                int comp = random.nextInt(0, 3);
                if (comp == 0)
                    System.out.println("Computer Input = Rock");
                else if (comp == 1)
                    System.out.println("Computer Input = Paper");
                else if (comp == 2)
                    System.out.println("Computer Input = Scissors");
                if (user == comp) {
                    System.out.println("Draw");
                } else if (user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp == 1) {
                    System.out.println("You Win!!");

                } else if (comp == 0 && user == 2 || comp == 1 && user == 0 || comp == 2 && user == 1) {
                    System.out.println("Computer Wins:(");

                }
            }
            case "7b" -> {
                Game game = new Game();
                System.out.println("input a number between 1 to 100");
                while (true) {
                    game.takeUserInput();
                    if (game.isCorrectNumber()) {
                        break;
                    }
                }
            }
            case "8" -> {
                Cylinder cy = new Cylinder();
                cy.setHeight(2);
                cy.setRadius(2);
                System.out.println(cy.getHeight());
                System.out.println(cy.getRadius());
            }
            case "9" -> {
                Cone co = new Cone();
                System.out.println(co.getHeight());
                System.out.println(co.getRadius());

            }
            case "10a" -> {
                Base1 base1 = new Base1();
                Derived1 derived1 = new Derived1(13);
            }
            case "10b" -> {
                Student s1 = new Student("vinaya", 19);
                PrimaryStudent s2 = new PrimaryStudent("rachana", 21, "Bhanu");
                System.out.println(s1.toString());
                System.out.println(s2);
            }
            case "11" -> {
                Pen p = new Pencil();
                p.refill();
                p.write();
            }
            case "12" -> {
                BasicAnimal s = new Human();
                s.eat();
                s.sleep();
            }
            case "13a" -> {
                Thread1 t1 = new Thread1();
                Thread2 t2 = new Thread2();
                t1.start();
                t2.start();
            }
            case "13b" -> {
                Thread3 t3 = new Thread3();
                Thread T1 = new Thread(t3);
                Thread4 t4 = new Thread4();
                Thread T2 = new Thread(t4);
                T1.start();
                T2.start();

            }
            case "13c" -> {
                Thread5 t5 = new Thread5("Madhura");
                Thread5 t6 = new Thread5("Rachana");
                System.out.println("Name of Thread t1 is:" + t5.getName());
                System.out.println("Id of Thread t1 is:" + t5.getId());
                System.out.println("Name of Thread t2 is:" + t6.getName());
                System.out.println("Id of Thread t2 is:" + t6.getId());
            }
            case "13d" -> {
                Thread6 t6 = new Thread6("Vinaya");
                Thread6 t7 = new Thread6("Vinaya1");
                Thread6 t8 = new Thread6("Vinaya2");
                Thread6 t9 = new Thread6("Vinaya3");
                t6.setPriority(Thread.MAX_PRIORITY);
                t7.setPriority(Thread.MIN_PRIORITY);
                t8.setPriority(Thread.NORM_PRIORITY);
                t9.setPriority(Thread.MIN_PRIORITY);
                t6.start();
                t7.start();
                t8.start();
                t9.start();
            }
            case "13e" -> {
                Thread7 t1 = new Thread7();
                Thread8 t2 = new Thread8();
                t1.start();
                t2.start();
            }
            case "13f" -> {
                String s1 = "good morning";
                String s2 = "welcome";
                Thread9 t1 = new Thread9();
                Thread10 t2 = new Thread10();
                t1.setPriority(5);
                t2.setPriority(10);
                System.out.println(t1.getPriority());
                System.out.println(t2.getPriority());
                t1.start();
                t2.start();
            }
            case "13g" -> {
                Thread11 t1 = new Thread11();
                Thread12 t2 = new Thread12();
                System.out.println(t1.getState());
                t1.start();
                System.out.println(t1.getState());
                System.out.println(t2.getState());
                t2.start();
                System.out.println(t2.getState());
                System.out.println(Thread.currentThread().getState());
            }
            case "14a" -> {
                System.out.println("Enter 2 numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                try {
                    System.out.println(a / b);
                } catch (Exception e) {
                    System.out.println("Exception: " + e);
                    System.out.println("enter any value of b other than 0");
                    b = sc.nextInt();
                    System.out.println(a / b);
                }
            }
            case "14b" -> {
                int[] arr = new int[3];
                arr[0] = 10;
                arr[1] = 1;
                arr[2] = 2;
                boolean b = true;
                while (b) {
                    System.out.println("Enter the array index");
                    int index = sc.nextInt();
                    try {
                        System.out.printf("arr[%d]=%d\n", index, arr[index]);
                        b = false;
                        try {
                            System.out.println("Welcome");
                        } catch (Exception e) {
                            System.out.println("Bye");
                        }
                    } catch (Exception e) {
                        System.out.println("Exception:" + e);
                    }

                }
            }
            case "14c" -> {
                int[] arr = new int[5];
                System.out.println("Enter the array elements");
                for (int i = 0; i < 5; i++) {
                    arr[i] = sc.nextInt();
                }
                try {
                    System.out.println("Enter the array index[0-4]");
                    int index = sc.nextInt();
                    System.out.println("Enter the array element you want to divide with");
                    int d = sc.nextInt();
                    System.out.printf("arr[%d]=%d\n", index, arr[index]);
                    System.out.printf("%d/%d=%d\n", arr[index], d, arr[index] / d);
                } catch (ArithmeticException e) {
                    System.out.println("Exception:" + e);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Exception:" + e);
                } catch (Exception e) {
                    System.out.println("Exception" + e);
                    System.out.println("Bye");
                }
            }
            case "14d" -> {
                System.out.println("Enter your Age");
                int age = sc.nextInt();
                try {
                    if (age < 0 || age > 120) {
                        throw new AgeException();
                    }
                    System.out.println("Your Age is :" + age);
                } catch (Exception e) {
                    System.out.println("Error:" + e);
                    System.out.println(e.toString());
                    System.out.println(e.getMessage());
                    System.out.println(e.getStackTrace());
                }
                System.out.println("End of switchCASE");
            }
            case "14e" -> {
                System.out.println("Enter the radius");
                float radius = sc.nextFloat();
                try {
                    double area = areaOfCircle(radius);
                    System.out.println("Area =" + area);
                } catch (Exception e) {
                    System.out.println(e.toString());
                    System.out.println(e.getMessage());
                }

            }
            case "14f" -> {
                System.out.println("Enter two numbers to divide");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = divide(a, b);
                System.out.println(a + "/" + b + " = " + c);

            }
            case "14g" -> {
                System.out.println("Enter two numbers to divide");
                int a = sc.nextInt();
                int b = sc.nextInt();
                loop(a, b);
            }
            case "15" -> {
                System.out.println("Enter a character");
                char ch = sc.next().trim().charAt(0);
                System.out.println("character = " + ch);
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println("Lowercase");
                } else if (ch >= 'A' && ch <= 'Z') {
                    System.out.println("Uppercase");
                } else {
                    System.out.println("Special Character");
                }
            }
            case "16" -> {
                Shadowing s = new Shadowing();
                System.out.println(s.getX());
                System.out.println(s.change());
            }
            case "17a" -> {
                int[] arr = new int[4];
                System.out.println("enter the array elements");
                for (int i = 0; i < 4; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("array elements before changing");
                System.out.println(Arrays.toString(arr));
                change1(arr);
                System.out.println("Array elements before changing");
                System.out.println(Arrays.toString(arr));
            }
            case "18a" -> {
                int[][] arr = new int[][]{{1, 2, 3}, {1, 2}, {1}};
                System.out.println("Length of rows");
                for (int i = 0; i < 3; i++) {
                    System.out.println("Length of " + "i " + "row is " + arr[i].length);
                }
                System.out.println("the array elements");
                for (int i = 0; i < 3; i++) {
                    System.out.print(Arrays.toString(arr[i]));
                }
                System.out.println();
                change2(arr);
                System.out.println("Changed array elements are");
                for (int[] a : arr) {
                    System.out.print(Arrays.toString(a));
                }

            }
            case "19a" -> {
                ArrayList<Integer> l1 = new ArrayList<>();
                ArrayList<Integer> l2 = new ArrayList<>();
                arrayL1(l1);
                arrayL2(l2);
                l1.addAll(l2);
                System.out.println();
                System.out.println("New ArrayList elements");
                System.out.println(l1);
            }
            case "19b" -> {
                ArrayList<ArrayList<Integer>> a1 = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    a1.add(new ArrayList<>());
                }
                System.out.println("Enter the elements");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        a1.get(i).add(sc.nextInt());
                    }
                }
                System.out.println(a1);
            }
            case "20a" -> {
                String str = new String();
                char target;
                System.out.println("Enter the string");
                str = sc.nextLine();
                System.out.println("Enter the character you want to search");
                target = sc.next().trim().charAt(0);
                boolean b = lsearch1(str, target);
                if (b) {
                    System.out.println(target + " found");
                } else {
                    System.out.println(target + " not found");
                }
            }
            case "21" -> {
                int[][] arr = {
                        {1, 2, 3, 10},
                        {4, 5, 6, 11},
                        {7, 8, 9, 12}
                };
                int target = 7;
                int r = 0;
                int c = arr.length - 1;
                while (r != arr.length && c >= 0) {

                    if (arr[r][c] > target) {
                        c--;
                    } else if (arr[r][c] < target) {
                        r++;
                    } else {
                        System.out.println("[" + r + "," + c + "]");
                        break;
                    }
                }
            }
//                  case "22"->{
//                Two_D_Binary_Search s=new Two_D_Binary_Search();
//                      int[][] arr=new int[3][4];
//                      int target=5;
//                      int r= arr.length;
//                      int c=arr[0].length;
//                      System.out.println("Enter the array elements");
//                      for (int i=0;i<r;i++){
//                          for(int j=0;j<c;j++){
//                              arr[i][j]=sc.nextInt();
//                          }
//                      }
//                      System.out.println(Arrays.toString(s.search(arr,target,r,c)));
//                  }
            case "23a" -> {
                int[] arr = {11, 22, 10, 44, 1, 5, 4};
                System.out.println(Arrays.toString(arr));
                System.out.println(Arrays.toString(bsort(arr)));
            }
            case "23b" -> {
                int[] arr = {11, 22, 10, 44, 1, 5, 4};
                System.out.println(Arrays.toString(arr));
                System.out.println(Arrays.toString(ssort(arr)));
            }
            case "23c" -> {
                int[] arr = {11, 22, 10, 44, 1, 5, 4};
                System.out.println(Arrays.toString(arr));
                isort(arr);
                System.out.println(Arrays.toString(arr));
            }
            case "23d" -> {
                int[] arr = {5, 3, 2, 1, 4};
                System.out.println(Arrays.toString(arr));
                csort(arr);
                System.out.println(Arrays.toString(arr));
            }
            case "24a" -> {
                String name = "Madhura";
                String name1 = "Madhura";
                System.out.println("declaration of string variable like this having same value points the reference variable to the same object");
                if (name == name1) {
                    System.out.println("hi");
                }
            }
            case "24b" -> {
                String name = new String("Madhura");
                String name1 = new String("Madhura");
                System.out.println("declaration of string variable like this having same value points the reference variable to two different object");
                if (name == name1) {
                    System.out.println("hi");
                }
            }
            case "24c" -> {
                String a = "h";

                for (int i = 0; i < 26; i++) {
                    a = a + (char) ('a' + i);
                }
                System.out.println(a.toUpperCase());
                System.out.println(a);
                System.out.println(Arrays.toString(a.toCharArray()));
                System.out.println(a.indexOf('a'));
                System.out.println("     vinaya ".strip());
                System.out.println(Arrays.toString(a.split("k")));
            }
            case "25" -> {
                StringBuilder s = new StringBuilder();
                for (int i = 0; i < 26; i++) {
                    s.append((char) ('a' + i));
                }
                System.out.println(s);

                System.out.println(s.reverse());
                System.out.println(s);
            }
            case "24d" -> {
                String s = "abcba";
                for (int i = 0; i <= s.length() / 2; i++) {
                    char start = s.charAt(i);
                    char end = s.charAt(s.length() - 1 - i);
                    if (start != end) {
                        System.out.println("Not Palindrome");
                        return;
                    }

                }
                System.out.println("Palindrome");
            }
            case "26" -> {
                System.out.println("Enter the number of elements in an array\n");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter the array elements");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("Enter the element you want to search");
                int key = sc.nextInt();
                int start = 0;
                int end = n - 1;
                int b = rbinary(arr, key, start, end);
                if (b == -1) {
                    System.out.println("key not found");
                } else {
                    System.out.println("key found at pos " + b);
                }
            }
            case "27a" -> {
                System.out.println("Enter a number to see if the number is odd or even");

                int n = sc.nextInt();
                if (isOdd(n)) {
                    System.out.println(n + " is odd");
                } else {
                    System.out.println(n + " is even");
                }
            }
            case "27b" -> {
                System.out.println("Enter the size of an array(Odd number)");
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter the array elements so that each element repeats itself twice except one number");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("The unique number is " + unique(arr));

            }
            case "27c" -> {
                System.out.println("Enter a number");
                int n = sc.nextInt();
                System.out.println("Enter the ith bit to be found");
                int bit = sc.nextInt();
                int a = 1 << bit - 1;
                System.out.println("The " + bit + "rd bit value is :" + ((a & n) >> bit - 1));
            }
            case "27d" -> {
                System.out.println("Enter a number");
                int n = sc.nextInt();
                int temp = 1;
                int bit;
                while (true) {
                    bit = temp & n;
                    if (bit == 0) {
                        temp = temp << 1;
                    } else if (bit == 1 || (bit % 2 == 0)) {
                        System.out.println("The right most set bit is " + bit);
                        break;
                    }
                }
            }
            case "27e" -> {
                int bit;
                System.out.println("Enter any integer");
                int n = sc.nextInt();
                System.out.println("Enter a magic number");
                int m = sc.nextInt();
                int z = m;
                int sum = 0;
                while (n != 0) {
                    bit = n & 1;
                    sum = sum + (bit * m);
                    m = z * m;
                    n = n >> 1;
                }
                System.out.println("The magic number is " + sum);
            }
            case "27f" -> {
                System.out.println("To find number of digits  of the base");
                System.out.println("Enter an integer");
                int n = sc.nextInt();
                System.out.println("Enter the base");
                int b = sc.nextInt();
                int res = (int) ((Math.log(n)) / (Math.log(b))) + 1;
                System.out.println("The number of digits in " + n + " of base " + b + " is = " + res);
            }
            case "27g" -> {
                System.out.println("Enter a number");
                int n = sc.nextInt();
                int temp = n;
                int count = 0;
                while (n != 0) {
                    if ((n & 1) == 1) {
                        count++;
                    } else if (count > 1) {
                        break;
                    }
                    n >>= 1;
                }
                if (count > 1) {
                    System.out.println(temp + " is not a power of 2");
                } else {
                    System.out.println(temp + " is a power of 2");
                }
            }
            case "27h" -> {
                System.out.println("Enter the base");
                int a = sc.nextInt();
                int base = a;
                System.out.println("Enter the power");
                int b = sc.nextInt();
                int power = b;
                int ans = 1;
                int n = 0;
                while (b != 0) {
                    n = b & 1;
                    if (n == 1) {
                        ans = ans * a;
                    }
                    a = a * a;
                    b = b >> 1;
                }
                System.out.println("The value of " + base + " power " + power + " is =" + ans);
            }

            default -> {
                System.out.println("Nothing");
            }
        }
    }

    private static int rbinary(int[] arr, int key, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start <= end) {
            if (arr[mid] == key) {
                return mid + 1;
            } else if (key > arr[mid]) {
                return rbinary(arr, key, mid + 1, end);
            } else {
                return rbinary(arr, key, start, mid - 1);
            }
        } else {
            return -1;
        }
    }

    static int digits(int n) {
        if (n == 0)
            return 0;
        else {
            return (n % 10) + digits(n / 10);
        }
    }

    static int reverse(int n, int i) {
        if (i == 0)
            return n;
        return (n % 10) * (int) Math.pow(10, i) + reverse(n / 10, --i);
    }

    static boolean isOdd(int n) {
        if ((n & 1) == 1)
            return true;
        else
            return false;
    }

    static int unique(int[] arr) {
        int u = 0;
        for (int i : arr) {
            u = u ^ i;
        }
        return u;
    }

    static boolean sorted(int[] nums, int i) {
        if (nums[i] == nums.length - 1)
            return true;
        else
            return nums[i]<nums[i+1] && sorted(nums,i+1);
    }
    static int linear(int[] nums,int target,int i){
    if(nums[i]==target)
    return i;
    if(i== nums.length-1)
        return -1;
    else
        return linear(nums,target,i+1);
    }
}




