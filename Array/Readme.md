【题目类型总结】

1. 查找是否有重复的int在array里面。
2. 查找是否在int array里面有两个数合为一个值。
3. arraylist和list不太一样，ArrayList需要用method，array可以在直接访问。

【高频率的method】

.length
1. int[] array = new int[]{-1,-1};
2. HashMap<Integer, Integer> store = new HashMap<Integer, Integer>(); 【类型，Character,String自己选】
3. List<List<Integer>> list = new ArrayList<>(); 【前面的是interface，后面的是具体的实现类】

【知识点&易错点】

1. 多多运用hashmap的方便之处。
2. “modifying the input array in-place with O(1) extra memory.” 注意memory的space complexity的使用。
3. Binary Search 里面的临界值的界定，大于等于以及小于的界定需要仔细考虑，数字会落在哪一边。
4. HashMap 如果用来记录key的重复数量，就把数量记录在value里面。
5. 在method的创建类【public List<Integer> pascal (List<Integer> list) {}】可以放interface，input也可以放interface。
