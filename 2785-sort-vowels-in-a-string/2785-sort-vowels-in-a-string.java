class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        List<Character> vowelList = new ArrayList<>();

        // Step 1: collect all vowels
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelList.add(c);
            }
        }

        // Step 2: sort vowels by ASCII value
        Collections.sort(vowelList);

        // Step 3: put sorted vowels back
        StringBuilder result = new StringBuilder();
        int j = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                result.append(vowelList.get(j++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}