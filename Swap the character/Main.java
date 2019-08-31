#include<stdio.h>
#include<string.h>
int main()
{
  // type your code here
  char a[25],b[25],c[25];
  scanf("%s\n%s\n%s",a,b,c);
  int al=strlen(a);
  int bl=strlen(b);
  int cl=strlen(c);
  for(int i=0;i<al;i++)
  {
    if((a[i]=='a')||(a[i]=='e')||(a[i]=='i')||(a[i]=='o')||(a[i]=='u'))
      printf("$");
    else if((a[i]=='A')||(a[i]=='E')||(a[i]=='I')||(a[i]=='O')||(a[i]=='U'))
      printf("$");
    else
      printf("%c",a[i]);
  }
  for(int i=0;i<bl;i++)
  {
    if((b[i]=='a')||(b[i]=='e')||(b[i]=='i')||(b[i]=='o')||(b[i]=='u'))
      printf("%c",b[i]);
    else if((b[i]=='A')||(b[i]=='E')||(b[i]=='I')||(b[i]=='O')||(b[i]=='U'))
      printf("%c",b[i]);
    else
      printf("#");
  }
  for(int i=0;i<cl;i++)
  {
    if((c[i]>='a')&&(c[i]<='z'))
      printf("%c",c[i]-32);
    else
      printf("%c",c[i]);
  }
}