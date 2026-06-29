#include <stdio.h>

int main()
{
    int a, b;

    printf("Enter the value of a : ");
    scanf("%d", &a);

    printf("Enter the value of b : ");
    scanf("%d", &b);

    int mul = a * b;

    int sub = a - b;

    printf("The Multiplication of %d and %d is : %d\n", a, b, mul);
    printf("The Subtraction of %d and %d is : %d\n", a, b, sub);

    return 0;
}

// OUTPUT
// Enter the value of a : 10
// Enter the value of b : 5
// The Multiplication of 10 and 5 is : 50
// The Subtraction of 10 and 5 is : 5