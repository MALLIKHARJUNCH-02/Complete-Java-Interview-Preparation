#include <stdio.h>

int main()
{
    int num;

    printf("Enter The Number : ");
    scanf("%d", &num);

    int sum = 0;

    for (int i = 1; i <= num / 2; i++)
    {
        if (num % i == 0)
        {
            sum += i;
        }
    }

    if (sum == num)
    {
        printf("Given Number %d is Perfect Number\n", num);
    }
    else
    {
        printf("Given Number %d is Not a Prefect Number", num);
    }
}