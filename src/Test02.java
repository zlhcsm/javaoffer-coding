public boolean isIsomorphic2(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<Character, Character>();
        Set<Character> set = new HashSet<Character>();
        char c1, c2;
        for (int i = 0; i < s.length(); i++) {
            c1 = s.charAt(i);
            c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2)
                    return false;
            } else {
                if (set.contains(c2)) 
                    return false;
                else {
                    map.put(c1, c2);
                    set.add(c2);
                }
            }
        }
        return true;
    }
————————————————
版权声明：本文为CSDN博主「杜鲁门」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/bug_moving/article/details/52788409
