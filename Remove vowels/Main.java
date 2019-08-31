#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%[^\n]s", str);
  
  //Type your code here
  int l=strlen(str);
  for(int i=0;i<l;i++)
  {
    if((str[i]=='a')||(str[i]=='A')||(str[i]=='E')||(str[i]=='e')||(str[i]=='i'))
      continue;
    else if((str[i]=='I')||(str[i]=='o')||(str[i]=='O')||(str[i]=='U')||(str[i]=='u'))
      continue;
    else printf("%c",str[i]);
  }
  return 0;
}