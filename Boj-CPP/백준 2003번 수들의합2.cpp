#include<iostream>
#include<vector>
using namespace std;
int n,m;
vector<int> v;
int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cin>>n>>m;
	v.resize(n);
	for(int i=0; i<n; i++)
		cin>>v[i];
	int left(0),right(0),sum(v[0]),ans(0);
	while(left<=right && right<n)
	{
		if(sum<m)
		{
			right++;
			sum+=v[right];	
		}else if(sum==m)
		{
			ans++;
			right++;
			sum+=v[right];	
		}else if(sum>m)
		{
			sum-=v[left];
			left++;	
			if(left>right && left<n)
			{
				right=left;
				sum=v[left];
			} 
		}	
	}
	cout<<ans;	
}
