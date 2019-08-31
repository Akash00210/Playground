#include<stdio.h>

int main()
{
  //Type your code here
  long n;
  int r=0,num=0,i=0;
  scanf("%ld",&n);
  while(n>0)
  {
    r=n%10;
    num=num+r*(pow(2,i));
    i++;
    n=n/10;
  }
  int octal=0;
  i=1;
  while(num>0)
  {
    octal=octal+(num%8)*i;
    i=i*10;
    num=num/8;
  }
  printf("%d",octal);
}