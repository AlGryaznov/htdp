#include <unistd.h>
#include <sys/mman.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <stdlib.h>
#include <stdio.h>


int main(int argc, char * argv[]) 
{
    int fd = open(argv[1], O_RDONLY);
    struct stat sb;
    char * bufp;  
    
    if (fd == -1) {
            perror("in main func");
            exit(1);
    }

    printf("file %s opened, fd is %d\n", argv[0], fd);

    if (fstat(fd, &sb) == -1) {

            perror("in main func");
            exit(1);
    }

    printf("size %ld\n", sb.st_size);

    bufp = mmap(NULL, sb.st_size, PROT_READ, MAP_PRIVATE, fd, 0);
    
    if (bufp == MAP_FAILED) {

            perror("in main func");
            exit(1);
    }

    write(1, bufp, sb.st_size);

    pause();

    munmap(bufp, sb.st_size);

    exit(0); 
}
