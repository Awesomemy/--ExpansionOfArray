package test1;

import java.util.Scanner;

/*
给定一个字符串 s，它包含小写字母和数字字符，请编写一个函数，将字符串中的字母字符保持不变，而将每个数字字符替换为number。

例如，对于输入字符串 "a1b2c3"，函数应该将其转换为 "anumberbnumbercnumber"。

对于输入字符串 "a5b"，函数应该将其转换为 "anumberb"

输入：一个字符串 s,s 仅包含小写字母和数字字符。

输出：打印一个新的字符串，其中每个数字字符都被替换为了number

样例输入：a1b2c3

样例输出：anumberbnumbercnumber

数据范围：1 <= s.length < 10000
 */
public class ReplaceNumber {
    /*
    也是双指针法,只不过"扩容"时是从后向前填充,这样时间复杂度是O(n)
    若是从前往后填充,时间复杂度就是O(n^2)了,因为每次添加元素都要将添加元素之后的所有元素整体向后移动
    其实很多数组填充类的问题，其做法都是先预先给数组扩容带填充后的大小，然后在从后向前进行操作。
    这么做有两个好处：
    (1)不用申请新数组;
    (2)从后向前填充元素，避免了从前向后填充元素时，每次添加元素都要将添加元素之后的所有元素向后移动的问题。
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder bs = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            int num = s.charAt(i)-'0';
            if (num>=0 && num<=9){
                bs.append("number");
            } else{
                bs.append(s.charAt(i));
            }
        }
        System.out.println(bs);
    }
}
