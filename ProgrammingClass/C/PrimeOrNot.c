// #include <stdio.h>

// int main()
// {
//     int num;
//     printf("Enter THe Number : ");
//     scanf("%d", &num);
//     int count = 0;
//     for (int i = 1; i <= num; i++)
//     {
//         if (num % i == 0)
//         {
//             count++;
//         }
//     }

//     if (count == 2)
//     {
//         printf("%d is Prime Number", num);
//     }
//     else
//     {
//         printf("%d is not a Prime Number", num);
//     }

//     return 0;
// }

#include <stdio.h>

int main()
{
    int num;
    printf("Enter The Number : ");
    scanf("%d", &num);

    if (num <= 1)
    {
        printf("Not Prime");
        return 0;
    }

    for (int i = 2; i <= num / 2; i++)
    {
        if (num % i == 0)
        {
            printf("Not Prime");
            return 0;
        }
    }

    printf("Prime");
    return 0;
}