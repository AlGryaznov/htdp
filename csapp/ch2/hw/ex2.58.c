#include <stdio.h>
#include "lib/show_bytes.h"

int is_little_endian()
{
        int i = 1; 
        return *((byte_pointer)&i);
}

int main(int argc, char* argv[]) 
{
    printf("Is machine little endian? - %d\n", is_little_endian());
    return 0;
}
