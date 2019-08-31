#include<stdio.h>
int main()
{
  char a[100];
  scanf("%s",a);
  int l=strlen(a);
  printf("String with lowercase is ");
  for(int i=0;i<l;i++)
  {
    if((a[i]>='A')&&(a[i]<='Z'))
    {
      a[i]=a[i]+32;
      printf("%c",a[i]);}
    else
      printf("%c",a[i]);
  }
  return 0;
}