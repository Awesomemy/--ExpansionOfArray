# --ExpansionOfArray
数组扩容
也是双指针法,只不过"扩容"时是从后向前填充,这样时间复杂度是O(n)

    若是从前往后填充,时间复杂度就是O(n^2)了,因为每次添加元素都要将添加元素之后的所有元素整体向后移动
    
    其实很多数组填充类的问题，其做法都是先预先给数组扩容带填充后的大小，然后在从后向前进行操作。
    
    这么做有两个好处：
    (1)不用申请新数组;
    (2)从后向前填充元素，避免了从前向后填充元素时，每次添加元素都要将添加元素之后的所有元素向后移动的问题。
