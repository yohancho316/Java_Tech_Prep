//package Technical_Interviews;
//
//
//public class QualComm_Interview {
//
//    public static class Numbers {
//
//        // Properties
//        ArrayList<Integer> nums = new ArrayList<Integer>();
//        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
//        int pos;
//        int size = 0;
//
//        // Method # 1
//        public static void insert(int val) {
//
//            if(map.hasKey(val)) {
//                map.add(val, true);
//            } else {
//                map.add(val, false);
//            }
//
//
//            nums.insert(val);
//            map.add(val, pos);
//            pos++;
//            ++size;
//
//        }
//
//        // Constructor
//        public static Numbers() {
//
//
//            ArrayList<Integer> nums = new ArrayList<Integer>();
//            HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//            size = 0;
//        }
//
//        // Method # 2
//        public static boolean sumExists(int target) {
//
//
//
//
//            // if target > Integer.maxInt
//
//            // Check if Size is Equal to 0
//            if(size == 0) throw new Exception("Hey No Numbers Exist Currently. need to add numbers to the collection");
//
//            // check if HashMap is empty
//            // Check if the ArrayList is empty
//            // Check if the Collection Objects are Null throw
//
//
//
//
//            for(Integer key : map.keySet()) {
//
//                int diff = target - key;
//
//                if(map.has(diff)) {
//
//                    if(diff == key && map.get(key) == true) {
//                        return true;
//                    } else if(diff != map.get(key)) {
//                        return true;
//                    } else {
//                        return false;
//                    }
//
//                }
//            }
//
//        }
//      	return false;
//    }
//
//
//    public static void main(String[] args) {
//
//
//
//
//    }
//}
