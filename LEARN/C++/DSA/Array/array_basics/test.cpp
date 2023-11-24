#include <iostream>

using namespace std;

double sqrt(double n) {
  double low = 0;
  double high = n;
  while (low <= high) {
    double mid = (low + high) / 2;
    if (mid * mid == n) {
      return mid;
    } else if (mid * mid < n) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }
  return low;
}

double precised(double n, int precision, double temp_sol) {
  double factor = 1;
  double ans = temp_sol;

  for (int i = 0; i < precision; i++) {
    factor = factor / 10;

    for (double j = ans; j * j <= n; j = j + factor) {
      ans = j;
    }
  }

  return ans;
}

int main() {
  double n, ans_1, ans_2;
  cout << "Enter a number: ";
  cin >> n;

  ans_1 = sqrt(n);
  ans_2 = precised(n, 2, ans_1);

  cout << "The square root of " << n << " is " << ans_1 << endl;
  cout << "The square root of " << n << " in precised form is " << ans_2 << endl;

  return 0;
}
