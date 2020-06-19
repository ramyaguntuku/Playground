#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,s[10],s1[10],a[10][10],t,p=0,x=0,m;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
 cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  { 
    t=0;
    for(j=0;j<c;j++)
    {
      t=t+a[i][j];
    }
   s1[i]=t;
  }
   for(i=0;i<r;i++)
  { 
    cout<<s1[i]<<" ";
   }
  m=s1[0];
  for(i=0;i<r;i++)
  { 
    if(s1[i]>m)
    {
    m=s1[i];
    p=i;
    }
   }
  
  cout<<"\nRow "<<p+1<<" has maximum sum";
  cout<<"\n";
  cout<<"Sum of columns is ";
  for(j=0;j<c;j++)
  {
    t=0;
    for(i=0;i<r;i++)
    {
    
      t=t+a[i][j];
    }
   s[j]=t;
  }
   for(i=0;i<c;i++)
  { 
    cout<<s[i]<<" ";
  }
  m=s[0];
  for(i=0;i<c;i++)
  { 
    if(s[i]>m)
    {
    m=s[i];
    x=i;
    }
   }
  cout<<"\nColumn "<<x+1<<" has maximum sum";
  cout<<"\n";
}