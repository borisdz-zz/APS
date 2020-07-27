package Auditoriski.Aud3;
//
//class DivideAndConquer {
//    //spojuvanje na dve sortirani nizi [l,mid], [mid+1,r]
//    //rezultatot e nova sortirana niza
//    void merge(int a[], int l, int mid, int r) {
//        int numel = r - l + 1;
//        int temp[] = new int[100]; //nova niza za privremeno cuvanjena sortiranite elementi
//        int i = l, j = mid + 1, k = 0;
//
//        while ((i <= mid) && (j <= r)) {
//            if (a[i] < a[j]) {
//                temp[k] = a[i];
//                i++;
//            } else {
//                temp[k] = a[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i <= mid) {
//            temp[k] = a[i];
//            i++;
//            k++;
//        }
//
//        while (j <= r) {
//            temp[k] = a[j];
//            j++;
//            k++;
//        }
//
//        for (k = 0; k < numel; k++) {
//            a[l + k] = temp[k];
//        }
//    }
//
//    void mergesort(int a[], int l, int r) {
//        if (l == r) {
//            return;
//        }
//
//        int mid = (l + r) / 2;
//        mergesort(a, l, mid);
//        mergesort(a, mid + 1, r);
//        merge(a, l, mid, r);
//    }
//}
//
//public class MergeSort {
//}
