#include <stdio.h>

int main()
{
    int a, b;

    printf("Enter the value of a : ");
    scanf("%d", &a);

    printf("Enter the value of b : ");
    scanf("%d", &b);

    int add = a + b;
    int mul = a * b;
    int diff = a - b;
    int mod = a % b;
    int div = a / b;

    printf("Addition of %d and %d is : %d\n", a, b, add);
    printf("Multiplication of %d and %d is : %d\n", a, b, mul);
    printf("Difference of %d and %d is : %d\n", a, b, diff);
    printf("Modular of %d and %d is : %d\n", a, b, mod);
    printf("Division of %d and %d is : %d\n", a, b, div);

    return 0;
}

// OutPut
//  Enter the value of a : 50
//  Enter the value of b : 10
//  Addition of 50 and 10 is : 60
//  Multiplication of 50 and 10 is : 500
//  Difference of 50 and 10 is : 40
//  Modular of 50 and 10 is : 0
//  Division of 50 and 10 is : 5