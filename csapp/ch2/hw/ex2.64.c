#include <stdio.h>
#include <limits.h>

int any_odd_one(unsigned x)
{
    int mask = 0x55555555; 
    return !!(x & mask); 
}

int main(int argc, char* argv[]) 
{
    int x = 0x55555555; 
    printf("any_odd_one(0x%08x) = %d\n", x, any_odd_one(x));
    
    x = 0x555; 
    printf("any_odd_one(0x%08x) = %d\n", x, any_odd_one(x));

    x = ((unsigned)INT_MIN) >> 1; 
    printf("any_odd_one(0x%08x) = %d\n", x, any_odd_one(x));

    x = INT_MIN >> 1; 
    printf("any_odd_one(0x%08x) = %d\n", x, any_odd_one(x));

    x = 1; 
    printf("any_odd_one(0x%08x) = %d\n", x, any_odd_one(x));

    x = 2; 
    printf("any_odd_one(0x%08x) = %d\n", x, any_odd_one(x));

    x = 0xaaaaaaaa; 
    printf("any_odd_one(0x%08x) = %d\n", x, any_odd_one(x));

    return 0;
}
