#include <stdio.h>
#include <limits.h>


/* Копирует целое число в буфер, если в нем есть место */
/* ВНИМАНИЕ: этот код содержит ошибку! */

void copy_int_bad(int val, void *buf, int maxbytes) {

    if (maxbytes - sizeof(val) >= 0) // implicit typecast to unsigned
        memcpy(buf, (void *) &val, sizeof(val));
}

void copy_int_v1(int val, void *buf, unsigned maxbytes) {

    if (maxbytes >= sizeof(val)) 
        memcpy(buf, (void *) &val, sizeof(val));
}

void copy_int_v2(int val, void *buf, int maxbytes) {

    if ((maxbytes > 0) && (maxbytes >= sizeof(val)))
        memcpy(buf, (void *) &val, sizeof(val));
}

int main(int argc, char* argv[]) 
{
    printf("0x%08lx\n", (3 - sizeof(int)));

    return 0;
}
