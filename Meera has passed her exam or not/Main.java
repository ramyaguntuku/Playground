#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int  n,i,a[1000],k,c=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>k;
  for(i=0;i<n;i++)
  {
    if(a[i]==k)
    {
      cout<<"She passed her exam";
      c++;
    }
   
  }
     if(c==0)
      cout<<"She failed";
  }
