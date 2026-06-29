#include <stdio.h>

int main()
{
    int java, sql, html;

    printf("Enter the Marks Obtain In Java : ");
    scanf("%d", &java);

    printf("Enter the Marks Obtain In SQL : ");
    scanf("%d", &sql);

    printf("Enter the Marks Obtain In HTML : ");
    scanf("%d", &html);

    if (java > sql && java > html)
    {
        printf("Java has Highese Score : %d ", java);
    }
    else if (sql > java && sql > html)
    {
        printf("SQL Has Highest Score : %d ", sql);
    }
    else
    {
        printf("HTML Has Highest Score : %d ", html);
    }

    return 0;
}

/*
OutPut
Enter the Marks Obtain In Java : 60
Enter the Marks Obtain In SQL : 65
Enter the Marks Obtain In HTML : 70
HTML Has Highest Score : 70
*/