class primeIndex {
  public static void main(String args[]) {
    int arr[] = { 2, 4, 5, 6,3, 10, 17 };
    int count = 0, index = -1;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 1; j <= arr[i] / 2; j++) {
        if (arr[i] % j == 0) {
          count = count + 1;
          index = i;
        }
      }
      if (count == 1) {
        System.out.println(index);
      }
      count = 0;
    }
  }
}