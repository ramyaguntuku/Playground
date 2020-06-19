#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c;
  cin>>n;
  if(n<=200)
  {
    c=n*0.5;
  }
  else if(n<=400)
  {
    c=(n*0.65)+100;
  }
  else if(n<=600)
  {
    c=(n*0.80)+200;
  }
  else if(n>600)
  {
    c=(n*1.25)+425;
  }
  cout<<"Rs."<<c;
}
