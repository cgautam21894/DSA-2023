package topinterview150.Array;

import java.util.*;

public class HIndex {
    public static void main(String[] args) {
        HIndex obj = new HIndex();
        System.out.println(obj.hIndex(new int[]{3,0,6,1,5}));
    }

//    public int hIndex(int[] citations) {
//        Arrays.sort(citations); // Sort the citations array in ascending order
//
//        int n = citations.length;
//        int hIndex = 0;
//
//        for (int i = n - 1; i >= 0; i--) {
//            int papersWithCurrentCitation = n - i;
//
//            if (citations[i] >= papersWithCurrentCitation) {
//                // The current citation is greater than or equal to the number of papers with that citation
//                hIndex = papersWithCurrentCitation; // Update the H-index
//            } else {
//                // We have found the maximum H-index
//                break;
//            }
//        }
//
//        return hIndex;
//    }

    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1]; // Array to store the count of citations

        // Count the number of papers with citations
        for (int citation : citations) {
            if (citation >= n) {
                count[n]++; // Increment the count of papers with citations >= n
            } else {
                count[citation]++; // Increment the count of papers with citations = citation
            }
        }

        int total = 0; // Total count of papers with citations >= current citation
        for (int i = n; i >= 0; i--) {
            total += count[i];

            if (total >= i) {
                return i; // Return the maximum h-index found
            }
        }

        return 0; // No valid h-index found
    }
}
