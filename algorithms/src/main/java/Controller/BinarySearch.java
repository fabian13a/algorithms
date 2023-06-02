/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author fabia
 */
public class BinarySearch {

    int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Si el elemento está presente en el medio
            if (arr[mid] == target) {
                return mid;
            }

            // Si el elemento es mayor, ignora la mitad izquierda del arreglo
            if (arr[mid] < target) {
                left = mid + 1;
            } // Si el elemento es menor, ignora la mitad derecha del arreglo
            else {
                right = mid - 1;
            }
        }

        // Si el elemento no está presente en el arreglo
        return -1;
    }

    public void Binaryllamar() {
        BinarySearch binarySearch = new BinarySearch();
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;
        int result = binarySearch.binarySearch(arr, target);
        if (result == -1) {
            System.out.println("El elemento no se encuentra en el arreglo.");
        } else {
            System.out.println("El elemento se encuentra en el índice " + result + ".");
        }

    }
}
