#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s1,s2,s3;
  cin>>s1>>s2;
  int i;
  int n=s1.length();
  for(i=n-1;i>=0;i--)
  { 
    s3=s3+s1[i];
}
if(s2==s3)
{
  cout<<"It is correct";
}
  else
    cout<<"It is wrong";
}