#include<iostream>
using namespace std;
int main()
{
  int n,i,j,c=1,k=0,c1;
  cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<2*n-1;j=j+1)
    {
      if(j>=1+2*i)
        cout<<" ";
      else if((j+1)%2==0)
        cout<<"*";
      else if(i%2==0)
      { 
        cout<<c;
      c++;
        k=c+1+i;
      }
      else
      {
        cout<<k;
        k--;
        c++;
    }
    }
    cout<<"\n";
  }
    
}
