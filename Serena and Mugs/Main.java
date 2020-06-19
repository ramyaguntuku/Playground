#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s=0,m,a[10];
  cin>>n>>m;
  for(int i=0;i<n;i++)
  {   cin>>a[i];
  s=s+a[i];
}
  if(s<=m)
    cout<<"YES";
  else
    cout<<"NO";

  
}