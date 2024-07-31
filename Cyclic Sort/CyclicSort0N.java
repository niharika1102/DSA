class CyclicSort0N {
    public static void main(String[] args) {
        //0 - N
        int arr[] = {4,2,3,5,1,0};
        int i = 0;
        
        while (i < arr.length) {
            int actual = arr[i];
            
            if (arr[i] != arr[actual]) {
                int temp = arr[i];
                arr[i] = arr[actual];
                arr[actual] = temp;
            }
            
            else {
                i++;
            }
        }
        
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        

    }
}
