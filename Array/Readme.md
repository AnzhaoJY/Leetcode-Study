题目类型总结：

1. 查找是否有重复的int在array里面。
2. 查找是否在int array里面有两个数合为一个值。

高频率的method

.length
int[] array = new int[]{-1,-1};\n
HashMap<Integer, Integer> store = new HashMap<Integer, Integer>(); 【类型，Character,String自己选】

知识点&易错点

1. 多多运用hashmap的方便之处。
2. “modifying the input array in-place with O(1) extra memory.” 注意memory的space complexity的使用。
3. Binary Search 里面的临界值的界定，大于等于以及小于的界定需要仔细考虑，数字会落在哪一边。
