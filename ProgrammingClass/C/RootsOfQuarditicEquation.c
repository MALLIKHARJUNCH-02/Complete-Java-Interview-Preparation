#include <stdio.h>
#include <math.h>
int main()
{

    float a, b, c, root1, root2;

    printf("Enter The a Value : ");
    scanf("%f", &a);

    printf("Enter The b Value : ");
    scanf("%f", &b);

    printf("Enter The c Value : ");
    scanf("%f", &c);

    // finding d ( d = b^2 - 4ac)

    int d = (b * b) - (4 * a * c);

    /*
    if d == 0;
    Roots are real and equal
    root1 = -b/2a
    root2 = -b/2a

    if d > 1
    Roots are real and different
    root 1 = -b+root(d)/2a
    root 2 = -b-root(d)/2a


    if d < 0

    roots are imaginary
    */

    if (d == 0)
    {
        printf("Roots are Real and Same\n");
        root1 = -b / (2 * a);
        root2 = -b / (2 * a);
        printf("Root 1 : %f | Root 2 : %f", root1, root2);
    }
    else if (d > 0)
    {
        printf("Roots are Real and Different\n");
        root1 = -b + sqrt(d) / (2 * a);
        root2 = -b - sqrt(d) / (2 * a);
        printf("Root 1 : %f | Root 2 : %f", root1, root2);
    }
    else
    {
        printf("Roots are Imaginary\n");
    }

    return 0;
}

/*
d<0
Enter The a Value : 1
Enter The b Value : 1
Enter The c Value : 1
Roots are Imaginary

d == 0
Enter The a Value : 1
Enter The b Value : 2
Enter The c Value : 1
Roots are Real and Same
Root 1 : -1.000000 | Root 2 : -1.000000


d > 0
Enter The a Value : 1
Enter The b Value : 4
Enter The c Value : 1
Roots are Real and Different
Root 1 : -2.267949 | Root 2 : -5.732051

*/