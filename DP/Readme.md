【方法精髓】

==== 在于怎么考虑创造符合题目的Matrix ===

目的：

1. 为了方便递归或者创建树状图。
2. 能一目了然时间复杂度和空间复杂度。
3. 方便提炼题干和题目的维度。

【方法意义】

1. 利用recursion的思想考虑好base case的情况，并且确认是找max还是min。
2. for loop一般都是从0到N，需要存下之前运算的结果。
3. 利用单独分开考虑的思想，从结果出发将一个情况单独出来考虑，将所有东西分成一个和其他，同时由于recursion，其他又是由一个和其他组成，又可以利用之前的结果。换句话说，每层只考虑一种情况，然后找到max或者min，其他的交给已经得到的结果。

【总结】

1. 所以在每一层for loop只需要O(1)的步数来利用之前的结果，然后进入下一层。当然这个O（1）也有可能是O（n）或者其他。
2. 如果是recursion，可以从后往前考虑，如果是for，从后往前考虑，从前往后写。

【题目类型总结】


【高频率的method】


【知识点&易错点】

