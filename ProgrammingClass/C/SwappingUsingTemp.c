#include <stdio.h>
int main()
{

    int a, b;
    printf("Enter The A value : ");
    scanf("%d", &a);

    printf("Enter the value of b : ");
    scanf("%d", &b);

    printf("Before Swapping ->  a : %d | b : %d \n", a, b);

    int temp = a;
    a = b;
    b = temp;

    printf("After Swapping ->  a : %d | b : %d \n", a, b);
    return 0;
}

/*
    OUTPUT
    Enter The A value : 10
    Enter the value of b : 20
    Before Swapping ->  a : 10 | b : 20
    After Swapping ->  a : 20 | b : 10
*/