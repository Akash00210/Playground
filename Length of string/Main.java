#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char a[30];
  scanf("%[^\n]s",a);
  int l=strlen(a);
  printf("%d",l);
  return 0;
}