package common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * standard input
 * Created by cehn on 2017/5/10.
 */
public class StdIn {

    public static String[] read(String fileName) {
        InputStream is = StdIn.class.getClassLoader().getResourceAsStream(fileName);
        String[] result = new String[0];
        try {
            if (null != is) {
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line;
                while (null != (line = br.readLine())) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = line;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] read(String fileName, Class<T> clazz) {
        InputStream is = StdIn.class.getClassLoader().getResourceAsStream(fileName);
        Object[] result = new Object[0];
        try {
            if (null != is) {
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line;
                while (null != (line = br.readLine())) {
                    Constructor<T> constructor = clazz.getConstructor(String.class);
                    constructor.setAccessible(true);
                    constructor.newInstance(line);
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = line;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T[]) result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(read("search/symbolTable/Q_3_1_1_input.txt")));
        System.out.println(Arrays.toString(read("search/symbolTable/Q_3_1_1_input.txt", Double.class)));
    }


}
