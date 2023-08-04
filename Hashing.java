import java.util.*;

class Hash {
    public void MajorityElement(int num[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = num.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(num[i])) {
                map.put(num[i], map.get(num[i]) + 1);
            } else {
                map.put(num[i], 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n/4) {
                System.out.println(key);
            }
        }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        int num[] = { 1, 2};
        Hash hash = new Hash();
        hash.MajorityElement(num);
    }
}

output
  1
  2
