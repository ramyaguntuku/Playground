#include<iostream>
using namespace std;
struct student
{
 int rn,s1,s2,s3,s4,s5;
  int avg;
};
int main()
{
  //Type your code here.
  int i,n;
  cout<<"STUDENT MARKSHEET USING STRUCTURES";
  cout<<"\nEnter the no of students";
  cin>>n;
  struct student s[n];
  for(i=0;i<n;i++)
  {
    cin>>s[i].rn>>s[i].s1>>s[i].s2>>s[i].s3>>s[i].s4>>s[i].s5;
  }
  cout<<"\nrn s1 s2 s3 s4 s5 avg grade";
  for(i=0;i<n;i++)
  {
    s[i].avg=(s[i].s1+s[i].s2+s[i].s3+s[i].s4+s[i].s5)/5;
    cout<<"\n"<<s[i].rn<<" "<<s[i].s1<<" "<<s[i].s2<<" "<<s[i].s3<<" "<<s[i].s4<<" "<<s[i].s5<<" "<<s[i].avg<<" "<<i+1;
    
  }
  
}