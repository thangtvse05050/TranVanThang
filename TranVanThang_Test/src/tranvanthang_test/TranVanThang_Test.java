/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranvanthang_test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author asus
 */
public class TranVanThang_Test {

    /**
     * @param args the command line arguments
     */
    public static String longestCommonPrefix(String[] strs) {
        int strsLength = strs.length;
        if (strsLength == 0) {
            return "";
        }
        int size = strs[0].length();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            char ch = strs[0].charAt(i);
            boolean matched = true;
            for (int j = 1; j < strsLength; j++) {
                if (i >= strs[j].length() || ch != strs[j].charAt(i)) {
                    matched = false;
                    break;
                }
            }
            if (!matched) {
                break;
            }
            sb.append(ch);
        }

        return sb.toString();
    }

    static void printSubsets(int nums[]) {
        int length = nums.length;
        for (int i = 0; i < (1 << length); i++) {
            System.out.print("[ ");
            int m = 1;
            for (int j = 0; j < length; j++) {
                if ((i & m) > 0) {
                    System.out.print(nums[j] + " ");
                }
                m = m << 1;
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        String[] str = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: ");
        System.out.println(longestCommonPrefix(str));
        int nums[] = {1, 2, 3};
        System.out.println("Subset: ");
        printSubsets(nums);
    }

}
