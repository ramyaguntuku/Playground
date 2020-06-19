#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,i,x,c=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    x=pow(11+c,2);
    cout<<x<<" ";
    c=c+4;
  }
}
  