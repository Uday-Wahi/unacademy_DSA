package ARRAYS;

import java.util.ArrayList;

public class leadersInArray {

    // grepper leaders in array java
    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> leadersArr = new ArrayList<>();
        int curLeader = arr[arr.length - 1];
        leadersArr.add(curLeader);
        for (int i = arr.length - 1; i > 0; i--)
            if (arr[i - 1] > curLeader) {
                curLeader = arr[i - 1];
                leadersArr.add(curLeader);
            }
        return leadersArr;
    }
    // end grepper

    public static void main(String[] args) {
        // int arr[] = { 7, 2, 6, 8, 4, 3, 1 };
        int arr[] = { 2, 7, 6, 1, 4, 3 };
        ArrayList<Integer> ans = leaders(arr);
        for (int i = ans.size() - 1; i >= 0; i--)
            System.out.print(ans.get(i) + " ");
    }
}
