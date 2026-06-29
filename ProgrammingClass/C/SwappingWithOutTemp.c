#include <stdio.h>

int main()
{
    int a, b;

    printf("Enter The Number a : ");
    scanf("%d", &a);

    printf("Enter The Number b : ");
    scanf("%d", &b);

    printf("Before Swapping -> a : %d | b : %d\n", a, b);

    a = a + b;
    b = a - b;
    a = a - b;

    // a = a * b;
    // b = a / b;
    // a = a / b;

    // a = a ^ b;
    // b = a ^ b;
    // a = a ^ b;

    printf("After Swapping ->  a : %d | b : %d\n", a, b);

    return 0;
}

// //OutPut
// Enter The Number a : 124
// Enter The Number b : 456
// Before Swapping -> a : 124 | b : 456
// After Swapping ->  a : 456 | b : 124