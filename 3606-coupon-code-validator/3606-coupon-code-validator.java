class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, Integer> order = Map.of("electronics", 0, "grocery", 1, "pharmacy", 2, "restaurant", 3);
        List<String[]> valid = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (code[i] != null && !code[i].isEmpty() && code[i].matches("^[A-Za-z0-9_]+$") &&
                order.containsKey(businessLine[i]) && isActive[i]) {
                valid.add(new String[]{businessLine[i], code[i]});
            }
        }
        valid.sort((a, b) -> {
            int cmp = Integer.compare(order.get(a[0]), order.get(b[0]));
            return cmp != 0 ? cmp : a[1].compareTo(b[1]);
        });
        return valid.stream().map(a -> a[1]).toList();
    }
}