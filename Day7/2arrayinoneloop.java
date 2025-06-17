package Day7;

public class 2arrayinoneloop {
    #include <stdio.h>

int main() {
    int rows = 2, cols = 3;
    int arr[2][3];

    for (int i = 0; i < rows * cols; i++) {
        int r = i / cols;
        int c = i % cols;

        printf("Enter value for arr[%d][%d]: ", r, c);
        scanf("%d", &arr[r][c]);
    }

    // Print the array
    printf("The 2D array is:\n");
    for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
            printf("%d ", arr[r][c]);
        }
        printf("\n");
    }

        return 0;
    }

}
