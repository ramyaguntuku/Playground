#include<iostream>
#include<math.h>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int order(int n) 
{ 
    int x = 0; 
    while (n) 
    { 
        x++; 
        n = n/10; 
    } 
    return x; 
} 
int arm(int n)
{
    //Your code goes here
  int i=0,k,s;
  s=order(n);
  while(n>0)
  {
   k=n%10;
    i=i+power(k,s);
    n=n/10;
  }
 
    return i;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==n)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}