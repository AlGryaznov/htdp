#include <stdio.h> 
#include <limits.h>

unsigned srl(unsigned x, int k)
{
        unsigned xsra = (int) x >> k;
        int w = 8 * sizeof(int);
        int mask = ~(((int)-1 + !k) << (w - k)); 

        return xsra & mask;
}

int sra(int x, int k) {

        int xsrl = (unsigned) x >> k;
        int w = 8 * sizeof(int);
        int sign = !(x & INT_MIN);
        int mask = (((int)-1 + (sign | !k)) << (w - k)); 

        return xsrl | mask;
}

int main(int argc, char* argv[]) 
{
        printf("srl(0x%08x, %d) = 0x%08x\n", -1, 0, srl(-1,0));
        printf("srl(0x%08x, %d) = 0x%08x\n", -1, 1, srl(-1,1));
        printf("srl(0x%08x, %d) = 0x%08x\n", -1, 4, srl(-1,4));
        printf("srl(0x%08x, %d) = 0x%08x\n", INT_MAX, 4, srl(INT_MAX,4));

        printf("sra(0x%08x, %d) = 0x%08x\n", INT_MAX, 4, sra(INT_MAX,4));
        printf("sra(0x%08x, %d) = 0x%08x\n", -1, 0, sra(-1,0));
        printf("sra(0x%08x, %d) = 0x%08x\n", -4, 1, sra(-4,1));
        printf("sra(0x%08x, %d) = 0x%08x\n", -1, 4, sra(-1,4));
        return 0;
}
