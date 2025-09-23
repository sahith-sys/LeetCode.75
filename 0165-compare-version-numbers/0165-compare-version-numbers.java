class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int length = Math.max(arr1.length, arr2.length);
        for(int i=0; i<length; i++){
            Integer num1 = i<arr1.length ? Integer.parseInt(arr1[i]) : 0;
            Integer num2 = i<arr2.length ? Integer.parseInt(arr2[i]) : 0;
            int compare = num1.compareTo(num2);
            if(compare!=0){
                return compare;
            }
        }
        return 0;
    }
}