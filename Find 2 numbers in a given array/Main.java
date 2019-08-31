#include<stdio.h>
int main()
{
  	//type your code here
  int a[20],n,num1,num2;
  int flag1=0,flag=0;
  scanf("%d",&n);
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d\n%d",&num1,&num2);
  for(int i=0;i<n;i++)
  {
    if((a[i]==num1)){
      printf("Element 1 index = %d\n",i);
      flag=1;}
}
  if(flag==0)
    printf("Element 1 index = -1\n");
 // printf("\n");
   for(int i=0;i<n;i++)
  {
    if((a[i]==num2)){
      printf("Element 2 index = %d",i);
      flag1=1;}
}
  if(flag1==0)
    printf("Element 2 index = -1");
}