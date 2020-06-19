#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,r,x;
  cin>>m>>n>>r;
  x=pow(m,n);
  if(r<=x)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}