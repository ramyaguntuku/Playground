#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  int r;
  string s;
  cin>>s>>r;
  if(r==1)
  {
    if(s=="front")
    {
      cout<<"Left Handed";
    }
    else
    {
      cout<<"Right Handed";
    }
  }
    else
    {
      if(s=="front")
    {
      cout<<"Right Handed";
    }
    else
    {
      cout<<"Left Handed";
    }
  }
}