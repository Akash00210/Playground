#include <stdio.h>
int main() {
	// Type your code here
  char ch;
  scanf("%c",&ch);
  if((ch>=65)&&(ch<=90))
    printf("%c",ch+32);
  else
    printf("%c",ch-32);
	return 0;
}