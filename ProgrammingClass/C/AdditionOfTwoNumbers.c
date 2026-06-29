#include<stdio.h>

int main(){
    int a,b;

    printf("Enter the value of a : ");
    scanf("%d",&a);

    printf("Enter the value of b : ");
    scanf("%d",&b);

    int sum = a + b;

    printf("Sum of %d and %d is : %d",a,b,sum);

    return 0;
}


//OutPut
// Enter the value of a : 5
// Enter the value of b : 3
// Sum of 5 and 3 is : 8