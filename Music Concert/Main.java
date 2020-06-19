#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n,i,a[10],c=0,c1=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      c++;
    }
    else
    {
      c1++;
    }
  }
  cout<<c1<<"\n"<<c;
  return 0;
}