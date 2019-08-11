#include <stdio.h>


int main() {

    int lo, hi, baze;
    char oper, r;

    printf("Enter the intervals:\n");

    while (scanf(" %c", &r) != EOF) {


        if (r == 'r') {

            if (scanf("%d : < %d ; %d > %c", &baze, &lo, &hi, &oper) != 4 ||
                (lo < 0 || hi < 0 || (hi < lo) || (baze < 2) || (baze > 36) )) {
                printf("Invalid input.\n");
                return 1; }
            }


        else if (r == '<') {
            if (scanf(" %d ; %d > %c", &lo, &hi, &oper) != 3 ||
                (lo < 0 || hi < 0 || (hi < lo)) ) {
                printf("Invalid input.\n");
                return 1;}
                baze = 10;
            }

        else{printf("Invalid input.\n");
            return 1;}


            int digits = 0;
            int zeros = 0;
            int maxzeros = 0;
            int d = 0;


            for (int i = lo; i <= hi; i++) {
                int a = i;

                do {

                        if ((a % baze) == 0){
                            zeros++;
                            maxzeros++;
                        }

                        a /= baze;
                        digits++;

                            if ((a % baze) != 0) {
                                if (maxzeros >= d) {
                                    d = maxzeros;
                                }
                                maxzeros = 0;
                            }

                } while (a >= 1);


            }
          if(zeros==1){d=1;}
        if((baze == 2)&& d== 2){ d =1;}


            if(oper == 'l'){
                printf("Digits: %d\n", digits);
            }
            if(oper == 's'){
                printf("Sequence: %d\n", d);
            }
            if(oper == 'z'){
                printf("Zeros: %d\n", zeros);
            }


    }
    return 0;
}

