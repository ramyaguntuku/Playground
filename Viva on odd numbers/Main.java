#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,c=0;
  float r=0;
  while(cin>>n)
  {
  if(n>0 && n%2!=0)
  {
    r=r+1;
    
  }
  else if(n>0 && n%2==0)
  {
    r=r-0.5;
  }
  else if(n<0)
    { 
      r=r-1;
    }
  }
  cout<<r;
}