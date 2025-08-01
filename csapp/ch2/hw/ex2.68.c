#include <stdio.h>
#include <limits.h>

int lower_one_mask(int n) {

    int result = -1; 
    return ~(result << n) - !((sizeof(int) << 3) - n); 
}

int main(int argc, char* argv[]) 
{
    printf("0x%08x\n", lower_one_mask(1));
    printf("0x%08x\n", lower_one_mask(6));
    printf("0x%08x\n", lower_one_mask(31));
    printf("0x%08x\n", lower_one_mask(32));

    return 0;
}
