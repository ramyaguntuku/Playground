#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
   char s[100];
  gets(s);
  int c=0;
  for(int i=0;s[i]!='\0';i++)
  {
      if(s[i]==' ')
       c++;
  }
  if(c<=10)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
}