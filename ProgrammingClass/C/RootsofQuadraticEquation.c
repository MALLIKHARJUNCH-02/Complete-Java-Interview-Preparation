#include <stdio.h>
#include <stdbool.h>
#include <math.h>
int main()
{
    float a, b, c, root1, root2;

    printf("Enter the Value of a : ");
    scanf("%f", &a);

    printf("Enter the Value of b : ");
    scanf("%f", &b);

    printf("Enter the Value of c : ");
    scanf("%f", &c);

    if (a == 0)
    {
        printf("Not a Quadratic Equation");
    }
    else
    {
        float d = (b * b) - (4 * a * c);

        if (d == 0)
        {
            printf("Roots are Real and Equal\n");

            root1 = -b / (2 * a);
            root2 = -b / (2 * a);

            printf("Root 1 : %f | Root 2 : %f\n", root1, root2);
        }
        else if (d > 0)
        {
            printf("Roots are Real and Different\n");
            root1 = (-b + sqrt(d)) / (2 * a);
            root2 = (-b - sqrt(d)) / (2 * a);
            printf("Root 1 : %f | Root 2 : %f\n", root1, root2);
        }
        else
        {
            printf("Roots are imaginary");
        }
    }

    return 0;
}
