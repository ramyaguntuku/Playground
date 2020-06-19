#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,i,j,c=0;
  cin>>n;
  for(i=0;i<n;i=i+1)
  {
    for(j=1;j<n;j++)
    {
      if(i%2==0)
      {
      cout<<i+1;
      if(j==n-1)
      cout<<i+2;
      }
      else if(i%2!=0 )
      {
        if(j==1)
        {
          cout<<i+2;
        }
        cout<<i+1;
        
        
      }
        
    }
    cout<<"\n";
  }  
    return 0;
    return 0;
}