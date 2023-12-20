import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    public static void main(String[] args) {

        String s[] = { "tea", "eat", "tan", "ate", "nat", "bat" };
        Map<String, List<String>> m = new HashMap<>();
        List<List<String>> final1 = new ArrayList<>();

        for (String str : s) {
            char[] p = str.toCharArray();
            Arrays.sort(p);
            String sortedStr = new String(p);

            if (!m.containsKey(sortedStr)) {
                m.put(sortedStr, new ArrayList<>());
            }

            m.get(sortedStr).add(str);
        }

        Iterator<Map.Entry<String, List<String>>> it = m.entrySet().iterator();
        while (it.hasNext()) {
            final1.add(it.next().getValue());
        }

        System.out.println(final1);
    }
}