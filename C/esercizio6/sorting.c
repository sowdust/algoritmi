#include<stdio.h>
#include <stdlib.h>

void isort(int*, int);

void ssort(int*, int);

void quicksort(int*, int);

void msort(int*, int);

void stampa(int*, int);

void scambia(int*, int, int);

void main(int argc, char* argv[]);

void merge(int *a, int first, int m, int last, int* aux)
{
	int i = first;
	int j = m + 1;
	int k = first;
	
	if(*(a+m+1) < *(a+m))
	{
		while (i <= m && j <= last)
		{
			if (a[i] <= a[j])	aux[k++] = a[i++];
			else			aux[k++] = a[j++];
		}
        }
	
	int h = m;
	int l = last;
	int r = first;
	
        while (h >= i)	a[l--] = a[h--];
	
	for (; r < k; r++)	a[r] = aux[r];
}

void isort(int *a, int size)
{
	int x, i, j;
	for(i = 1; i < size; ++i)
	{
		x = *(a+i);
		j = i;
		while( j > 0 && x < *(a + j - 1))
		{
			*(a+j) = *(a+j-1);
			--j;		
		}
		*(a+j) = x;
	}
}
		
void ssort(int* a, int size)
{

	int i, iMin;	
	
	for(i = 0; i < size; ++i)
	{
		iMin = i;
		int j = iMin;
	        for (++j; j < size; ++j)
		{
			if (a[j] < a[iMin])
			{
				iMin = j;
			}
		}
		scambia(a, i, iMin);
	}	
}

void stampa(int* a, int size)
{
	int i = 0;
	for(; i < size; ++i)
	{
		printf("[%d] %d \t", i, *(a+i));
	}
	printf("\n");
}

void scambia(int* a, int i, int j)
{
	int temp = *(a+i);
	*(a+i) = *(a+j);
	*(a+j) = temp;
}

void main(int argc, char* argv[])
{
    int* test = (int*) malloc(sizeof(int) * 5);
    test[0] = 1;
    test[1] = 8;
    test[2] = 3;
    test[3] = 4;
    test[4] = 5;
    
    stampa(test, 5);
    isort(test,5);
    stampa(test, 5);

}