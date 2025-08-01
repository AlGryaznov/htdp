#include <stdio.h>
#include <limits.h>

int tadd_ok(int x, int y) {

}

int saturating_add(int x, int y)
{

    int sum = x + y;

    if ((x < 0) && (y < 0) && (sum > 0)) {

        sum = INT_MIN;
    }
    else if ((x > 0) && (y > 0) && (sum < 0)) {

        sum = INT_MAX;
    }
    
    return sum;
}

int main(int argc, char* argv[]) 
{

        printf("%d\n",saturating_add(INT_MIN, 1));
        printf("%d\n",saturating_add(INT_MIN, -100));

        printf("%d\n",saturating_add(INT_MAX, -1));
        printf("%d\n",saturating_add(INT_MAX, 100));

        return 0;
}
