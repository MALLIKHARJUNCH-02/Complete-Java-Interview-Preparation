#include <Stdio.h>

int main()
{
    int num;

    printf("Enter The Number : ");
    scanf("%d", &num);

    if (num % 2 == 0)
    {
        printf("%d is Even Number", num);
    }
    else
    {
        printf("%d is Odd Number", num);
    }

    return 0;
}

/*
Output
Enter The Number : 2
2 is Even Number


Enter The Number : 3
3 is Odd Number
*/