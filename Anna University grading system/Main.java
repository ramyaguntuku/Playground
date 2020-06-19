#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m;
  cin>>m;
  if(m==100)
    cout<<"S";
  else if(m<100 && m>=90)
    cout<<"A";
  else if(m<=89 && m>=80)
    cout<<"B";
   else if(m<=79 && m>=70)
    cout<<"C";
   else if(m<=69 && m>=60)
    cout<<"D";
   else if(m<=59 && m>=50)
    cout<<"E";
   else if(m<50)
    cout<<"F";
  else
    cout<<"Invalid Input";
}