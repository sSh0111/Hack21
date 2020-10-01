#include<iostream>
using namespace std;

class test {	
	public:		
		void sum_avg(int arr[], int sz) {
			int sum = 0 ;
			float avg = 0;
			for( int i = 0 ; i < sz ; i++) {
				sum += arr[i];
			}
			
			avg = ((float)sum)/ sz;
			
			cout << "Sum of the entered numbers is : " << sum << endl << "Average of the entered numbers is : " << avg << endl;
		}
		
		void search_array(int arr[], int sz) {
			int i, srch, flag = 0;
			cout << "Enter an element to be searched : ";
			cin >> srch;
			for( i = 0 ; i < sz; i++) {
				if (arr[i] == srch) {
					cout << "Element present in the array." << endl;
					flag = 1;
					break;
				}
				else
					flag = 0;					
			}
			if(flag == 0) 
				cout << "Element not found." << endl;
		}
		
		void sort_array(int arr[], int sz) {
			int i, j, temp;
			for( i = 0 ; i < sz ; i++) {
				for(j = i + 1 ; j < sz; j++) {
					if (arr[j] < arr[i]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			
			cout << "The Ascending order Sorted array is : ";
			for(i = 0 ; i < sz ; i++) {
				cout << arr[i] << " ";
			}
			cout << endl;
			cout << "The Descending order array is : ";
			for(i = sz - 1 ; i >= 0; i--)
				cout << arr[i] << " ";
			cout << endl;
		}
		
		void duplicates(int arr[], int sz) {
			int i, j;
			for( i = 0 ; i < sz ; i++) {
				for( j = i + 1 ; j < sz ; j++) {
					if(arr[j] == arr[i])
						arr[j] = -1;
				}
			}
			
			cout << "Tha array ater duplicate removal is : ";
			for( i = 0 ; i < sz ; i++) {
				if(arr[i] != -1)
					cout << arr[i] << " ";
			}
			cout << endl;
		}
		
		bool prime_check(int n) {
			int i, c = 0;
			for( i = 1 ; i <= n ;i++) {
				if(n % i == 0) 
					c++;
			}
			if(c == 2)
				return true;
			else
				return false;
		}
		
		void prime(int arr[], int sz) {
			int i;
			cout << "The Prime number in the entered numbers are : ";
			for( i = 0 ; i < sz ;i++) {
				if (prime_check(arr[i]) == true)
					cout << arr[i] << " ";
			}
			cout << endl;
		}
};

int main() {
	int n, x, i;
	cout << "Enter a size of the array : ";
	cin >> n;
	int arr[n];
	cout << endl << "Enter " << n << " elements for the array : " << endl;
	for( int i = 0 ; i < n ; i++) {
		cin >> x;
		arr[i] = x;
	}
	
	test obj;
	obj.sum_avg(arr, n);
	obj.search_array(arr, n);
	obj.sort_array(arr, n);
	obj.duplicates(arr, n);
	obj.prime(arr, n);
	
	return 0;
}
