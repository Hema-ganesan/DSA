// class Solution {
//     public String reversePrefix(String word, char ch) {
//         char[] arr = word.toCharArray();
//         int idx = -1;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == ch) {
//                 idx = i;
//                 break;
//             }
//         }
//         if (idx == -1)
//             return word;
//         int i = 0, j = idx;
//         while (i < j) {
//             char temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//             i++;
//             j--;
//         }
//         return new String(arr);
//     }
// }
class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr=word.toCharArray();
        int last=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ch)
            {
                last=i;
                break;
            }
        }
        int first=0;
        while(first<last)
        {
            char temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        return new String(arr);
    }
}