#include<iostream>
using namespace std;

int main()
{
	int n;
	cin>>n;
	for(int i=0; i<n; i++)
	{
		for(int a=0; a<n-i-1; a++)
		cout<<" ";
		for(int a=0; a<2*i+1; a++)
		cout<<"*";
		cout<<endl;
	}
	for(int i=1; i<n; i++)
	{
		for(int a=0; a<i; a++)
		cout<<" ";
		for(int a=0; a<2*(n-i)-1; a++)
		cout<<"*";
		cout<<endl;
	}
}
