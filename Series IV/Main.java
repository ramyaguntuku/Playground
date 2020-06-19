#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,o;
  cin>>n;
  for(i=1;i<=n;i++)
      {
        if(i%2==0)
        {
          o=i*i-2;
          cout<<o<<" ";
        }
    else
    {
      o=i*i-1;
      cout<<o<<" ";
    }
  }
}