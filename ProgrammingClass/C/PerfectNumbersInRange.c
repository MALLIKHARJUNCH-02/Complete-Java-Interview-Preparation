#include <stdio.h>

int main()
{
    int min, max;

    printf("Enter the Lower Range : ");
    scanf("%d", &min);

    printf("Enter the Higher Range : ");
    scanf("%d", &max);

    printf("Perfect Numbers Between The %d and %d are : \n", min, max);

    for (int i = min; i <= max; i++)
    {

        int sum = 0;
        for (int j = 1; j <= i / 2; j++)
        {
            if (i % j == 0)
            {
                sum += j;
            }
        }

        if (i == sum && i != 0)
        {
            printf("%d\t", i);
        }
    }
}

// OutPut

// Enter the Lower Range : 1
// Enter the Higher Range : 1000
// Perfect Numbers Between The 1 and 1000 are :
// 6       28      496