#include <iostream>
#include<cstring>
int main()
{
char str[100], rev[100];     
int count = 0, end, i,s;    
//Your code goes here 
  std::cin.getline(str,20);
  s=strlen(str);
  for(i=s-1;i>=0;i--)
  { 
std::cout<<str[i];
}
}