#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char a[100];
  int c=0;
  scanf("%[^\n]s",a);
  int l=strlen(a);
  for(int i=0;i<=l;i++)
  {
    if((a[i]==' ')||(a[i]=='\0'))
      c++;
  }
  printf("%d",c);
}