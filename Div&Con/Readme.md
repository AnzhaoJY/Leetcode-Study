题目类型总结：

1. chip-test/ find majority【CT】类型，分为奇数偶数的情况，偶数pair分一半，奇数取一个test，剩下的变成偶数。
2. Kth order 里面的分成五个的情况。五个之中找medium需要六步，先是两两pair，两次比较得出两个偏大和偏小的数，再用剩下的一个分别和两个偏小的得出最小和第二小，worse case里面得确定那一个是不是一个大数，还得和两个大的依次比较，一共六步，最终确定medium。

高频率的method:

知识点&易错点:

1. 【CT】对于数字的pair，可以把一样的数字当成good，不一样为bad，只存一样中的一个下来，考虑worsecase，长度为n/2，再写一个trim的方法。
