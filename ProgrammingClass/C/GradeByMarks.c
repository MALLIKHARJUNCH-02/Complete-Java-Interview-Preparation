#include <stdio.h>

int main()
{
    int java, sql, html, js, rjs;

    printf("Enter The Java Marks : ");
    scanf("%d", &java);

    printf("Enter The SQL Marks : ");
    scanf("%d", &sql);

    printf("Enter The html Marks : ");
    scanf("%d", &html);

    printf("Enter The JavaScript Marks : ");
    scanf("%d", &js);

    printf("Enter The Reactjs Marks : ");
    scanf("%d", &rjs);

    int total = java + html + sql + js + rjs;

    int avg = total / 5;

    if (avg >= 90)
    {
        printf("Total Marks : %d and Average : %d \n", total, avg);
        printf("Grade O");
    }
    else if (avg >= 80)
    {
        printf("Total Marks : %d and Average : %d \n", total, avg);
        printf("Grade A");
    }
    else if (avg >= 70)
    {
        printf("Total Marks : %d and Average : %d \n", total, avg);
        printf("Grade B");
    }
    else if (avg >= 60)
    {
        printf("Total Marks : %d and Average : %d \n", total, avg);
        printf("Grade C");
    }
    else if (avg >= 50)
    {
        printf("Total Marks : %d and Average : %d \n", total, avg);
        printf("Grade D");
    }
    else if (avg >= 40)
    {
        printf("Total Marks : %d and Average : %d \n", total, avg);
        printf("Grade E");
    }
    else
    {
        printf("Total Marks : %d and Average : %d \n", total, avg);
        printf("FAIL");
    }
}