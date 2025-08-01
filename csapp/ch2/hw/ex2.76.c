#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include <string.h>

void *calloc(size_t nmemb, size_t size) 
{
    size_t n = nmemb * size;
    void * result = malloc(n);

    if (result != NULL) {

        memset(result, 0, n);    
    }
    return result;
}

int main() {
        
        void * mem = NULL; 
        mem = calloc(10, sizeof(int));
        if (mem) free(mem); 
        return;
}
