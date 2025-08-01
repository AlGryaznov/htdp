#include <stdio.h>
#include <stdlib.h>
#include <inttypes.h>
#include <arpa/inet.h>

int main(int argc, char* argv[]) 
{
    unsigned char buf[INET_ADDRSTRLEN];
    char *endptr;
    struct in_addr in_addr;

    if (argc >= 2) {

            in_addr.s_addr = htonl(strtol(argv[1], &endptr, 16));
            
            if (inet_ntop(AF_INET, &in_addr, buf, INET_ADDRSTRLEN) == NULL)
            {
                    perror("inet_ntop");
                    exit(EXIT_FAILURE);
            }

            printf("%s\n", buf);

    }

    exit(EXIT_SUCCESS);
}
