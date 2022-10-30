/* 
import java.util.Scanner;

public class AutomorphicNumber
{
    public static void main(String[] args)
    {
        int n, sqrNum, temp,sqrNumRemainder,c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        temp=n;        
        while (temp > 0)
        {
            temp=temp/10;
            c++;
        }
        sqrNum = n * n;
        sqrNumRemainder= sqrNum%(int)Math.pow(10, c);
        if(sqrNumRemainder==n)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }
        
        
    }
}
*/


/*
 * 
 * public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int n,
        cubeSum = 0, num, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            cubeSum = cubeSum + (r * r * r);
            num = num / 10;
        }
        if (n == cubeSum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}

 */

/*

import java.util.Scanner;
public class BuzzNumber
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n=");
        n = sc.nextInt();
        if (n % 10 == 7 || n % 7 == 0)
        {
            System.out.println("Buzz number");
        }
        else
        {
            System.out.println("Not Buzz number");
        }
    }
}
*/

/*
 * import java.util.Scanner;

public class CircularPrime
{
    public static void main(String[] args)
    {
        boolean flag = true;
        int n, num, r, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            c++;
            num = num / 10;
        }
        num = n;
        for (int i = 1; i <= c; i++)
        {
            r = num % 10;
            num = num / 10;
            num = (r * (int) Math.pow(10, c - 1)) + num;
            if (!prime(num))
            {
                flag = false;
                break;
            }
        }
        
        if(flag)
        {
            System.out.println("Circular Prime");
        }
        else
        {
            System.out.println("Not Circular Prime");
        }
        
    }
    static boolean prime(int n)
    {
        // TODO code application logic here
        int i = 2;
        boolean flag = true;
        while (n > i)
        {
            if (n % 2 == 0)
            {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}

 */



/*
 * 
import java.util.Scanner;
public class CoPrimeNumbers
{
    public static void main(String[] args)
    {
        int a, b, gcd = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a=");
        a = sc.nextInt();
        System.out.print("Enter b=");
        b = sc.nextInt();
        int min, max;
        min = a;
        if (min > b)
        {
            min = b;
            max = a;
        }
        else
        {
            min = a;
            max = b;
        }
        while (max > min)
        {
            int r = max % min;
            if (r == 0)
            {
                gcd = min;
                break;
            }
            else
            {
                max = min;
                min = r;
            }
        }
        if (gcd == 1)
        {
            System.out.println("Co Prime Numbers");
        }
        else
        {
            System.out.println("Not Co Prime Numbers");
        }
    }
}
*/

/*
 * 
import java.util.Scanner;

public class DigitToWord
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int r, n, num;
        String digitWords = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            switch (r)
            {
                case 0:
                    digitWords = "Zero " + digitWords;
                    break;
                case 1:
                    digitWords = "One " + digitWords;
                    break;
                case 2:
                    digitWords = "Two " + digitWords;
                    break;
                case 3:
                    digitWords = "Three " + digitWords;
                    break;
                case 4:
                    digitWords = "Four " + digitWords;
                    break;
                case 5:
                    digitWords = "Five " + digitWords;
                    break;
                case 6:
                    digitWords = "Six " + digitWords;
                    break;
                case 7:
                    digitWords = "Seven " + digitWords;
                    break;
                case 8:
                    digitWords = "Eight " + digitWords;
                    break;
                case 9:
                    digitWords = "Nine " + digitWords;
                    break;
            }
            num = num / 10;
        }
        System.out.println("Digit=" + n);
        System.out.println("Words=" + digitWords);
    }
}

 */


/*
 * import java.util.Scanner;

public class DuckNumber
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int r, n, num;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            if(r==0)
            {
                flag=true;
            }
            num = num / 10;
        }
        if(flag)
        {
            System.out.println("Duck Number");
        }
        else
        {
            System.out.println("Not Duck Number");
        }
        
    }
}

 */
 
 /*
  * import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n,
        fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of series=");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial=" + fact);
    }
}
  */


/*
 * 
import java.util.Scanner;

public class Factors
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
 */
 
/*
 * import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of series=");
        n = sc.nextInt();
        int a = 0,
        b = 1, c;
        for (int i = 1; i <= n; i++)
        {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}
 * 
 */

/*
 * public class FloydTriangle
{
    public static void main(String[] args)
    {
        int k = 1;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
 */


/*
 * 
import java.util.Scanner;

public class GCDProgram
{
    public static void main(String[] args)
    {
        int a, b, gcd = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a=");
        a = sc.nextInt();
        System.out.print("Enter b=");
        b = sc.nextInt();
        int min, max;
        min = a;
        if (min > b)
        {
            min = b;
            max = a;
        }
        else
        {
            min = a;
            max = b;
        }
        while (max > min)
        {
            int r = max % min;
            if (r == 0)
            {
                gcd = min;
                break;
            }
            else
            {
                max = min;
                min = r;
            }
        }
        System.out.println("GCD=" + gcd);
    }
}
 */


/*
 * import java.util.Scanner;

public class HappyNumber
{
    public static void main(String[] args)
    {
        int n, r = 1, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                r = num % 10;
                sum = sum + (r * r);
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Happy Number");
        }
        else
        {
            System.out.println("Not Happy Number");
        }
    }
}
 */


/*
 * import java.util.Scanner;

public class HarshadNumber
{
    public static void main(String[] args)
    {
        int r, n, num,
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        if (n % sum == 0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }
    }
}

 */


/*
 * 
 * import java.util.Scanner;

public class LCMProgram
{
    public static void main(String[] args)
    {
        int a, b, gcd = 1, lcm = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a=");
        a = sc.nextInt();
        System.out.print("Enter b=");
        b = sc.nextInt();
        int min, max;
        min = a;
        if (min > b)
        {
            min = b;
            max = a;
        }
        else
        {
            min = a;
            max = b;
        }
        while (max > min)
        {
            int r = max % min;
            if (r == 0)
            {
                gcd = min;
                break;
            }
            else
            {
                max = min;
                min = r;
            }
        }
        lcm = (a * b) / gcd;
        System.out.println("LCM:" + lcm);
    }
}
 */


/*
 * import java.util.Scanner;

public class MultiplyOfDigit
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int r, n, num,
        mul = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            mul = mul * r;
            num = num / 10;
        }
        System.out.println("Multiply of digit=" + mul);
    }
}
 */


/*
 * import java.util.Scanner;

public class NeonNumber
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n,
        sqr = 1,
        sum = 0, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        sqr = n * n;
        while (sqr > 0)
        {
            r = sqr % 10;
            sum = sum + r;
            sqr = sqr / 10;
        }
        if (n == sum)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}
 */

/*
 * import java.util.Scanner;

public class NivenNumber
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n, num, r,
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        if (n % sum == 0)
        {
            System.out.println("Niven Number");
        }
        else
        {
            System.out.println("Not Niven Number");
        }
    }
}
 */

/*
 * import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args)
    {
        int n, num, r,
        rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        if (n == rev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }
    }
}
 */

/*
 * import java.util.Scanner;

public class PerfectNumber
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n,
        mul = 1,
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
            {
                sum = sum + i;
                mul = mul * i;
            }
        }
        if (mul == sum)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
}

 */

/*
 * 
import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n,
        i = 2;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        while (n > i)
        {
            if (n % 2 == 0)
            {
                flag = false;
                break;
            }
            i++;
        }
        if (flag)
        {
            System.out.println("Number is prime.");
        }
        else
        {
            System.out.println("Number is not prime.");
        }
    }
}
 * 
 */


/*
 * import java.util.Scanner;

public class ReverceNumber
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n, num, r,
        rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        System.out.println("Reverce of Number=" + rev);
    }
}

 */

/*
 * import java.util.Scanner;

public class SpecialNumber
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n, num, r,
        sumOfFactorial = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            int fact=1;
            for(int i=1;i<=r;i++)
            {
                fact=fact*i;
            }
            sumOfFactorial = sumOfFactorial+fact;
            num = num / 10;
        }
        if(n==sumOfFactorial)
        {
            System.out.println("Special Number" );
        }
        else
        {
            System.out.println("Not Special Number" );
        }
    }
}
 */


/*
 * import java.util.Scanner;

public class SpyNumber
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int r, n, num, mul = 1, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            sum = sum + r;
            mul = mul * r;
            num = num / 10;
        }
        if (mul == sum)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}
*/


/*
 * import java.util.Scanner;

public class SumofDigits
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int r, n, num,
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        System.out.println("Sum of digit=" + sum);
    }
}
 */ 

/*
import java.util.Scanner;

public class TwinPrime
{
    public static void main(String[] args)
    {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a=");
        a = sc.nextInt();
        System.out.print("Enter b=");
        b = sc.nextInt();
        if (prime(a) && prime(b) && (Math.abs(a - b) == 2))
        {
            System.out.println("Twin Prime");
        }
        else
        {
            System.out.println("Not Twin Prime");
        }
    }
    static boolean prime(int n)
    {
        // TODO code application logic here
        int i = 2;
        boolean flag = true;
        while (n > i)
        {
            if (n % 2 == 0)
            {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}
*/


/*
 * 
import java.util.Scanner;

public class TwistedPrime
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n, num, r,
        rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            rev = (rev * 10) + r;
            num = num / 10;
        }
        if (prime(n) && prime(rev))
        {
            System.out.println("Twisted Prime");
        }
        else
        {
            System.out.println("Not Twisted Prime");
        }
    }
    static boolean prime(int n)
    {
        // TODO code application logic here
        int i = 2;
        boolean flag = true;
        while (n > i)
        {
            if (n % 2 == 0)
            {
                flag = false;
                break;
            }
            i++;
        }
        return flag;
    }
}

 */


/*
 * import java.util.Scanner;

public class UniqueNumber
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int r1, r2, n, num1, num2, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num1 = n;
        num2 = n;
        while (num1 > 0)
        {
            r1 = num1 % 10;
            while (num2 > 0)
            {
                r2 = num2 % 10;
                if (r1 == r2)
                {
                    c++;
                }
                num2 = num2 / 10;
            }
            num1 = num1 / 10;
        }
        if (c == 1)
        {
            System.out.println("Unique Number");
        }
        else
        {
            System.out.println("Not Unique Number");
        }
    }
}
*/


/*
 * import java.util.Scanner;

public class DisariumNumber
{
    public static void main(String[] args)
    {
        int r, n, num,digits=0,
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            digits++;
            num = num / 10;
        }
        num = n;
        while (num > 0)
        {
            r = num % 10;
            sum = sum + (int)Math.pow(r, digits);
            num = num / 10;
            digits--;
        }        
        
        if(n==sum)
        {
            System.out.println("Disarium Number");
        }
        else
        {
            System.out.println("Not Disarium Number");
        }
        
    }
}
*/


/*
 * import java.util.Scanner;

public class TechNumber
{
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n, num, leftNumber, rightNumber, digits = 0,
        sumSquare = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            digits++;
            num = num / 10;
        }
        if (digits % 2 == 0)
        {
            num = n;
            leftNumber = num % (int) Math.pow(10, digits / 2);
            rightNumber = num / (int) Math.pow(10, digits / 2);

            sumSquare = (leftNumber + rightNumber) * (leftNumber + rightNumber);
            if (n == sumSquare)
            {
                System.out.println("Tech Number");
            }
            else
            {
                System.out.println("Not Tech Number");
            }
        }
        else
        {
            System.out.println("Not Tech Number");
        }
    }
}

 */

/*
 * import java.util.Scanner;

public class PrimeNumberUptoN
{
    public static void main(String[] args)
    {
        int size,c=0;        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of prime=");
        size = sc.nextInt();        
        int n=2;
        while(c<=size)
        {
            boolean flag = true;
            for(int i=2;i < n;i++)
            {
                if (n % i == 0)
                {
                    flag = false;
                    break;
                }
            }
            if (flag)
            {
                System.out.println("Number is prime="+n);
                c++;                
            } 
            n++;
        }
        
    }
}
*/

/*
 * import java.util.Scanner;

public class MagicNumber
{
    public static void main(String[] args)
    {
        int n, r = 1, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 9)
        {
            while (num > 0)
            {
                r = num % 10;
                sum = sum + r;
                num = num / 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Magic Number");
        }
        else
        {
            System.out.println("Not Magic Number");
        }
    }
}

 */

/*
 * import java.util.Scanner;

public class PronicNumber
{
    public static void main(String[] args)
    {
        int n;
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        for(int i=0; i < n; i++)
        {
            if(i*(i+1) == n)
            {
                flag =true;
                break;
            }
        }
        if(flag)
        {
            System.out.println("Pronic Number");
        }
        else
        {
            System.out.println("Not Pronic Number");
        }        
    }
}

 */

/*
 * import java.util.Scanner;

public class UglyNumber
{
    public static void main(String[] args)
    {
        int n;
        boolean flag=true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        while (n != 1)
        {
            if (n % 5 == 0)
            {
                n /= 5;
            }
            else if (n % 3 == 0)
            {
                n /= 3;
            }
            else if (n % 2 == 0)
            {
                n /= 2;
            }
            else
            {
                flag=false;
                break;
            }
        }
        if (flag)
        {
            System.out.println("Ugly number.");
        }
        else
        {
            System.out.println("Not Ugly number.");
        }
    }
}
 */


/*
 *import java.util.Scanner;
public class AmicableNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number= ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        int sumA = 0, sumB = 0;
        for (int i = 1; i < a; i++)
        {
            if (a % i == 0)
            {
                sumA += i;
            }
        }
        for (int i = 1; i < b; i++)
        {
            if (b % i == 0)
            {
                sumB += i;
            }
        }
        if (sumA == b && sumB == a)
        {
            System.out.println("The numbers are Amicable Number.");
        }
        else
        {
            System.out.println("The numbers are not Amicable Number");
        }
    }
}

 */

/*
package javaprograms.loop;

import java.util.Scanner;

class PetersonNumber
{

    static int fact(int number)
    {
        int f = 1;
        for(int i=1;i<=number;i++)
        {
            f = f*i;
        }
        return f;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        int sumOfFact = 0;
        int num = n;
        while (num != 0)
        {
            sumOfFact = sumOfFact + fact(num % 10);
            num = num / 10;
        }
        if (sumOfFact == n)
        {
            System.out.println(n + " is a Peterson number");
        } else
        {
            System.out.println(n + "is not a Peterson number");
        }
    }
}
*/

/*

import java.util.Scanner;
public class MysteryNumber
{
    static int reverse(int n)  
    {
        int reverseNum=0,temp=n,r;
        while (temp > 0)
        {
            r = temp % 10;
            reverseNum = (reverseNum * 10) + r;
            temp = temp / 10;
        }
        return reverseNum;
    }
    
    public static void main(String args[])
    {
        boolean isMysteryNumber=false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        System.out.println(num);
        for (int n = 1; n <= num / 2; n++)
        {
            int rev_n=reverse(n);
            if (n + rev_n == num)
            {    
                isMysteryNumber=true;
                System.out.println(n + " " + rev_n);
            }
        }
        if (isMysteryNumber)
        {    
            System.out.println(num + " is a mystery number.");
        }
        else
        {
            System.out.println("The given number is not a mystery number.");
        }        
    }
}
*/


/*
 * import java.util.Scanner;
public class FascinatingNumber
{

    public static void main(String args[])
    {
        int num, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        num = sc.nextInt();
        num2 = num * 2;
        num3 = num * 3;
        String concatNumbers = num + "" + num2 +""+ num3;
        System.out.println("Concated Number="+concatNumbers);
        boolean flag = true;
        for (char digit = '1'; digit <= '9'; digit++)
        {
            int count = 0;
            for (int i = 0; i < concatNumbers.length(); i++)
            {
                char ch = concatNumbers.charAt(i);
                if (ch == digit)
                {
                    count++;
                }
            }
            if (count > 1 || count == 0)
            {
                flag = false;
                break;
            }
        }
        if (flag)
        {
            System.out.println("Fascinating Number.");
        } else
        {
            System.out.println("Not a Fascinating number.");
        }
    }
}
*/


/*
 * 
 * 
import java.util.Scanner;
public class EvilNumber {
    public static void main(String[] args)
    {
        int n,num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        
        int binaryDigits=0;  
        String binary = "";
        num=n;
        while (num > 0) 
        {
            binary= num % 2 + binary ;
            if(num%2==1)
            {
                binaryDigits++;
            }
            num = num / 2;
        }
        if(binaryDigits%2==0)
        {
            System.out.println("Binary of "+n+"="+binary);
            System.out.println("Evil Number");
        }
        else
        {
            System.out.println("Binary of "+n+"="+binary);
            System.out.println("Not Evil Number");
        }
        
    }
}
*/

/*
 * import java.util.Scanner;

public class CapricornNumber
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number=");
        int n = scanner.nextInt();
         boolean isCapricorn = false;
         
        int square = n * n;
        int temp = square;
        int contDigits = 0;
        
        while (temp > 0)
        {
            contDigits++;
            temp /= 10;
        }
       
        for (int i = 1; i < contDigits; i++)
        {
            int divisor = (int) Math.pow(10, i);
            int quotient = square / divisor;
            int remainder = square % divisor;
            if (quotient + remainder == n)
            {
                isCapricorn = true;
            }
        }
        if (isCapricorn)
        {
            System.out.println("Capricorn/Kaprekar number");
        } else
        {
            System.out.println("Not Capricorn/Kaprekar number");
        }
    }
}
*/


/*
 *  public class Example4 {
      public static void main(String[] args){
        int ctr = 0;
        int base = (args.length > 0) ? Integer.parseInt(args[0]) : 10;
        for(long n = 1; n <= 1000; n++){
            String sqr_Str = Long.toString(n * n, base);
            for(int j = 0; j < sqr_Str.length() / 2 + 1; j++){
                String[] parts = split_num(sqr_Str, j);
                long first_Num = Long.parseLong(parts[0], base);
                long sec_Num = Long.parseLong(parts[1], base);
                if(sec_Num == 0) break;
                if(first_Num + sec_Num == n){
                    System.out.println(Long.toString(n, base) +
                            "\t" + sqr_Str + "\t  " + parts[0] + " + " + parts[1]);
                    ctr++;
                    break;
                }
            }
        }
        System.out.println(ctr + " Kaprekar numbers.");
    }
     private static String[] split_num(String str, int idx){
        String[] ans1 = new String[2];
        ans1[0] = str.substring(0, idx);
        if(ans1[0].equals("")) ans1[0] = "0"; 
        ans1[1] = str.substring(idx);
        return ans1;
    }	
}
*/


/*
 * // https://rosettacode.org/
import java.math.BigInteger;
import java.util.*;
 public class Example5 {
     static Map<BigInteger, Tuple> cache = new HashMap<>();
     static class Tuple {
        final Boolean flag;
        final BigInteger bi;
 
        Tuple(boolean f, BigInteger b) {
            flag = f;
            bi = b;
        }
    }
     static BigInteger rev(BigInteger bi) {
        String s = new StringBuilder(bi.toString()).reverse().toString();
        return new BigInteger(s);
    }
     static Tuple lychrel(BigInteger n) {
        Tuple res;
        if ((res = cache.get(n)) != null)
            return res;
 
        BigInteger r = rev(n);
        res = new Tuple(true, n);
        List<BigInteger> seen = new ArrayList<>();
         for (int i = 0; i < 500; i++) {
            n = n.add(r);
            r = rev(n);
 
            if (n.equals(r)) {
                res = new Tuple(false, BigInteger.ZERO);
                break;
            }
             if (cache.containsKey(n)) {
                res = cache.get(n);
                break;
            }
             seen.add(n);
        }
         for (BigInteger bi : seen)
            cache.put(bi, res);
         return res;
    }
     public static void main(String[] args) {
         List<BigInteger> seeds = new ArrayList<>();
        List<BigInteger> related = new ArrayList<>();
        List<BigInteger> palin = new ArrayList<>();
 
        for (int i = 1; i <= 10_000; i++) {
            BigInteger n = BigInteger.valueOf(i);
             Tuple t = lychrel(n);
             if (!t.flag)
                continue;
             if (n.equals(t.bi))
                seeds.add(t.bi);
            else
                related.add(t.bi);
 
            if (n.equals(t.bi))
                palin.add(t.bi);
        }
         System.out.printf("%d Lychrel seeds: %s%n", seeds.size(), seeds);
        System.out.printf("%d Lychrel related%n", related.size());
        System.out.printf("%d Lychrel palindromes: %s%n", palin.size(), palin);
    }
}

 */


/*
 * // https://rosettacode.org/
 * 
 * narcissistic numbers
public class Example6 {
	public static void main(String[] args){
		for(long n = 0, ctr = 0; ctr < 15; n++){
			if(is_narc_dec_num(n)){
				System.out.print(n + " ");
				ctr++;
			}
		}
		System.out.println();
	}
    public static boolean is_narc_dec_num(long n){
		if(n < 0) return false;
 
		String str1 = Long.toString(n);
		int x = str1.length();
		long sum_num = 0;
 
		for(char c : str1.toCharArray()){
			sum_num += Math.pow(Character.digit(c, 10), x);
		}
		return sum_num == n;
	}
 	
}

 */

/*
 * lucus numbers
 * import java.util.Scanner;
public class Example7 {
   public static void main(String[] args) { 

     System.out.print("\nFirst ten Lucas a numbers: "); 
     int n = 10;
     int n1 = 2, n2 = 1, n3;
        if (n > 1){
            System.out.println("\n2\n1");
            for(int i = 2; i < n; ++i){
                n3 = n2;
                n2 += n1;
                n1 = n3;
                System.out.println(n2);
            }
        }
        else if (n == 1)
            System.out.println("\n2");

        else
            System.out.println("Input a positive number.");
    }
 }

 */

/*
 * import java.util.Scanner;
public class Example8 {
   public static void main(String[] args) {
        int num = 10;
        int[] t = new int[num + 2];
        t[1] = 1;
        System.out.printf("\nList 10 Catalan numbers:-\n"); 
        for (int i = 1; i <= num; i++) {
 
            for (int j = i; j > 1; j--)
                t[j] = t[j] + t[j - 1];
 
            t[i + 1] = t[i];
            
            for (int j = i + 1; j > 1; j--)
                t[j] = t[j] + t[j - 1];
             System.out.printf("\n%d ", t[i + 1] - t[i]);
        }
		System.out.printf("\n"); 
    }
}

 */

/*
 * import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Example10 {

    public static boolean isHappy_number(int num)
    {
        Set<Integer> unique_num = new HashSet<Integer>();

        while (unique_num.add(num))
        {
            int value = 0;
            while (num > 0)
            {
                value += Math.pow(num % 10, 2);
                num /= 10;
            }
            num = value;
        }

        return num == 1;
    }

    public static void main(String[] args)
    {
        System.out.print("Input a number: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println(isHappy_number(num) ? "Happy Number" : "Unhappy Number");
    }
}
*/

/*
 * import java.util.Scanner;

public class Example13 {

    public static void main(String args[])
       {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
        int ans = 0;
    
        for(int i=0; i<num; i++)
        {
            if(i*(i+1) == num)
            {
                ans = 1;
                break;
            }
        }
         
        if(ans == 1)
            System.out.println("Pronic Number.");
        else
            System.out.println("Not a Pronic Number.");      
    }
}

 */

/*
 *import java.util.Scanner;
public class Example18 {

      public static void main( String args[] ){ 
        Scanner sc = new Scanner( System.in ); 
        System.out.print("Input a number: "); 
        int num = sc.nextInt(); 
       int n = (int) Math.round(Math.pow(num, 1.0/3.0));
        if((num == n * n * n))
			{
			   System.out.print("Number is a cube.");
            }
		   else
			{
				System.out.print("Number is not a cube.");
			}
				System.out.println("\n");
        }
     }
 
 */


/*
 * import java.util.Scanner;
import java.math.BigInteger;
public class Example19 {

      public static void main( String args[] ){ 
            Scanner sc = new Scanner( System.in ); 
            System.out.print("Input a number: "); 
            String strnum = sc.nextLine().trim();
            BigInteger n = new BigInteger(strnum);
            int len = strnum.length()+1;
            String str = String.valueOf(len);
            BigInteger n1 = new BigInteger(str);
            StringBuilder buf = new StringBuilder();
            for(int i = 0 ; i < (len-1); i++) {
                buf.append('9');
            }
            BigInteger total = new BigInteger(buf.toString());
            if(n.multiply(n1).equals(total)) {
                System.out.println("It is a cyclic number.");
            }
            else {
                System.out.println("Not a cyclic number.");
            }                    
        }
    }

 */


/*
import java.util.Scanner;
Fermat numbers.
public class Example20 {
      
public static void main( String args[] ){ 
        int n = 0;        
        double result;
        
        while (n <= 10) {
            result= Math.pow (2, Math.pow(2, n)) + 1;
            n++;
            System.out.println (result);
        }
     }  
}


*/


/*
import java.util.Scanner;
Ramanujan numbers
public class Example21  {

   public static void main(String[] args) { 

         int n = 100000;
        // for each a, b, c, d, check whether a^3 + b^3 = c^3 + d^3
        for (int a = 1; a <= n; a++) {
            int a3 = a*a*a;
            if (a3 > n) break;

            for (int b = a; b <= n; b++) {
                int b3 = b*b*b;
                if (a3 + b3 > n) break;

                 for (int c = a + 1; c <= n; c++) {
                    int c3 = c*c*c;
                    if (c3 > a3 + b3) break;

                    for (int d = c; d <= n; d++) {
                        int d3 = d*d*d;
                        if (c3 + d3 > a3 + b3) break;

                        if (c3 + d3 == a3 + b3) {
                            System.out.print((a3+b3) + " = ");
                            System.out.print(a + "^3 + " + b + "^3 = "); 
                            System.out.print(c + "^3 + " + d + "^3"); 
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}

*/


/*
import java.util.Scanner;
import java.math.BigInteger;
public class Example22 {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        int n1 = n + 1;

        int power = 0;
        int ans = 0;
        for(int i=0;;i++)
        {
            power=(int)Math.pow(2,i);
            if(power>n1)
            {
                break;
            }
            else if(power==n1)
            {
               System.out.println(n+" is a Mersenne number.");
               ans=1;
            }
        }
  if(ans==0)
  {
   System.out.println(n+" is not a Mersenne number.");
  }
    }
}

*/



/*
import java.util.LinkedList;
narcisstic up to
public class Example23  {

    public static void main(String args[])
    {
        for (int i = 1; i < 1000; i++) {
            int n = i;
            LinkedList<Integer> data = new LinkedList<>();
            while (n > 0) {
                data.push( n % 10 );
                n = n / 10;
            }
            int n1 = 0;
            for(Integer num : data) {
                n1 += Math.pow(num, data.size());
            }
            if(i == n1) {
                System.out.println(i);
            }
        }
    }
}

*/


/*
import java.util.Scanner;
public class Example25  {

    public static void main(String args[])
    {
	int n,a=1,b=0,c;
    System.out.println("First 20 Pell numbers: ");
    for(n=1; n<=20; n++)
     {
      c= a + 2*b;
      System.out.print(c+" ");
      a = b;
      b = c;
     }
   }
 }

*/


/*
import java.util.Scanner;
public class Example25  {

    public static void main(String args[])
    {
	int n,a=1,b=0,c;
    System.out.println("First 20 Pell numbers: ");
    for(n=1; n<=20; n++)
     {
      c= a + 2*b;
      System.out.print(c+" ");
      a = b;
      b = c;
     }
   }
 }

*/


/*
import java.util.Scanner;
public class Example26  {

   public static void main(String[] args) { 

     Scanner sc = new Scanner( System.in ); 
     System.out.print("Input a number: "); 
     int n = sc.nextInt(); 
     int n1 = n;
     String s = Integer.toString(n);
     int d=s.length();
     int arr[]=new int[n];
     int i, sum; 
     for(i=d-1; i>=0; i--)
     {
         arr[i]=n1 % 10;
         n1=n1/10;
          
     }
      
     i=d; sum=0;
     while(sum<n)
     {
         sum = 0;
         for(int j=1; j<=d; j++)
         {
             sum=sum+arr[i-j];
         }
         arr[i]=sum;
         i++;
     }
 
    if(sum==n)
        System.out.println("Keith Number");
     else
        System.out.println("Not a Keith Number");
    }
}

*/



/*
// https://rosettacode.org/
import java.math.BigInteger; 
public class Exercise28 {

    public static void main(String args[])
    {
        Stream hamming = makeHamming();
        System.out.print("First Twenty Hamming numbers: ");
        for (int i=0; i<20; i++) {
            System.out.print(hamming.value());
            System.out.print(" ");
            hamming = hamming.advance();
        }
        System.out.println();
     }
 
    public interface Stream
    {
        BigInteger value();
        Stream advance();
    }
 
    public static class MultStream implements Stream
    {
        MultStream(int mult)
        { m_mult = BigInteger.valueOf(mult); }
        MultStream setBase(Stream s)
        { m_base = s; return this; }
        public BigInteger value()
        { return m_mult.multiply(m_base.value()); }
        public Stream advance()
        { return setBase(m_base.advance()); }
 
        private final BigInteger m_mult;
        private Stream m_base;
    }
 
    private final static class RegularStream implements Stream
    {
        RegularStream(Stream[] streams, BigInteger val)
        {
            m_streams = streams;
            m_val = val;
        }
        public BigInteger value()
        { return m_val; }
 
        public Stream advance()
        {
            // memoized value for the next stream instance.
            if (m_advance != null) { return m_advance; }
 
            int minidx = 0 ;
            BigInteger next = nextStreamValue(0);
            for (int i=1; i<m_streams.length; i++) {
                BigInteger v = nextStreamValue(i);
                if (v.compareTo(next) < 0) {
                    next = v;
                    minidx = i;
                }
            }
            RegularStream ret = new RegularStream(m_streams, next);
            // memoize the value!
            m_advance = ret;
            m_streams[minidx].advance();
            return ret;
        }
        private BigInteger nextStreamValue(int streamidx)
        {
            // skip past duplicates in the streams we're merging.
            BigInteger ret = m_streams[streamidx].value();
            while (ret.equals(m_val)) {
                m_streams[streamidx] = m_streams[streamidx].advance();
                ret = m_streams[streamidx].value();
            }
            return ret;
        }
        private final Stream[] m_streams;
        private final BigInteger m_val;
        private RegularStream m_advance = null;
    }
 
    private final static Stream makeHamming()
    {
        MultStream nums[] = new MultStream[] {
            new MultStream(2),
            new MultStream(3),
            new MultStream(5)
        };
        Stream ret = new RegularStream(nums, BigInteger.ONE);
        for (int i=0; i<nums.length; i++) {
            nums[i].setBase(ret);
        }
        return ret;
    }
}

*/


/*
Babylonians number base 10 to base 60
q[0] = n
i = 0
while (q[i] > 0) {
  r[i] = q[i] mod 60
  q[i+1] = q[i] div 60
  i = i+1
}
return q
*/


/*
// Java code for digital root
import java.util.*;

public class GfG {
	
	static int digroot(int n)
	{
		int root = 0;

		// Loop to do sum while
		// sum is not less than
		// or equal to 9
		while (n > 0 || root > 9)
		{
			if (n == 0) {
				n = root;
				root = 0;
			}
			
			root += n % 10;
			n /= 10;
		}
		return root;
	}
	
	// Driver code
	public static void main(String argc[])
	{
		int n = 65785412;
		System.out.println(digroot(n));
	}
}

*/


/*
 * Star Patterns in Java
First, let us begin with the basic and the commonly asked pattern program in Java i.e Pyramid.

1. Pyramid Program
    * 
   * * 
  * * * 
 * * * * 
* * * * *
Let’s write the java code to understand this pattern better.


public class Edureka
{  
    public static void pyramidPattern(int n) 
    {  
        for (int i=0; i<n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            for (int j=0; j<=i; j++ ) //inner loop for number of columns
            { 
                System.out.print("* "); //print star
            } 
  
            System.out.println(); //ending line after each row
        } 
    } 
  
    public static void main(String args[]) //driver function
    { 
        int n = 5; 
        pyramidPattern(n); 
    } 
}
 

2. Right Triangle Star Pattern
*
* *
* * *
* * * *
* * * * *

public class Edureka 
{ 
    public static void rightTriangle(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
            {           
                System.out.print(" "); // printing space
            } 
            for(j=0; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("* "); // print star
            }           
            System.out.println(); // ending line after each row
        } 
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        rightTriangle(n); 
    } 
}
3. Left Triangle Star Pattern

           * 
         * * 
       * * * 
     * * * * 
   * * * * * 

public class Edureka 
{ 
    public static void printStars(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
            {           
                System.out.print(" "); // printing space
            } 
            for(j=0; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("* "); // print star
            }           
            System.out.println(); // ending line after each row
        } 
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n); 
    } 
}
4. Diamond Shape Pattern Program in Java
Enter the number of rows: 5

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *


import java.util.Scanner;
public class Edureka
{
public static void main(String args[])
{
int n, i, j, space = 1;
System.out.print("Enter the number of rows: ");
Scanner s = new Scanner(System.in);
n = s.nextInt();
space = n - 1;
for (j = 1; j<= n; j++)
{
for (i = 1; i<= space; i++)
{
System.out.print(" ");
}
space--;
for (i = 1; i <= 2 * j - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
space = 1;
for (j = 1; j<= n - 1; j++)
{
for (i = 1; i<= space; i++)
{
System.out.print(" ");
}
space++;
for (i = 1; i<= 2 * (n - j) - 1; i++)
{
System.out.print("*");
}
System.out.println("");
}
}
}
5. Downward Triangle Star Pattern
Enter the number of rows: 5

* * * * * 
* * * * 
* * * 
* * 
* 


import java.util.Scanner;
public class Edureka
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter the number of rows: "); //takes input from user
 
    int rows = sc.nextInt();
 
    for (int i= rows-1; i>=0 ; i--)
    {
    for (int j=0; j<=i; j++)
    {
    System.out.print("*" + " ");
    }
    System.out.println();
    }
    sc.close();
    }
    }
6. Mirrored Right Triangle Star Program
Enter the number of rows: 5

     *
    **
   ***
  ****
 *****
******

import java.util.Scanner;
public class Edureka
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter number of rows: "); // takes input from user
 
        int rows = sc.nextInt();
         
        for (int i= 0; i<= rows; i++)
        {
            for (int j=1; j<=rows-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            } 
                System.out.println("");
        }
        sc.close();
 
    }
}
7. Reversed Pyramid Star Pattern
Enter the number of rows: 5

 * * * * * 
  * * * * 
   * * * 
    * * 
     * 

import java.util.Scanner;
public class Edureka
{
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
 
    int rows = sc.nextInt();        
    for (int i= 0; i<= rows-1 ; i++)
    {
        for (int j=0; j<=i; j++)
        {
            System.out.print(" ");
        }
        for (int k=0; k<=rows-1-i; k++)
        {
            System.out.print("*" + " ");
        }
        System.out.println();
    }
    sc.close();
 
}
}
8. Right down Mirror Star Pattern
Enter the number of rows: 5

*****
 ****
  ***
   **
    *

import java.util.Scanner;
public class Edureka
{
 
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in); // takes input
    System.out.println("Enter number of rows: ");
    int rows = sc.nextInt();
    for (int i= rows; i>= 1; i--)
    {
    for (int j=rows; j>i;j--)
    {
    System.out.print(" ");
    }
    for (int k=1;k<=i;k++)
    {
    System.out.print("*");
    }
    System.out.println("");
    }
    sc.close();
    }
    }
 

9. Right Pascal’s Triangle
Enter the number of rows: 5

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
 

import java.util.Scanner;
public class Edureka
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
 
        int rows = sc.nextInt();        
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++) { System.out.print("*"+ " "); } System.out.println(""); } for (int i=rows-1; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
10. Left  Triangle Pascal’s
Enter the number of rows: 5

    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *

import java.util.Scanner;
public class Edureka
{
 
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
 
        int rows = sc.nextInt();        
        for (int i= 1; i<= rows ; i++)
        {
            for (int j=i; j <rows ;j++)            
        {
                System.out.print(" ");
            }
            for (int k=1; k<=i;k++) { System.out.print("*"); } System.out.println(""); } for (int i=rows; i>=1; i--)
        {
            for(int j=i; j<=rows;j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<i ;k++) 
            {
                System.out.print("*");
            }
            System.out.println("");
 
        }
        sc.close();
    }
}
 

11. Sandglass Star Pattern
Enter the number of rows: 5

* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

import java.util.Scanner;
public class Edureka
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
 
        int rows = sc.nextInt();            
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++) { System.out.print("*" + " "); } System.out.println(""); } for (int i= rows-1; i>= 0; i--)
        {
            for (int j=0; j< i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
12. Alphabet A Pattern
** 
* *
***
* *
* *
* *
 

30
import java.util.Scanner;
public class Edureka
{
    // Java program to print alphabet A pattern
    void display(int n)
    {
    // Outer for loop for number of lines
    for (int i = 0; i<=n; i++) {
    // Inner for loop for logic execution
    for (int j = 0; j<= n / 2; j++) {
    // prints two column lines
    if ((j == 0 || j == n / 2) && i != 0 ||
    // print first line of alphabet
    i == 0  && j != n / 2 ||
    // prints middle line
    i == n / 2)
    System.out.print("*");
    else
    System.out.print(" ");
    }
    System.out.println();
    }
    }
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    Edureka a = new Edureka();
    a.display(7);
    }
    }
13. Triangle Star pattern
Enter the number of rows: 5

    *
   * *
  *   *
 *     *
*********
 


import java.util.Scanner;
public class Edureka
{
     public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
 
            System.out.println("Enter the number of rows: ");
 
            int rows = sc.nextInt();
             
            for (int i=1; i<= rows ; i++)
            {
                for (int j = i; j < rows ; j++) {
                    System.out.print(" ");
                }   
                for (int k = 1; k <= (2*i -1) ;k++) {
                    if( k==1 || i == rows || k==(2*i-1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            sc.close();
        }
    }
 

14. Down triangle
Enter the number of rows: 5

*********
 *     *
  *   *
   * *
    *
 

import java.util.Scanner;
public class Edureka
{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
 
    int rows = sc.nextInt();    
     for (int i=rows; i>= 1 ; i--)
    {
        for (int j = i; j < rows ; j++) {
            System.out.print(" ");
        }   
        for (int k = 1; k <= (2*i -1) ;k++) {
            if( k==1 || i == rows || k==(2*i-1)) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    sc.close();
}
}
15. Diamond Star Pattern
Enter the number of rows: 5

    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
1

import java.util.Scanner;
public class Edureka
{
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter the number of rows: ");
 
    int rows = sc.nextInt();    
    for (int i=1; i<= rows ; i++) { for (int j = rows; j > i ; j--) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int k = 1; k < 2*(i -1) ;k++) { System.out.print(" "); } if( i==1) { System.out.println(""); } else { System.out.println("*"); } } for (int i=rows-1; i>= 1 ; i--)
        {
        for (int j = rows; j > i ; j--) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int k = 1; k < 2*(i -1) ;k++) {
            System.out.print(" ");
        }
        if( i==1)
            System.out.println("");
        else
            System.out.println("*");
    }
    sc.close();
}
}

Now that we have implemented star pattern programs in Java. Let us move further and implement some Numeric patterns.

Numeric Pattern in Java
 

1. Simple number program
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
 

public class Edureka
{
    public static void printNums(int n) 
    { 
        int i, j,num; 
    
        for(i=0; i<n; i++) // outer loop for rows
        { 
            num=1; 
            for(j=0; j<=i; j++) // inner loop for rows
            { 
                // printing num with a space  
                System.out.print(num+ " "); 
    
                //incrementing value of num 
                num++; 
            } 
    
            // ending line after each row 
            System.out.println(); 
        } 
    } 
       public static void main(String args[]) 
    { 
        int n = 5; 
        printNums(n); 
    } 
}
2. Number Pattern Program in java
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 

import java.util.Scanner;
  
public class Edureka
{            
        public static void main(String[] args) {
            int i, j, k = 1;
            for (i = 1; i <= 5; i++) {
                for (j = 1; j< i + 1; j++) {
                    System.out.print(k++ + " ");
                }
       
                System.out.println();
            }
        }
       
    }
 

3. Pascal’s Triangle Program in Java
 

             1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1
 

import java.util.Scanner;
 
public class Edureka
{            
    public static void main(String[] args) {
          
        int n = 5;
  
        for (int i = 0; i < n; i++) {
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
  
    }
  
}
 

4. Diamond Pattern Program in Java
 

   1
  212
 32123
4321234
 32123
  212
   1
 

import java.util.Scanner;
  
public class Edureka
{            
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++)
        {
            int n = 4;
   
            for (int j = 1; j<= n - i; j++) { System.out.print(" "); } for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) { System.out.print(l); } System.out.println(); } for (int i = 3; i >= 1; i--)
        {
            int n = 3;
   
            for (int j = 0; j<= n - i; j++) { System.out.print(" "); } for (int k = i; k >= 1; k--)
            {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++)
            {
                System.out.print(l);
            }
   
            System.out.println();
        }
       
    }
}
 

5. Number Pattern Programs in Java
Enter the number of rows: 5

1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5
 

import java.util.Scanner;
  
public class Edureka
{            
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); //Taking rows value from the user    
        System.out.println("Enter the number of rows: ");    
        int rows = sc.nextInt();         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
               
            System.out.println();
        }         
        sc.close();
    }
}
 

6. Descending order Pattern
Enter the number of rows: 5

5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
 

import java.util.Scanner;
public class Edureka
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
 
//Taking rows value from the user
 
System.out.println("Enter the number of rows: ");
 
int rows = sc.nextInt();
for (int i = rows; i >= 1; i--)
{
for (int j = rows; j >= i; j--)
{
System.out.print(j+" ");
}
 
System.out.println();
}
sc.close();
}
}
 

7. Right Triangle Numeric Pattern 
Enter the number of rows: 5

1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1
 

import java.util.Scanner;
public class Edureka
{
      
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
      
System.out.println("Enter the number of rows: ");
 
int rows = sc.nextInt();
          
for (int i = 1; i <= rows; i++) { for (int j = i; j >= 1; j--)
   {
       System.out.print(j+" ");
   }
     
   System.out.println();
}         
sc.close();
}
}
 

8. Binary Number Pattern
Enter the number of rows: 5

10101
01010
10101
01010
10101
 

import java.util.Scanner;
public class Edureka
{
      
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
          
        System.out.println("Enter the number of rows: ");
          
        int rows = sc.nextInt();
          
        for (int i = 1; i <= rows; i++) 
        {
            int num;
              
            if(i%2 == 0)
            {
                num = 0;
                  
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
                      
                    num = (num == 0)? 1 : 0;
                }
            }
            else
            {
                num = 1;
                  
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
                      
                    num = (num == 0)? 1 : 0;
                }
            }
              
            System.out.println();
        }
          
        sc.close();
    }
}            
    
 

9. Zeros/ ones Pattern Programs
Enter the number of rows: 5

1
10
101
1010
10101

import java.util.Scanner;
 
public class Edureka
{            
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
          
        System.out.println("Enter the number of rows: ");
          
        int rows = sc.nextInt();         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
              
            System.out.println();
        }
          
        sc.close();
    }
}
 

10. Diamond Numeric Pattern
 

1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
   4 5 
  3 4 5 
 2 3 4 5 
1 2 3 4 5

import java.util.Scanner;
public class Edureka
{
    public static void main(String[] args) 
    {
          
        int n = 5;  
          
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
              
            for (int k = i; k <= n; k++) { System.out.print(k+" "); } System.out.println(); } for (int i = n-1; i >= 1; i--) 
        {
             for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++)
            {
                System.out.print(k+" ");
            }
              
            System.out.println();
        }
         
    }
}

Now that we have implemented numeric pattern programs in Java. Let us move further and implement some character/ alphabet patterns.

Alphabet/ Character Patterns in Java
 

1. Right Alphabetic triangle 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F


import java.util.Scanner;
 
public class Edureka
{            
    public static void main(String[] args)
    {
        int alphabet = 65;
                for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
   
 

2. Alphabet/ Character Pattern Programs
A 
B B 
C C C 
D D D D 
E E E E E 
F F F F F F 

import java.util.Scanner;
 
public class Edureka
{            
    public static void main(String[] args)
    {
        int alphabet = 65;
                for (int i = 0; i<= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
    }
}
 
   
 

3. K Shape Character Pattern Program
A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F

import java.util.Scanner;
 
public class Edureka
{public static void main(String[] args)
{
for (int i = 5; i >= 0; i--)
{
   int alphabet = 65;
   for (int j = 0; j <= i; j++)
   {
       System.out.print((char) (alphabet + j) + " ");
   }
   System.out.println();
}
for (int i = 0; i<= 5; i++)
{
   int alphabet = 65;
   for (int j = 0; j <= i; j++)
   {
       System.out.print((char) (alphabet + j) + " ");
   }
   System.out.println();
}
}
}
 
   
4. Triangle Character Pattern Program in Java
     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
A B C D E F
 

public class Edureka
{            
    public static void main(String[] args)
{
        for (int i = 0; i <= 5; i++) { int alphabet = 65; for (int j = 5; j > i; j--)
        {
            System.out.print(" ");
        }
        for (int k = 0; k <= i; k++)
        {
            System.out.print((char) (alphabet + k) + " ");
        }
        System.out.println();
    }
}
}
 

5. Diamond Pattern in Java
Enter a Character between A to Z : F

     A
    B B
   C   C
  D     D
 E       E
F         F
 E       E
  D     D
   C   C
    B B
     A
 

import java.util.Scanner;
 
public class Edureka
{public static void main(String[] args) {
    char[] letter = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
            'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z' };
    int letter_number = 0;
    String[] diamond = new String[26]; // array of strings
    System.out.print("Enter a Character between A to Z : ");
 
    Scanner reader = new Scanner(System.in);
    try {
        char user_letter = reader.next("[A-Z]").charAt(0);
        // search for letter number in the array letter
        for (int i = 0; i < letter.length; i++) {
            if (letter[i] == user_letter) {
                letter_number = i;
                break;
            }
        }
 
        // construct diamond
        for (int i = 0; i <= letter_number; i++) {
            diamond[i] = "";
            // add initial spaces
            for (int j = 0; j < letter_number - i; j++) {
                diamond[i] += " ";
            }
 
            // add letter
            diamond[i] += letter[i];
 
            // add space between letters
            if (letter[i] != 'A') {
                for (int j = 0; j < 2 * i - 1; j++) { diamond[i] += " "; } // add letter diamond[i] += letter[i]; } // Draw the first part of the diamond System.out.println(diamond[i]); } for (int i = letter_number - 1; i >= 0; i--)
                {
            // Draw the second part of the diamond
            // Writing the diamondArray in reverse order
            System.out.println(diamond[i]);
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        reader.close();
    }
 
}
}



 */



/*

// Java implementation of the approach
import java.lang.Math;

class GFG
{
	
// Function that returns true if
// n is a Dudeney number
static boolean isDudeney(int n)
{
	int cube_rt = (int)(Math.round((Math.pow(n, 1.0 / 3.0))));

	// If n is not a perfect cube
	if (cube_rt * cube_rt * cube_rt != n)
		return false;

	int dig_sum = 0;
	int temp = n;
	while (temp > 0)
	{

		// Last digit
		int rem = temp % 10;

		// Update the digit sum
		dig_sum += rem;

		// Remove the last digit
		temp /= 10;
	}

	// If cube root of n is not equal to
	// the sum of its digits
	if (cube_rt != dig_sum)
		return false;

	return true;
}

// Driver code
public static void main(String[] args)
{
	int n = 17576;
	if (isDudeney(n))
		System.out.println("Yes");
	else
		System.out.println("No");
}
}

// This code is contributed by Code_Mech.
*/

