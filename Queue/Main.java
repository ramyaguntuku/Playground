#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,i,s=0,a[100],t;
  cin>>n>>m;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]>1 && a[i]+a[i+1]<=m)
    {
      i++;
    }
    else if(a[i]>m && i<n-1)
    {
      t=a[i]-m;
    }
    s++;
  }
    cout<<s;
      
}