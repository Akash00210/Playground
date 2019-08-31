#include<stdio.h>
int main()
{
  //fill your code
  char a[100];
  char b[100];
  scanf("%s",a);
  scanf("%s",b);
  if(strcmp(a,b)==0)
  printf("Strings are same");
  return 0;
}