#include<iostream>
using namespace std;
int main()
{
  int n,i,c=0;
 cin>>n;
  for(i=2;i<=n;i++)
  {
    if(n%i==0)
    {
      c++;
    }
  }
  if(c==1)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}