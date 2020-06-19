#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[20],l,i,k,t;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for( i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>l;
  if(l>n+1 || l<=0)
  {
    cout<<"Invalid Input\n";
  }
  else
  { 
    cout<<"Enter the value to insert\n";
  cin>>k;
  for(i=n;i>=l;i--)
  {
    a[i]=a[i-1];
  }
  a[l-1]=k;
  n++;
  
  cout<<"Array after insertion is\n";
  for(i=0;i<n;i++)
    cout<<a[i]<<"\n";
  }
}