#include <stdio.h>

int main(int argc, char* argv[]) 
{
    int x = 0x89ABCDEF;
    int y = 0x76543210;
    int mask = (-1) << 8;

    int result = (x & ~mask) | (y & mask);
    
    printf("x - 0x%08x\ny - 0x%08x\nresult - 0x%08x\n", x, y, result);

    return 0;
}
