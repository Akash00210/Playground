#include<stdio.h>
#include<string.h>
int main()
{
	//type your code here
  char a[25];
  int count=1;
  scanf("%s",a);
  int l=strlen(a);
  if(l>20)
    printf("Invalid Input");
  else{
  for(int i=0;i<l;i++)
  {
    if(a[i]==a[i+1])
      count++;
    else{
      printf("%c%d",a[i],count);
      count=1;}}
}}