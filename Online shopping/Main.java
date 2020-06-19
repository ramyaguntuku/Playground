#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a1,d1,s1,a2,d2,s2,a3,d3,s3;
  float t1,t2,t3;
  cin>>a1>>d1>>s1>>a2>>d2>>s2>>a3>>d3>>s3;
  t1=a1-(a1*d1)/100+s1;
   t2=a2-(a2*d2)/100+s2;
   t3=a3-(a3*d3)/100+s3;
  cout<<"In Flipkart Rs."<<t1<<"\n";
  cout<<"In Snapdeal Rs."<<t2<<"\n";
  cout<<"In Amazon Rs."<<t3<<"\n";
  if((t1<=t2)&&(t1<=t3))
    cout<<"He will prefer Flipkart";
  else if(t2<=t3)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}   
 