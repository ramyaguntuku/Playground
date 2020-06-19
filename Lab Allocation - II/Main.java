#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  int l1,l2,l3;
  char ch[2];
  cin>>l1>>l2>>l3>>ch;
  if(strcmp(ch,"L1")==0)
  {
    if(l2<l3)
      cout<<"L2";
    else
      cout<<"L3";
  }
  else if(strcmp(ch,"L2")==0)
  {
    if(l1<l3)
      cout<<"L1";
    else
      cout<<"L3";
  }
  else if(strcmp(ch,"L3")==0)
  {
    if(l1<l2)
      cout<<"L1";
    else
      cout<<"L2";
  }
}