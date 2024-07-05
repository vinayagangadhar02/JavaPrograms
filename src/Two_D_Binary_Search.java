//import java.util.Arrays;
//
//public class Two_D_Binary_Search {
//    public int[] search(int[][] arr,int target,int r,int c) {
//        int cstart = 0;
//        int cend = c - 1;
//        int cmid = 0;
//        cmid = cstart + (cend - cstart) / 2;
//        int rstart = 0;
//        int rend = r - 1;
//        int rmid = 0;
//        while (rstart < (rend-1)) {
//            rmid = rstart + (rend - rstart) / 2;
//            if (arr[rmid][cmid] == target) {
//             return new int[]{rmid,cmid};
//            }
//           else if(arr[rmid][cmid]> target) {
//               rstart=rmid;
//            }
//           else{
//               rend=rmid;
//            }
//        }
//
//       if(target==arr[rstart][cmid]){
//           return new int[]{rstart,cmid};
//
//       }
//        if(target==arr[rstart+1][cmid]){
//            return new int[]{rstart+1,cmid};
//
//        }
//       if(target<=arr[rstart][cmid-1]){
//
//       }
//
//    }
//}