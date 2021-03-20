# Week 2 assignment 

> submitted by: sujan parajuli
>
> Section: l1c1
>
> Roll no: 21
>
> Submitted date: 2021-03-20

> Qn. 1 Write a program to find perimeter of a rectangle.

```java
public class Perimeter {
    public static void main(String[] args) {
        int l = 10;
        int b = 20;
        int p = 2 * (l + b);
        System.out.printf("Perimeter of the rectangle with length %d and breadth %d is %d%n", l, b, p);
    }

}
```

- Compile and run

```
javac Perimeter.java
java Perimeter
```

- Output

```
Perimeter of the rectangle with length 10 and breadth 20 is 60
```



> Qn.2 Write a java program to find the average of any three numbers.

```java
public class Average {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 30;
        int average = (a + b + c) / 3;
        System.out.println("Average of numbers " + a + ", " + b + ", and " + c + " is: " + average);
    }
}

```

- Compile and run

```
javac Average.java
java Average
```

- Output

```
Average of numbers 10, 20, and 30 is: 20
```



> Qn. 3 Write a java program to find the area of four wall.

```java
public class AreaOfFourWalls {
    public static void main(String args[]) {
        int l = 10;
        int b = 20;
        int h = 30;
        int area = 2 * h * (l + b);
        System.out.printf("Area of four walls with length %d, breadth %d and height %d is: %d%n", l, b, h, area);
    }
}

```

- Compile and run

```
javac AreaOfFourWalls.java
java AreaOfFourWalls
```

- Output

```
Area of four walls with length 10, breadth 20 and height 30 is: 1800
```

> Qn. 4 Write a program to find the distance covered by a body.

```java
public class DistanceCovered {
    public static void main(String args[]) {
        int u = 10;
        int t = 15;
        float a = 3.0f;
        float s = u * t + 0.5f * a * t * t;
        System.out.printf("Distance covered by a body is %f%n", s);
    }
}
```

- Compile and run

```
✦ ➜ javac DistanceCovered.java
✦ ➜ java DistanceCovered
```

- Output

```
Distance covered by a body is 487.500000
```

> Qn.5 Write a program to calculate the area and circumference of a circle
```java
public class Circle {
    public static void main(String args[]) {
        int r = 20;
        float area = 3.14f * r * r;
        float circum = 3.14f * 2 * r;
        System.out.printf("Area and circumference of circle with radius %d are %f and %f%n", r, area, circum);
    }
}

```

- Compile and run

```
✦ ➜ javac Circle.java
✦ ➜ java Circle
```

- Output

```
Area and circumference of circle with radius 20 are 1256.000000 and 125.600006
```

> Qn. 6 Write the output of following program

- Code

```java
public class Solution6 {
    public static void main(String args[]) {
        int x, y, z;
        x = 10; // 10
        y = x++; // 10
        z = x; // 11
        System.out.println(x); // 11
        System.out.println(y); // 10
        System.out.println(z); // 11
    }
}
```

- output

```
11
10
11
```

> Qn. 7 Write the output of the following program

- Code

```java
public class Solution7 {
    public static void main(String args[]) {
        int m = 39;
        m++; // post increment 40
        --m; // pre decrement 39
        int x = m++; // 39
        int y = --m; // 39
        System.out.println(m++); // 39
        System.out.println(m); // 40
        System.out.println(x); // 39
        System.out.println(y); // 39
    }
}

```

- output

```
39
40
39
39
```

> Qn.8 Declare any two integer variable and initialize with values also. Then check
> whether the first variable is greater or not.

```java
public class Solution8 {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        System.out.printf("First variable is greater:  %B%n", (a > b));
    }
}
```

- output

```java
First variable is greater:  FALSE
```

> Qn.9 Write a java program to find the smallest and largest number from any two
> numbers by using the ternary operator ( ? : ).

```java
public class Solution9 {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int min = (a > b) ? b : a;
        int max = (a > b) ? a : b;
        System.out.printf("Minimum %d, Maximum %d%n", min, max);

    }
}

```

- output

```java
Minimum 10, Maximum 20
```

> Qn. 10 Write a java program to show the difference of local variable,static variable
> and instance variable.

```java
public class Solution10 {
    static int a = 20; // static variable
    int b = 30; // instance variable

    public static void main(String args[]) {
        int c = 40; // local variable
        Solution10 obj = new Solution10(); // instance of class
        System.out.println("Static variable value " + Solution10.a); // Static variable can be called without creating
                                                                     // instances of class

        System.out.println("Instance variable value " + obj.b); // instance variable can only be access from instance of
                                                                // class
        System.out.println("Local variable value " + c); // local variable can be only accessed inside the same method

    }
}

```

- output

```
Static variable value 20
Instance variable value 30
Local variable value 40
```





## Thank you! 

