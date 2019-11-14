/*
 * Test.c
 *
 *  Created on: 13.11.2019
 *      Author: Ricardo
 */


#include<stdio.h>
#include "Test.h"

#define NUM_LEN 10

int main (void)
{
	intStruct2(2);
}

int intStruct2()
{
	struct intStruct
	{
		char c[NUM_LEN];
	};
	struct intStruct a = {"1000003389"};
	struct intStruct b = a;

	for(int i = 0; i < NUM_LEN; i++)
	{
		printf("%c", b.c[i]); //Ausgeben mit %c statt %s, da dass Escape-Zeichen '/0' mit der letzten Zahl an der 10. Stelle überschrieben wurde


	}
	return 0;
}

