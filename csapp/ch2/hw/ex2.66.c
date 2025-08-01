#include <stdio.h>
#include <limits.h>

int leftmost_one(unsigned x)
{
    x = x | x >> 1;
    x = x | x >> 2;
    x = x | x >> 4;
    x = x | x >> 8;
    x = x | x >> 16;

    return (x >> 1) + !!x;
}
int main(int argc, char* argv[]) 
{
    int x = 0x080f0e00;
    printf("leftmost_one(0x%08x) = 0x%08x)\n", x, leftmost_one(x));


    x = 0x03ffffff;
    printf("leftmost_one(0x%08x) = 0x%08x)\n", x, leftmost_one(x));

    x = 0x00;
    printf("leftmost_one(0x%08x) = 0x%08x)\n", x, leftmost_one(x));

    x = 0xffffffff;
    printf("leftmost_one(0x%08x) = 0x%08x)\n", x, leftmost_one(x));

    return 0;
}
