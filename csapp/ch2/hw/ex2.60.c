#include <stdio.h>

unsigned replace_byte(unsigned x, int i, unsigned char b)
{
    unsigned shift = (i << 3);
    unsigned mask  = ~(0xFF << shift);

    return (x & mask) | (((unsigned) b) << shift);
}

int main(int argc, char* argv[]) 

{
    unsigned x = 0x12345678;
    unsigned char b = 0xAB;
    
    printf("replace_byte(0x%08x, %d, 0x%02x) = 0x%08x\n", 
           x, 0, b, replace_byte(x, 0, b));

    printf("replace_byte(0x%08x, %d, 0x%02x) = 0x%08x\n", 
           x, 1, b, replace_byte(x, 1, b));

    printf("replace_byte(0x%08x, %d, 0x%02x) = 0x%08x\n", 
           x, 3, b, replace_byte(x, 3, b));

    return 0;
}
