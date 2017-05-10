package search.symbolTable;

import common.OrderedST;

import static common.StdIn.read;

/**
 *
 * Created by cehn on 2017/5/10.
 */
public class Q_3_1_1 {

    // A+ 4.33 A 4.00 A- 3.67 B+ 3.33 B 3.00 B- 2.67 C+ 2.33 C 2.00 C- 1.67 D 1.00 F 0.00

    public static void main(String[] args) {
        OrderedST<String, Double> orderedST = new OrderedST<>();
        orderedST.put("A+", 4.33);
        orderedST.put("A", 4.00);
        orderedST.put("A-", 3.67);
        orderedST.put("B+", 3.33);
        orderedST.put("B", 3.00);
        orderedST.put("B-", 2.67);
        orderedST.put("C+", 2.33);
        orderedST.put("C", 2.00);
        orderedST.put("C-", 1.67);
        orderedST.put("D", 1.00);
        orderedST.put("F", 0.00);

        // 从文件中读取成绩 输出评级
        Double[] input = read("search/symbolTable/Q_3_1_1_input.txt", Double.class);
        for (Double d : input) {
            orderedST.rankOfValue(d);
        }
    }

}
