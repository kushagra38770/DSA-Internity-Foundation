#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int arr[] = {1, 2, 3, 5, 8, 9, 4};
	int length = sizeof(arr)/sizeof(arr[0]); //sizeof()
	cout<<"Length of array: "<<length;
	return 0;
}

//OUTPUT
Length of array: 7
