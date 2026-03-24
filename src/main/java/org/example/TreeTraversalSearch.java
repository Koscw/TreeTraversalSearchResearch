package org.example;

import java.util.ArrayList;

//Tree Traversal
public class TreeTraversalSearch {
    public static void main(String[] args) {
        int arr[] = {1,4,2,3,6,7,9,6};
        System.out.println("The searched value indexes in array are equal "+ TreeTraversalSearch(6,arr));
    }


    static ArrayList TreeTraversalSearch(int searchNum, int[] arr){
        int searchIndex = -1;
        int searchIndexCntr = 0;

        ArrayList<Integer> searchIndexArrList = new ArrayList<>();
        for(int i = 0; i<arrayLength(arr); i++){
            if(searchNum == arr[i]){
                searchIndex = i;
                searchIndexArrList.add(searchIndex);
                searchIndexCntr+=1;
            }

        } if(searchIndexCntr!=0){
            return searchIndexArrList;
        }
        else{
            searchIndexArrList.add(searchIndex);
            return searchIndexArrList;
        }

    }
    static int arrayLength(int[] arr){
        int cnt = 0;
        try{
            while(true){
                int number = arr[cnt];
                cnt+=1;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            return cnt;
        }catch(NullPointerException e){
            return -1; //Array is null
        }
    }
}
