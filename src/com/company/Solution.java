package com.company;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
В классе Solution исправить пару методов equals/hashCode в соответствии с правилами реализации этих методов(детали уточни у своего любимого поисковика).
Обе строки first и last должны принимать участие в сравнении с помощью метода equals и вычислении hashcode.
Метод main не участвует в тестировании.
*/
public class Solution {
public final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = first != null ? first.hashCode() : 0;
        return result + (last != null ? last.hashCode() : 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        if (!(obj instanceof Solution))
            return false;
        Solution other = (Solution) obj;
        if (!Objects.equals(first, other.first))
            return false;
        if (!Objects.equals(last, other.last))
            return false;
        return true;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("hh", "Duck"));
        System.out.println(s.contains(new Solution(null, "Duck")));
    }
}
